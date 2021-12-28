package com.feldmann;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.awt.Font.BOLD;

public class configBotoes {
    public void mtdBotaoSair(JButton btn, int posX, int posY){
        btn.setBounds(posX, posY, 45, 45);//posX, posY, X, Y
        btn.setBackground(Colors.black);
        btn.setFont(new Font(Strings.fontSegoePrint, BOLD, 15));
        btn.setForeground(Colors.white);
        btn.setFocusable(false);
        //
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.green, Colors.green));
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.white, Colors.white));
            }
        });
        //
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //
                JFrame janelaSair = new JFrame();
                JPanel pn = new JPanel();
                JLabel msg = new JLabel(Strings.msgSair);
                JButton btnSim = new JButton(Strings.janelaSairBtnSim);
                JButton btnNao = new JButton(Strings.janelaSairBtnNao);
                Container ctn = janelaSair.getContentPane();
                ctn.setLayout(null);
                //
                ctn.add(btnNao);
                ctn.add(btnSim);
                ctn.add(msg);
                pn.setBackground(Colors.black);
                ctn.setBackground(Colors.black);
                msg.setForeground(Colors.white);
                //
                int msgPosX = 20,
                        msgPosY = 0,
                        msgX = 150,
                        msgY = 45;
                msg.setBounds(msgPosX, msgPosY, msgX, msgY);
                //
                int tamanhoBotaoX = 60,
                        tamanhoBotaoY = 30;
                int posBtnSimX = 30,
                        posBtnSimY = 50;
                btnNao.setBounds(posBtnSimX+70,posBtnSimY,tamanhoBotaoX,tamanhoBotaoY);
                btnNao.setFont(new Font(Strings.fontSegoePrint, BOLD,12));
                btnNao.setBackground(Colors.white);
                btnNao.setForeground(Colors.black);
                btnNao.setFocusable(false);
                btnNao.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent mouseEvent) {
                        super.mouseEntered(mouseEvent);
                        btnNao.setBorder(BorderFactory.createEtchedBorder(Colors.blue, Colors.blue));
                    }
                });
                btnNao.addMouseListener(new MouseAdapter() {
                    public void mouseExited(MouseEvent mouseEvent) {
                        super.mouseExited(mouseEvent);
                        btnNao.setBorder(BorderFactory.createEtchedBorder(Colors.white, Colors.white));
                    }
                });
                //
                btnSim.setBounds(posBtnSimX,posBtnSimY,tamanhoBotaoX,tamanhoBotaoY);
                btnSim.setFont(new Font(Strings.fontSegoePrint, BOLD, 12));
                btnSim.setForeground(Colors.black);
                btnSim.setBackground(Colors.white);
                btnSim.setFocusable(false);
                btnSim.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent mouseEvent) {
                        super.mouseEntered(mouseEvent);
                        btnSim.setBorder(BorderFactory.createEtchedBorder(Colors.blue, Colors.blue));
                    }
                });
                btnSim.addMouseListener(new MouseAdapter() {
                    public void mouseExited(MouseEvent mouseEvent) {
                        super.mouseExited(mouseEvent);
                        btnSim.setBorder(BorderFactory.createEtchedBorder(Colors.white, Colors.white));
                    }
                });
                //
                //TAMANHO DO FRAME JANELASAIR
                int janelaSairPosX = configJFrame.posX+150,
                        janelaSairPosY = configJFrame.posY+150,
                        janelaSairX = 190,
                        janelaSairY = 100;
                janelaSair.setBounds(janelaSairPosX, janelaSairPosY, janelaSairX, janelaSairY);
                janelaSair.setPreferredSize(new Dimension(janelaSairX, janelaSairY));//tamanho da janela
                janelaSair.setUndecorated(true);
                janelaSair.setVisible(true);
                janelaSair.setBackground(Colors.black);
                janelaSair.pack( );
                janelaSair.show( );
                janelaSair.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                //
                //
                btnSim.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        System.out.println(Strings.closing);
                        System.exit(0);
                    }
                });
                //
                //
                btnNao.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        janelaSair.dispose();
                    }
                });
                //
            }
        });
    }

    public void mtdBotaoMais(JButton btn, JLabel labelNumeroContador, int posX, int posY){
        btn.setBounds(posX, posY, tamanhoBotao.tamanhoX, tamanhoBotao.tamanhoY);//posX, posY, X, Y
        btn.setBackground(Colors.black);
        btn.setFont(new Font(Strings.fontSegoePrint, BOLD, 15));
        btn.setForeground(Colors.white);
        btn.setFocusable(false);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numero.i=numero.i+1;
                labelNumeroContador.setText((Integer.toString(numero.i)));
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.green, Colors.green));
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.white, Colors.white));
            }
        });
    }

    public void mtdBotaoReset(JButton btn, JLabel labelNumeroContador, int posX, int posY){
        btn.setBounds(posX, posY, tamanhoBotao.tamanhoX, tamanhoBotao.tamanhoY);
        btn.setFont(new Font(Strings.fontSegoePrint, BOLD, 15));
        btn.setForeground(Colors.white);
        btn.setBackground(Colors.black);
        btn.setFocusable(false);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeroContador.setText(Strings.zero);
                numero.i = 0;
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.green, Colors.green));
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.white, Colors.white));
            }
        });
    }

    public void mtdBotaoGerar(JButton btn, JTextField campoTexto1,
                    JLabel palavraDigitada, int posX,
                    int posY){
        btn.setBounds(posX, posY, tamanhoBotao.tamanhoX, tamanhoBotao.tamanhoY);
        btn.setBackground(Colors.black);
        btn.setForeground(Colors.white);
        btn.setFocusable(false);
        btn.setFont(new Font(Strings.fontSegoePrint, BOLD, 15));
        //
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent) {
                if (campoTexto1.getText().isEmpty()){
                    palavraDigitada.setText(Strings.noWord);
                }else{
                    palavraDigitada.setText(campoTexto1.getText());
                }
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent mouseEvent) {
                super.mouseEntered(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.green, Colors.green));
            }
        });
        btn.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent mouseEvent) {
                super.mouseExited(mouseEvent);
                btn.setBorder(BorderFactory.createEtchedBorder(Colors.white, Colors.white));

            }
        });
    }
}
