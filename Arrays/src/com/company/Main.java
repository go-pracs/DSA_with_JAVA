package com.company;

import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] intArray1; //declare
        int[][] intArray2;
        
        intArray1 = new int[5];  //instantiate
        intArray2 = new int[3][3];

        // initialise
        intArray1[0] = 1;
        intArray1[1] = 2;
        intArray1[2] = 3;
        intArray1[3] = 4;
        intArray1[4] = 5;
        int k = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                intArray2[i][j] = k++;
            }
        }
        System.out.println(Arrays.toString(intArray1));

        System.out.println(Arrays.deepToString(intArray2));

        String strArray[] = {"Saishrey", "360"}; // all together
        String twoString[][] = {{"Saishrey", "360"}, {"Shreyas", "1607"}};

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.deepToString(twoString));

        //===========================================//

        SingleDimensionArray arr = new SingleDimensionArray(10);
        arr.insert(0,3);
        arr.insert(2,30);
        arr.insert(4,300);
        arr.insert(2,600);

        arr.traverseArray();
        arr.searchInArray(30);
        arr.searchInArray(32);

        arr.deleteValue(3);
        arr.deleteValue(20);

        //===========================================//

        TwoDimensionalArray myArr = new TwoDimensionalArray(2,2);
        myArr.insertValueInTheArray(0,0,1);
        myArr.insertValueInTheArray(0,1,2);
        myArr.insertValueInTheArray(1,1,3);
        myArr.insertValueInTheArray(0,0,4);

        myArr.accessCell(0,1);
        myArr.insertValueInTheArray(1,0,100);
        myArr.deleteValuefromArray(0,0);
        myArr.searchingValue(100);
        System.out.println(Arrays.deepToString(myArr.arr));
        myArr.traverse2DArray();
        var i = 'S';
        System.out.println(i);
    }
}

