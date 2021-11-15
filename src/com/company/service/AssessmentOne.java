package com.company.service;


import java.util.List;

public class AssessmentOne {

    public static void printRightAlignedTriangle(String heightParam) {
        if (heightParam.equals("") || heightParam.length() > 10) {
            System.out.println("Please input a valid height param - It length " +
                    " between 1 and 9");
            return;
        }

        int height = heightParam.length();
        for (int i = 0; i < height; i++) {
            doPrint(i);
        }
    }

    private static void doPrint(int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
