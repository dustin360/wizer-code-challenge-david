package com.company.service;

/**
 * Created by David on 15 Nov, 2021
 **/
public class AssessmentTwo {



    public static void rightRotateArray(int a[], int no) {

        //[1,2,3,4,5,6]

        if (a.length < 1 || no == 0) {
            System.out.println("Please input a valid array and/or a valid rotation index");
            return;
        }

        int arraySize = a.length;


        no = no % arraySize;

        for (int i = 0; i < arraySize; i++) {

            if (i < no) {
                System.out.print(a[arraySize + i - no] + " ");
            }

            else {
                System.out.print(a[i - no] + " ");
            }
        }

        System.out.println();

    }
}
