package com.anactualbird.enigma;

import java.util.Scanner;

public class Main
{
    public static char[][] cipher =
            {{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'},
                    {'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A'},
                    {'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B'},
                    {'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C'},
                    {'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D'},
                    {'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E'},
                    {'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F'},
                    {'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G'},
                    {'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'},
                    {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'},
                    {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
                    {'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'},
                    {'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'},
                    {'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M'},
                    {'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'},
                    {'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'},
                    {'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'},
                    {'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'},
                    {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
                    {'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'},
                    {'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'},
                    {'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U'},
                    {'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V'},
                    {'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W'},
                    {'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X'},
                    {'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'}};
    public static char[] alphabetlist =
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static String[][] alphabet = {{"A", ""},
            {"B", ""}, {"C", ""}, {"D", ""}, {"E", ""}, {"F", ""},
            {"G", ""}, {"H", ""}, {"I", ""}, {"J", ""}, {"K", ""},
            {"l", ""}, {"M", ""}, {"N", ""}, {"O", ""}, {"P", ""},
            {"Q", ""}, {"R", ""}, {"S", ""}, {"T", ""}, {"U", ""},
            {"V", ""}, {"W", ""}, {"X", ""}, {"Y", ""}, {"Z", ""}};
    public static boolean poly;
    public static boolean encryption;
    public static String output = "";
    public static int counter;

    public static void main(String[] args)
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);
//        System.out.println("Polyalphabetic (1) or Monoalphabetic (2)?");
//
//        if (input.next() == "1") poly = true;

            System.out.println("What is the key for your code?");
            String key = input.nextLine();
//        if (poly)
//        {
//            System.out.println("Thank You, Keyboard Launch Imminent");
//            JFrame window = new JFrame();
//            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            window.setTitle("ENIGMA");
//            //window.setSize(x,y);
//            window.setLocationRelativeTo(null);
//
//            JPanel QRow = new JPanel();
//            JPanel ARow = new JPanel();
//            JPanel ZRow = new JPanel();
//        } else
//        {
            System.out.println("\nWould you like to encrypt (1) or decrypt (2) a message?");
            if (input.next().equals("1")) encryption = true;
            else encryption = false;

            System.out.println("Please enter your message(s) for " + en() + "cryption,");
            System.out.println("You may continue entering messages until you are satisfied. ");
            System.out.println("Once you are satisfied please enter the word: \"TERMIN8\" to return to key entrance.");

            while (true)
            {
                String message = input.nextLine();
                if (message.toUpperCase().equals("TERMIN8")) break;
                if(encryption)
                {
                    System.out.println(encrypt(message, key));
                }else if (!encryption)
                {
                    System.out.println(decrypt(message, key));
                }
            }

        }
//        }
    }

    public static void inputKey(String A)
    {
        A = A.toUpperCase();
        for (int i = 0; i < A.length(); i++)
        {
            alphabet[i][1] = A.charAt(i) + "";
        }
    }

    public static String en()
    {
        if (encryption) return "en";
        else if (!encryption) return "de";
        else return "no";
    }

    public static String encrypt(String Message, String Key)
    {
        output = "";
        Message = clean(Message);
        Key = clean(Key);

        char[] message = Message.toCharArray();
        char[] key = Key.toCharArray();
        for (int i = 0; i < message.length; i++)
        {
            int m = getIndex(message[i]);
            if (m > key.length) m = m - key.length;
            int k = getIndex(key[i]);

            if (i % 5 == 0 && i != 0) output += " ";
            output += cipher[m][k];
        }
        return output;
    }

    public static String decrypt(String Message, String Key)
    {
        output = "";
        Message = clean(Message);
        Key = clean(Key);

        char[] message = Message.toCharArray();
        char[] key = Key.toCharArray();
        for (int i = 0; i < message.length; i++)
        {
            int k = getIndex(key[i]);
            int m = getIndex(message[i],k);

//            if(m>key.length) m = m-key.length;
// ALPUS IQDRS NIJXI YQQFD Q
            output += cipher[k][m];
        }
        return output;
    }

    public static int getIndex(char a)
    {
        int index = -1;
        for (int i = 0; i < alphabetlist.length; i++)
        {
            if (alphabetlist[i] == a)
            {
                index = i;
            }
        }
        return index;
    }

    public static int getIndex(char a, int b)
    {
        int index = -1;
        char[] alphabet = new char[26];
        for(int j = 0; j<cipher[b].length;j++)
        {
            alphabet[j] = cipher[b][j];
        }
        for (int i = 0; i < alphabet.length; i++)
        {
            if (alphabet[i] == a)
            {
                index = i;
            }
        }
        return index;
    }

    public static String clean(String a)
    {
        a = a.toUpperCase();
        a = a.replaceAll(" ", "");
        a = a.replaceAll(",", "");
        a = a.replaceAll("\\.", "");
        a = a.replaceAll(";", "");
        return a;
    }
}
