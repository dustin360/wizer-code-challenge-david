package com.company.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 15 Nov, 2021
 **/
public class AssessmentThree {

    public static void indicesToTarget(int[] a, int target) {

        // validations
        if (a.length < 2 || a.length > 104) {
            System.out.println("Please input a valid array with a length between 2 and 104");
            return;
        }

        if (target < -109 || target > 109) {
            System.out.println("The target number must be in between -109 and 109");
            return;
        }






        // get to work
        List<Integer> targetIndexes = new ArrayList<Integer>();

        boolean canBreak = false;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < -109 || a[i] > 109) {
                System.err.println("Each element of the array must be within the range of -109 to 109 in value");
            }


            for (int b = (i + 1); b < a.length; b++ ) {
                if (a[i] + a[b] == target) {
                    targetIndexes.add(i);
                    targetIndexes.add(b);
                    canBreak = true;
                    break;
                }
            }

            if (canBreak) {
                break;
            }
        }


        System.out.print("indices are: ");
        for (Integer targetIndex : targetIndexes) {
            System.out.print(targetIndex + ", ");
        }


    }

}
