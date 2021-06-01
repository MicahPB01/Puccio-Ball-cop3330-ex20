package oop.example;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int orderAmount;
        double taxAmount = 0;
        double total;
        double subTotal;
        String state;
        String county;


        System.out.print("What is the order amount? ");
        subTotal = Integer.parseInt(input.nextLine());
        total = subTotal;

        System.out.print("What state do you live in? ");
        state = input.nextLine();

        if(state.equalsIgnoreCase("Wisconsin") || state.equalsIgnoreCase("Illinois"))   {
            taxAmount = (subTotal * 1.05) - subTotal;
            taxAmount = Math.round(taxAmount * 100.00) / 100.00;

        //Was confused on what the county was supposed to add. Added an additional 0.4% and 0.5% respectively.

            if(state.equalsIgnoreCase("Wisconsin"))   {
                System.out.print("What county do you live in? ");
                county = input.nextLine();

                if(county.equalsIgnoreCase("Eau Claire"))   {
                    taxAmount = taxAmount + ((subTotal * 1.004) - subTotal);
                    taxAmount = Math.round(taxAmount * 100.00) / 100.00;
                }
                if(county.equalsIgnoreCase("Dunn"))   {
                    taxAmount = taxAmount + ((subTotal * 1.005) - subTotal);
                    taxAmount = Math.round(taxAmount * 100.00) / 100.00;
                }

            }
            total = subTotal + taxAmount;
            total = Math.round(total * 100.00) / 100.00;
        }

        System.out.printf("The tax is $%.2f\nThe total is $%.2f.\n", taxAmount, total);






    }
}
