package org.udu;
public class PositiveNegativeZero {

    public static void main(String[] args) {
        CheckNumber(5);
        CheckNumber(0);
        CheckNumber(-7);
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
}