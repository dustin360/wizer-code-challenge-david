package com.company;

import com.company.service.AssessmentOne;
import com.company.service.AssessmentThree;
import com.company.service.AssessmentTwo;

public class Main {

    public static void main(String[] args) {
        // ASSESSMENT ONE
        AssessmentOne.printRightAlignedTriangle("HEIGHT");

        //ASSESSMENT TWO
        int[] array = {1,2,3,4,5,6};
        AssessmentTwo.rightRotateArray(array, 2);

        //ASSESSMENT THREE
        int[] array2 = {3,3};
        AssessmentThree.indicesToTarget(array2, 6);
    }
}
