package org.udu;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        CheckNumber(5);
        CheckNumber(0);
        CheckNumber(-7);
        CheckNumber1(5);
        CheckNumber1(0);
        CheckNumber1(-7);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(800);

        shouldWakeUp(true,6);
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


    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println((milesPerHour < 0) ? "Invalid Value" : (kilometersPerHour + " km/h = " + milesPerHour + " mi/h"));
    }

    /*     ### Alternative:
    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
    */

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }

    }


        /*
        int kiloByte = 1024;
        int megaByte = 1;
        int oneMegaByte = kiloByte * megaByte;
        int bytesToMega = (kiloBytes / oneMegaByte);
        int modulus = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + bytesToMega + " MB and " + modulus + " KB ");
        }
    }
         */

/*
        ### Alternative:
        System.out.println((kiloBytes < 0) ? "Invalid Value" : (kiloBytes +" KB = " + bytesToMega + " MB and "  + modulus + " KB " ));
*/

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            return barking && (hourOfDay < 8 || hourOfDay >= 23 );

        }
    }


}


