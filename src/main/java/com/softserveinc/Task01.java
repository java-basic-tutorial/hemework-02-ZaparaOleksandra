package com.softserveinc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
        // TODO: Write your code here

        double averageTemp;
        int minTemp = 0;
        int maxTemp =0;
        double sum = 0;
            for (int j = 0; j < temperature.length; j++) {
                sum += temperature[j];
                if (temperature[j] < temperature [minTemp]) {
                    minTemp = j;
                }
                if (temperature[j] > temperature [maxTemp]) {
                    maxTemp = j;
                }
            }
            averageTemp = sum / temperature.length;

            System.out.println("Average annual temperature: " + averageTemp);
            System.out.print("Month with the lowest temperature in a year: ");
            switch (minTemp) {
                case 0:
                    System.out.println("I");
                    break;
                case 1:
                    System.out.println("II");
                    break;
                case 2:
                    System.out.println("III");
                    break;
                case 3:
                    System.out.println("IV");
                    break;
                case 4:
                    System.out.println("V");
                    break;
                case 5:
                    System.out.println("VI");
                    break;
                case 6:
                    System.out.println("VII");
                    break;
                case 7:
                    System.out.println("VIII");
                    break;
                case 8:
                    System.out.println("IX");
                    break;
                case 9:
                    System.out.println("X");
                    break;
                case 10:
                    System.out.println("XI");
                    break;
                case 11:
                    System.out.println("XII");
                    break;
            }
            System.out.print("The month with the highest temperatures in a year: ");
            switch (maxTemp) {
                case 0:
                    System.out.println("I");
                    break;
                case 1:
                    System.out.println("II");
                    break;
                case 2:
                    System.out.println("III");
                    break;
                case 3:
                    System.out.println("IV");
                    break;
                case 4:
                    System.out.println("V");
                    break;
                case 5:
                    System.out.println("VI");
                    break;
                case 6:
                    System.out.println("VII");
                    break;
                case 7:
                    System.out.println("VIII");
                    break;
                case 8:
                    System.out.println("IX");
                    break;
                case 9:
                    System.out.println("X");
                    break;
                case 10:
                    System.out.println("XI");
                    break;
                case 11:
                    System.out.println("XII");
                    break;
            }
        }

    }
