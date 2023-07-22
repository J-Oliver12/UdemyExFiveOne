package org.udu;
public class PositiveNegativeZero {

    public static void main(String[] args) {
        CheckNumber(5);
        CheckNumber(0);
        CheckNumber(-7);
        CheckNumber1(5);
        CheckNumber1(0);
        CheckNumber1(-7);
    }


    public static void CheckNumber(int number) {

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

    public static void CheckNumber1(int number) {

        System.out.println((number > 0) ? "positive" : ((number < 0) ? "negative" : "zero"));

    }


}