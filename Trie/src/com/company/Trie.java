package com.company;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("The Trie has been created successfully!");
    }

    public void insert(String word) {
        TrieNode current = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println(word + " is successfully inserted in Trie.");
    }

    public boolean search(String word) {
        TrieNode current = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null) {
                System.out.println(word + " does not exist in Trie.");
                return false;
            }
            current = node;
        }
        if(current.endOfString) {
            System.out.println(word + " exists in the Trie!");
            return true;
        }
        else {
            System.out.println(word + " does not exist in the Trie. But it's a prefix of another string");
        }
        return current.endOfString;
    }

    //Delete method

    private boolean delete(TrieNode parent, String word, int index) {
        char ch = word.charAt(index);
        TrieNode current = parent.children.get(ch);
        boolean canThisNodeBeDeleted;

        if(current.children.size() > 1) {
            delete(current, word, index + 1);
            return false;
        }
        if(index == word.length() - 1) {
            if(current.children.size() >= 1) {
                current.endOfString = false;
                return false;
            }
            else {
                parent.children.remove(ch);
                return true;
            }
        }
        if(current.endOfString) {
            delete(current, word, index + 1);
            return false;
        }
        canThisNodeBeDeleted = delete(current, word, index + 1);
        if(canThisNodeBeDeleted) {
            parent.children.remove(ch);
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteString(String word) {
        if(this.search(word)) {
            delete(root, word, 0);
            System.out.println(word + " deleted successfully!");
        }
    }
}
