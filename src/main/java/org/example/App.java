/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function prompts user for weight in pounds and height in inches
    // Prints out BMI range (ideal weight, overweight, underweight)
    public static void main( String[] args )
    {
        double height, weight;
        double bmi;

        System.out.println("What is your height in inches? ");
        Scanner inputHeight = new Scanner(System.in);
        height = inputHeight.nextDouble();

        System.out.println("What is your weight in pounds? ");
        Scanner inputWeight = new Scanner(System.in);
        weight = inputWeight.nextDouble();

        bmi = (weight / (height * height)) * 703;

        if (bmi < 18.5)
        {
            System.out.println("Your BMI is " + String.format("%.1f",bmi) + ".");
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi > 25)
        {
            System.out.println("Your BMI is " + String.format("%.1f",bmi) + ".");
            System.out.println("You are overweight. You should see your doctor.");
        }
        else
        {
            System.out.println("Your BMI is " + String.format("%.1f",bmi) + ".");
            System.out.println("You are within the ideal weight range.");
        }
    }
}
