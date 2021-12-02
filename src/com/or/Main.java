package com.or;

public class Main {

    public static void main(String[] args) {

        char[] digits = {'9', '7', '4', '3', '4', '2', '0', '7', '8', '6'};

        System.out.println("The sum as for ascii value is: ");
        System.out.println(digitsAsciiSum(digits));
        System.out.println("The sum as for digit value is: ");
        System.out.println(digitsSum(digits));
    }

        public static int digitsAsciiSum(char [] digits) {

            int asciiSum = 0;

            for (int i = 0; i < digits.length; i++) {
                asciiSum += (digits[i]);

            }
            return asciiSum;
        }

        public static int digitsSum(char [] digits) {

           int sum = 0;

           for (int j = 0; j < digits.length; j++) {
           sum += (digits[j] - 48);
        }
           return sum;
        }
    }

