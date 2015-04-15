package com.anactualbird.enigma;

import java.util.Scanner;

public class Main
{
    public static boolean poly;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Polyalphabetic (1) or Monoalphabetic (2)?");
        if (input.next().equals("1"))
        {
            Polyalphabetic.run();
        }
        else
        {
            Monoalphabetic.run();
        }
    }

}
