package com.company;

public class Main {

    public static void main(String[] args) {
//	    DirectChaining directChaining = new DirectChaining(15);
//	    directChaining.insertHashTable("The");
//        directChaining.insertHashTable("quick");
//        directChaining.insertHashTable("brown");
//        directChaining.insertHashTable("fox");
//        directChaining.insertHashTable("over");
//
//        directChaining.displayHashTable();
//
//        directChaining.searchHashTable("fox");
//        directChaining.deleteKeyHashTable("quick");
//        directChaining.displayHashTable();

//        LinearProbing linearProbing = new LinearProbing(5);
//        linearProbing.insertInHashTable("The");
//        linearProbing.insertInHashTable("quick");
//        linearProbing.insertInHashTable("brown");
//        linearProbing.insertInHashTable("fox");
//        linearProbing.insertInHashTable("over");
//        linearProbing.insertInHashTable("gta");
//        linearProbing.insertInHashTable("mac");
//        linearProbing.displayHashTable();
//        linearProbing.searchHashTable("gta");
//        linearProbing.deleteKeyHashTable("fox");
//        linearProbing.displayHashTable();

//        QuadraticProbing quadraticProbing = new QuadraticProbing(5);
//        quadraticProbing.insertInHashTable("The");
//        quadraticProbing.insertInHashTable("quick");
//        quadraticProbing.insertInHashTable("brown");
//        quadraticProbing.insertInHashTable("fox");
//        quadraticProbing.insertInHashTable("over");
//        quadraticProbing.insertInHashTable("gta");
//        quadraticProbing.insertInHashTable("mac");
//        quadraticProbing.displayHashTable();
//        quadraticProbing.searchHashTable("gta");
//        quadraticProbing.deleteKeyHashTable("fox");
//        quadraticProbing.displayHashTable();

        DoubleHashing doubleHashing = new DoubleHashing(5);
        doubleHashing.insertInHashTable("The");
        doubleHashing.insertInHashTable("quick");
        doubleHashing.insertInHashTable("brown");
        doubleHashing.insertInHashTable("fox");
        doubleHashing.insertInHashTable("over");
        doubleHashing.insertInHashTable("gta");
        doubleHashing.insertInHashTable("mac");
        doubleHashing.displayHashTable();
        doubleHashing.searchHashTable("gta");
        doubleHashing.deleteKeyHashTable("fox");
        doubleHashing.displayHashTable();
    }
}
