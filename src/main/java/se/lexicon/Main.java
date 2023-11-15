package se.lexicon;
import java.lang.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
class Main {

    public static void main(String[] args)
    {
        boolean runer=true;
        while (runer){
            double num1=0, num2=0;
            String input1, input2;

            Scanner sc = new Scanner(System.in);

            System.out.println("addition subtraction multiplication division:");

            System.out.println("Give me a number");
            boolean IsCorrect=false;
            while (!IsCorrect){
                IsCorrect=true;
                try {
                    input1=sc.next();
                    num1=Float.parseFloat(input1);
                }catch (Exception E){
                    IsCorrect=false;
                    System.out.println("invalid value");
                }
            }
            IsCorrect=false;
            System.out.println("Give me a number");
            while (!IsCorrect){
                IsCorrect=true;
                try {
                    input2=sc.next();
                    num2=Float.parseFloat(input2);
                }catch (Exception E){
                    IsCorrect=false;
                    System.out.println("invalid value");
                }
            }

            System.out.println("Enter the operator (+,-,*,/):");

            char op = sc.next().charAt(0);
            double o = 0;

            switch (op) {

                case '+':
                    o = num1 + num2;
                    break;


                case '-':
                    o = num1 - num2;
                    break;


                case '*':
                    o = num1 * num2;
                    break;


                case '/':
                    o = num1 / num2;
                    break;

                default:
                    System.out.println("You enter wrong number");
            }

            System.out.println("The result:");
            System.out.println();


            System.out.println(num1 + " " + op + " " + num2
                    + " = " + o);
            System.out.println("Say stop to end the program");
            var imput = sc.next();
            imput=imput.toLowerCase();
            if (imput.equals("stop") )runer = false;

            }
        }

    }




