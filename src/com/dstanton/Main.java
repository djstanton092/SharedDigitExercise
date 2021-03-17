package com.dstanton;

public class Main {

    public static void main(String[] args) {
	// write your code here

       // System.out.println(SharedDigit.hasSharedDigit(10,23));
        testHasSharedDigit(1,2,false);
        testHasSharedDigit(100,200, false);
        testHasSharedDigit(12,23, true);
        testHasSharedDigit(9,9, false);
        testHasSharedDigit(15,55, true);
    }

    public static void testHasSharedDigit(int number1, int number2, boolean expected){
        boolean result = SharedDigit.hasSharedDigit(number1, number2);

        System.out.printf("%s - hasSharedDigit(%d, %d) returned %b: expected %b %n",
                (result ==expected)? "PASS":"FAIL",number1, number2, result, expected);

    }

}
