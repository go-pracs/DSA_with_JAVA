package com.company;
/*
 * Open Hashing Technique
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    public DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    public int modASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for(sum = 0, i =0; i < word.length(); i++) {
            sum += ch[i];
        }
        return sum %  M;
    }

    public void insertHashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);

        if(hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        }
        else {
            hashTable[newIndex].add(word);
        }
    }

    public void displayHashTable() {
        if(hashTable == null) {
            System.out.println("\nHash Table does not exist.");
            return;
        }
        else {
            System.out.println("\n----------------HashTable----------------");
            for(int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }

    public boolean searchHashTable(String word) {
        int targetIndex = modASCIIHashFunction(word, hashTable.length);

        if(hashTable[targetIndex] != null && hashTable[targetIndex].contains(word)) {
            System.out.println("\n" + "\"" + word + "\" found in HashTable at location: " + targetIndex);
            return true;
        }
        else {
            System.out.println("\"" + word + "\" not found in Hashtable.");
            return false;
        }
    }

    public void deleteKeyHashTable(String word) {
        int targetIndex = modASCIIHashFunction(word, hashTable.length);
        if(searchHashTable(word)) {
            hashTable[targetIndex].remove(word);
            System.out.println("\n\"" + word + "\" deleted successfully.");
        }
        else {
            System.out.println("\"" + word + "\" not found in Hashtable.");
        }
    }
}
