package com.anactualbird.enigma;

import java.util.Scanner;

public class Main
{
    public static boolean poly;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Polyalphabetic (1) or Monoalphabetic (2)?");
        if (input.next() == "1")
        {
            Monoalphabetic.run();
        }
        else
        {
            Polyalphabetic.run();
        }
    }

}
