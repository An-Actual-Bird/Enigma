package com.anactualbird.enigma;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.GridBagConstraints.*;
import static java.awt.GridBagConstraints.BOTH;

public class Monoalphabetic
{
    public static String[][] alphabet = {{"A", ""},
            {"B", ""}, {"C", ""}, {"D", ""}, {"E", ""}, {"F", ""},
            {"G", ""}, {"H", ""}, {"I", ""}, {"J", ""}, {"K", ""},
            {"l", ""}, {"M", ""}, {"N", ""}, {"O", ""}, {"P", ""},
            {"Q", ""}, {"R", ""}, {"S", ""}, {"T", ""}, {"U", ""},
            {"V", ""}, {"W", ""}, {"X", ""}, {"Y", ""}, {"Z", ""}};
    public static JLabel A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
    static JPanel QRow,ARow,ZRow,Keyboard;
    static JFrame window;
    public static void run()
    {

        System.out.println("Thank You, GUI Launch Imminent");
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("ENIGMA");
        window.setSize(1220,720);
//        window.setLocationRelativeTo(null);

        QRow = new JPanel();
        ARow = new JPanel();
        ZRow = new JPanel();
        Keyboard = new JPanel();
//
        QRow.setLayout(new GridBagLayout());
        ARow.setLayout(new GridBagLayout());
        ZRow.setLayout(new GridBagLayout());

        int ARowWidthBuffer = (window.getWidth()-(int)Math.round(window.getWidth()*0.8))/2;
        int ZRowWidthBuffer = (window.getWidth()-(int)Math.round(window.getWidth()*0.7))/2;
        Insets ARowInsets = new Insets(0,ARowWidthBuffer,ARowWidthBuffer,0);
        Insets ZRowInsets = new Insets(0, ZRowWidthBuffer, ZRowWidthBuffer, 0);
        GridBagConstraints a = new GridBagConstraints(RELATIVE, RELATIVE,1,1, BOTH,0,0,GridBagConstraints.NONE,ARowInsets, CENTER,0);
        GridBagConstraints z = new GridBagConstraints(RELATIVE, RELATIVE,1,1, BOTH,0,0,GridBagConstraints.NONE,ZRowInsets, CENTER,0);

        QRow.setSize(window.getWidth()*1,window.getHeight()/3);
        ARow.setSize((int)Math.round(window.getWidth()*0.8),window.getHeight()/3);
        ZRow.setSize((int)Math.round(window.getWidth()*0.7),window.getHeight()/3);

        Keyboard.setLayout(new GridLayout(3,1,10,10));

        Keyboard.add(QRow, BorderLayout.CENTER);
        Keyboard.add(ARow, BorderLayout.CENTER);
        Keyboard.add(ZRow, BorderLayout.CENTER);
        addKeys();
        paint();
        window.add(Keyboard, BorderLayout.CENTER);
        window.setVisible(true);
    }

    public static void inputKey(String A)
    {
        A = A.toUpperCase();
        for (int i = 0; i < A.length(); i++)
        {
            alphabet[i][1] = A.charAt(i) + "";
        }
    }
    public static void addKeys()
    {
        A = new JLabel("A",SwingConstants.CENTER);
        B = new JLabel("B",SwingConstants.CENTER);
        C = new JLabel("C",SwingConstants.CENTER);
        D = new JLabel("D",SwingConstants.CENTER);
        E = new JLabel("E",SwingConstants.CENTER);
        F = new JLabel("F",SwingConstants.CENTER);
        G = new JLabel("G",SwingConstants.CENTER);
        H = new JLabel("H",SwingConstants.CENTER);
        I = new JLabel("I",SwingConstants.CENTER);
        J = new JLabel("J",SwingConstants.CENTER);
        K = new JLabel("K",SwingConstants.CENTER);
        L = new JLabel("L",SwingConstants.CENTER);
        M = new JLabel("M",SwingConstants.CENTER);
        N = new JLabel("N",SwingConstants.CENTER);
        O = new JLabel("O",SwingConstants.CENTER);
        P = new JLabel("P",SwingConstants.CENTER);
        Q = new JLabel("Q",SwingConstants.CENTER);
        R = new JLabel("R",SwingConstants.CENTER);
        S = new JLabel("S",SwingConstants.CENTER);
        T = new JLabel("T",SwingConstants.CENTER);
        U = new JLabel("U",SwingConstants.CENTER);
        V = new JLabel("V",SwingConstants.CENTER);
        W = new JLabel("W",SwingConstants.CENTER);
        X = new JLabel("X",SwingConstants.CENTER);
        Y = new JLabel("Y",SwingConstants.CENTER);
        Z = new JLabel("Z",SwingConstants.CENTER);

        QRow.add(Q);
        QRow.add(W);
        QRow.add(E);
        QRow.add(R);
        QRow.add(T);
        QRow.add(Y);
        QRow.add(U);
        QRow.add(I);
        QRow.add(O);
        QRow.add(P);

        ARow.add(A);
        ARow.add(S);
        ARow.add(D);
        ARow.add(F);
        ARow.add(G);
        ARow.add(H);
        ARow.add(J);
        ARow.add(K);
        ARow.add(L);

        ZRow.add(Z);
        ZRow.add(X);
        ZRow.add(C);
        ZRow.add(V);
        ZRow.add(B);
        ZRow.add(N);
        ZRow.add(M);
    }
    public static void paint()
    {
        Q.setBackground(Color.LIGHT_GRAY);
        W.setBackground(Color.GRAY);
        E.setBackground(Color.LIGHT_GRAY);
        R.setBackground(Color.GRAY);
        T.setBackground(Color.LIGHT_GRAY);
        Y.setBackground(Color.GRAY);
        U.setBackground(Color.LIGHT_GRAY);
        I.setBackground(Color.GRAY);
        O.setBackground(Color.LIGHT_GRAY);
        P.setBackground(Color.GRAY);

        A.setBackground(Color.GRAY);
        S.setBackground(Color.LIGHT_GRAY);
        D.setBackground(Color.GRAY);
        F.setBackground(Color.LIGHT_GRAY);
        G.setBackground(Color.GRAY);
        H.setBackground(Color.LIGHT_GRAY);
        J.setBackground(Color.GRAY);
        K.setBackground(Color.LIGHT_GRAY);
        L.setBackground(Color.GRAY);

        Z.setBackground(Color.LIGHT_GRAY);
        X.setBackground(Color.GRAY);
        C.setBackground(Color.LIGHT_GRAY);
        V.setBackground(Color.GRAY);
        B.setBackground(Color.LIGHT_GRAY);
        N.setBackground(Color.GRAY);
        M.setBackground(Color.LIGHT_GRAY);

        Q.setOpaque(true);
        W.setOpaque(true);
        E.setOpaque(true);
        R.setOpaque(true);
        T.setOpaque(true);
        Y.setOpaque(true);
        U.setOpaque(true);
        I.setOpaque(true);
        O.setOpaque(true);
        P.setOpaque(true);

        A.setOpaque(true);
        S.setOpaque(true);
        D.setOpaque(true);
        F.setOpaque(true);
        G.setOpaque(true);
        H.setOpaque(true);
        J.setOpaque(true);
        K.setOpaque(true);
        L.setOpaque(true);

        Z.setOpaque(true);
        X.setOpaque(true);
        C.setOpaque(true);
        V.setOpaque(true);
        B.setOpaque(true);
        N.setOpaque(true);
        M.setOpaque(true);


    }
}
