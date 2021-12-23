package com.feldmann;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;
import jdk.nashorn.internal.objects.annotations.Function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;

import static java.awt.Font.BOLD;

public class BotaoGerar {
    public void teste(){
        //how to
    }
    public void mtd(JButton type, JTextField campoTexto1,
                    JLabel palavraDigitada, int posX,
                    int posY, int X, int Y){
        type.setBackground(colors.black);
        type.setForeground(colors.white);
        type.setFocusable(false);
        type.setFont(new Font(strings.fontSegoePrint, BOLD, 15));
        //
        type.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent actionEvent) {
                if (campoTexto1.getText().isEmpty()){
                    palavraDigitada.setText(strings.noWord);
                }else{
                    palavraDigitada.setText(campoTexto1.getText());
                }
            }
        });
        type.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                type.setBorder(BorderFactory.createEtchedBorder(colors.green, colors.green));
            }
        });
        type.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                type.setBorder(BorderFactory.createEtchedBorder(colors.white, colors.white));

            }
        });
    }
}
