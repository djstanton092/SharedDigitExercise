package com.dstanton;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){
        if (number1 >= 10 && number1 <=99 && number2 >= 10 && number2 <= 99){
            int number1Digit1 = 0;
            int number1Digit2 = 0;
            int number2Digit1 = 0;
            int number2Digit2 = 0;

            number1Digit1 = number1 % 10;
            number1 /= 10;
            number1Digit2 = number1 % 10;

            number2Digit1 = number2 % 10;
            number2 /= 10;
            number2Digit2 = number2 % 10;

            if (number1Digit1 == number2Digit1
                    || number1Digit1 == number2Digit2
                    || number1Digit2 == number2Digit1
                    || number1Digit2 == number2Digit2){
                return true;
            }
        }
        return false;
    }
}

