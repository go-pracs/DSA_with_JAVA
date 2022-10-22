package com.company;

import java.util.ArrayList;

/*
 * Closed Hashing (Open addressing) Technique
 * Double Hashing
 */
public class DoubleHashing {
    String[] hashTable;
    int usedCellNumber;

    public DoubleHashing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int simpleASCIIHashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum;
        for(sum = 0, i =0; i < word.length(); i++) {
            sum += ch[i];
        }
        return sum %  M;
    }

    public double getLoadFactor() {
        return  usedCellNumber * 1.0/hashTable.length;
    }

    //Rehash
    public void reHashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for(String s: hashTable) {
            if(s != null) {
                data.add(s);
            }
        }
        data.add(word);
        hashTable = new String[hashTable.length * 2];

        for(String temp: data) {
            //Insert in Hash Table
            insertInHashTable(temp);
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

    public void deleteKeyHashTable(String word) {
        int index = simpleASCIIHashFunction(word, hashTable.length);

        for(int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println(word + " has been deleted from HashTable");
                return;
            }
        }
        System.out.println(word + " not found in HashTable.");
    }

    //insert method
    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while(sum >0) {
            value = sum % 10;
            sum = sum /10;
        }
        return value;
    }

    public int secondHashFunction(String x, int M) {
        char[] ch;
        ch = x.toCharArray();
        int i, sum;
        for(i = 0, sum = 0; i < x.length(); i++) {
            sum += ch[i];
        }
        while(sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }

        return sum % M;
    }

    public  void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.75) {
            reHashKeys(word);
        }
        else {
            int x = simpleASCIIHashFunction(word, hashTable.length);
            int y = secondHashFunction(word, hashTable.length);

            for ( int i = 0; i < hashTable.length; i++) {
                int newIndex = (x + i*y) % hashTable.length;
                if(hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " inseted at location: " + newIndex);
                    break;
                }
                else {
                    System.out.println(newIndex + " is already occupied. Searching next one...");
                }
            }
        }
        usedCellNumber++;
    }


    public boolean searchHashTable(String word) {
        int index = simpleASCIIHashFunction(word, hashTable.length);

        for(int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if(hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println(word + " found at location " + newIndex);
                return true;
            }
        }
        System.out.println(word + " not found in HashTable.");
        return false;
    }
}
