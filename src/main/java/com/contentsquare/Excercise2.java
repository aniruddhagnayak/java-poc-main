package com.contentsquare;

public class Excercise2 {
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//    Input: nums = [3,3], target = 6
//    Output: [0,1]

    public static void main(String[] args) {
        int targetFirst = 9;
        int numFirst[] = {2, 7, 11, 15};
        int targetSecond = 6;
        int numSecond[] = {3, 2, 4};
        int targetThird = 6;
        int numThird[] = {3, 2, 4};

        targetInArray(numFirst, targetFirst);
        targetInArray(numSecond, targetSecond);
        targetInArray(numThird, targetThird);
    }

    public static void targetInArray(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices are: " + i + " " + j);
                }

            }

        }
    }


}
