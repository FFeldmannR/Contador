package com.feldmann;

import javax.swing.*;
import java.awt.*;

public class configJFrame {
    public static int posX = 600;
    public static int posY = 100;
    public static int X = 500;
    public static int Y = 500;
    public void jFrame(JFrame janela, JPanel painel){
        janela.setBounds(posX, posY, X, Y);//posição na tela
        janela.setPreferredSize(new Dimension(X, Y));//tamanho da janela
        janela.setUndecorated(true);
        janela.getContentPane().add(painel);
        janela.pack( );
        //frame.show( );
        janela.setVisible(true);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
