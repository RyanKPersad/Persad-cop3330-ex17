/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package BAC;
import java.util.Scanner;

public class App 
{
    static Scanner myObj = new Scanner(System.in);
    public static void main( String[] args )
    {
        String W;
        String r;
        String A;
        String H;
        System.out.println("Enter your gender\nAre you male or female?");
        String Gender = myObj.nextLine();
        r = (Gender.equalsIgnoreCase("male"))? ".73":".66";

        System.out.println("Enter your weight");
        W = myObj.nextLine();


        System.out.println("How many ounces of alcohol did you have?");
        A = myObj.nextLine();


        System.out.println("How many hours has it been since your last drink?");
        H = myObj.nextLine();

        if(!W.matches("[0-9.]+")|!A.matches("[0-9.]+")|!H.matches("[0-9.]+")){
            System.out.println("You have entered a non-numeric value\nCan not Compute" );


         }else{

            double r1 = Double.parseDouble(r);
            double W1 = Double.parseDouble(W);
            double A1 = Double.parseDouble(A);
            double H1 = Double.parseDouble(H);

            double x = A1*5.14;
            double y = x/W1;
            double z = y*r1;
            double a = .015 * H1;
            double answer = z-a;
            String print1 = String.format("%.6f",answer);

            if (answer >= 0.08){
                System.out.println("Your BAC is "+print1+"\nIt is not legal for you to drive");

            }else{
                System.out.println("Your BAC is "+print1+"\nIt is legal for you to drive");

            }

        }

    }
}
