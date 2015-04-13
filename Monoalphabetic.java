package com.anactualbird.enigma;

import javax.swing.*;

public class Monoalphabetic
{
    public static String[][] alphabet = {{"A", ""},
            {"B", ""}, {"C", ""}, {"D", ""}, {"E", ""}, {"F", ""},
            {"G", ""}, {"H", ""}, {"I", ""}, {"J", ""}, {"K", ""},
            {"l", ""}, {"M", ""}, {"N", ""}, {"O", ""}, {"P", ""},
            {"Q", ""}, {"R", ""}, {"S", ""}, {"T", ""}, {"U", ""},
            {"V", ""}, {"W", ""}, {"X", ""}, {"Y", ""}, {"Z", ""}};
    public static void run()
    {

            System.out.println("Thank You, Keyboard Launch Imminent");
            JFrame window = new JFrame();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setTitle("ENIGMA");
            //window.setSize(x,y);
            window.setLocationRelativeTo(null);
            JPanel QRow = new JPanel();
            JPanel ARow = new JPanel();
            JPanel ZRow = new JPanel();
    }

    public static void inputKey(String A)
    {
        A = A.toUpperCase();
        for (int i = 0; i < A.length(); i++)
        {
            alphabet[i][1] = A.charAt(i) + "";
        }
    }
}
