package com.company;

public class Main {

    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.insert("AP");

        newTrie.search("AP");
        newTrie.search("APISAD");

        newTrie.deleteString("API");
        newTrie.deleteString("API");
        newTrie.deleteString("APIS");
        newTrie.deleteString("AP");
        newTrie.search("A");
    }
}
