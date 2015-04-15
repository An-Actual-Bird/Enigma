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
    static GridBagConstraints a,z,q;
    public static void run()
    {

        System.out.println("Thank You, GUI Launch Imminent");
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("ENIGMA");
        window.setSize(1220,720);
        window.setLocationRelativeTo(null);

        QRow = new JPanel();
        ARow = new JPanel();
        ZRow = new JPanel();
        Keyboard = new JPanel();

        QRow.setLayout(new GridBagLayout());
        ARow.setLayout(new GridBagLayout());
        ZRow.setLayout(new GridBagLayout());
        Keyboard.setLayout(new GridBagLayout());

        int ARowWidthBuffer = (window.getWidth()-(int)Math.round(window.getWidth()*0.8))/2;
        int ZRowWidthBuffer = (window.getWidth()-(int)Math.round(window.getWidth()*0.7))/2;
        Insets ARowInsets = new Insets(1,ARowWidthBuffer,1,ARowWidthBuffer);
        Insets ZRowInsets = new Insets(1, ZRowWidthBuffer,1, ZRowWidthBuffer);
        q = new GridBagConstraints();
        a = new GridBagConstraints();
        z = new GridBagConstraints();
        q.gridy = 0;
        a.gridy = 1;
        z.gridy = 2;

        //a.insets = ARowInsets;
        //z.insets = ZRowInsets;
        //q.fill = HORIZONTAL;
        //a.fill = HORIZONTAL;
        //z.fill = HORIZONTAL;

        q.weightx = 0.5;
        q.weighty = 0.5;
        a.weightx = 0.5;
        a.weighty = 0.5;
        z.weightx = 0.5;
        z.weighty = 0.5;


        Keyboard.add(QRow,q);
        Keyboard.add(ARow,a);
        Keyboard.add(ZRow,z);
        addKeys();
        paint();
        window.add(Keyboard, BorderLayout.SOUTH);
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

        GridBagConstraints keys = new GridBagConstraints();

        keys.fill = BOTH;
        keys.ipadx = window.getWidth()/10;
        keys.ipady = window.getWidth()/10;
        keys.weightx = 0.5;
        keys.weighty = 0.5;

        QRow.add(Q,keys);
        QRow.add(W,keys);
        QRow.add(E,keys);
        QRow.add(R,keys);
        QRow.add(T,keys);
        QRow.add(Y,keys);
        QRow.add(U,keys);
        QRow.add(I,keys);
        QRow.add(O,keys);
        QRow.add(P,keys);

        ARow.add(A,keys);
        ARow.add(S,keys);
        ARow.add(D,keys);
        ARow.add(F,keys);
        ARow.add(G,keys);
        ARow.add(H,keys);
        ARow.add(J,keys);
        ARow.add(K,keys);
        ARow.add(L,keys);

        ZRow.add(Z,keys);
        ZRow.add(X,keys);
        ZRow.add(C,keys);
        ZRow.add(V,keys);
        ZRow.add(B,keys);
        ZRow.add(N,keys);
        ZRow.add(M,keys);
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

        Z.setBackground(Color.GRAY);
        X.setBackground(Color.LIGHT_GRAY);
        C.setBackground(Color.GRAY);
        V.setBackground(Color.LIGHT_GRAY);
        B.setBackground(Color.GRAY);
        N.setBackground(Color.LIGHT_GRAY);
        M.setBackground(Color.GRAY);

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
