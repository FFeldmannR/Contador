package com.feldmann;
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.feldmann.BotaoGerar;

import static java.awt.Font.BOLD;

//
public class Main {
    public void actionPerformed(JTextField campoTexto1, JLabel palavraDigitada) {
        if (campoTexto1.getText().isEmpty()){
            palavraDigitada.setText(strings.noWord);
        }else{
            palavraDigitada.setText(campoTexto1.getText());
        }
    }

    //
    public static void main(String[] args) {
        //
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JTextField campoTexto1 = new JTextField();
        JLabel labelContador = new JLabel(strings.numclic);
        JLabel labelNumeroContador = new JLabel(strings.zero);
        JButton botaoSair = new JButton(strings.btnSair);
        JButton botaoMais = new JButton(strings.btnCont);
        JButton botaoReset = new JButton(strings.btnReset);
        JButton botaoGerar = new JButton(strings.btnGerar);
        JLabel palavraDigitada = new JLabel("Sua palavra aparecerá aqui");
        //
        Container ct = frame.getContentPane();
        ct.setLayout(null);
        //

        //ADICIONA COMPONENTES NO JPANEL
            panel.add(panel2);
            panel2.add(labelContador);
            panel2.add(labelNumeroContador);
        //

        //ADICIONA COMPONENTES NO CONTAINER
            ct.add(panel2);
            ct.add(botaoSair);
            ct.add(botaoMais);
            ct.add(campoTexto1);
            ct.add(botaoReset);
            ct.add(botaoGerar);
            ct.add(palavraDigitada);
        //

        //CONFIGURAÇÕES DO JBUTTON BOTAOSAIR
            botaoSair.setBounds(configBtnSair.posX, configBtnSair.posY, configBtnSair.X, configBtnSair.Y);//posX, posY, X, Y
            botaoSair.setBackground(colors.black);
            botaoSair.setFont(new Font(strings.fontSegoePrint, BOLD, 15));
            botaoSair.setForeground(colors.white);
            botaoSair.setFocusable(false);
            //
            botaoSair.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent mouseEvent) {
                    super.mouseEntered(mouseEvent);
                    botaoSair.setBorder(BorderFactory.createEtchedBorder(colors.green, colors.green));
                }
            });
            botaoSair.addMouseListener(new MouseAdapter() {
                public void mouseExited(MouseEvent mouseEvent) {
                    super.mouseExited(mouseEvent);
                    botaoSair.setBorder(BorderFactory.createEtchedBorder(colors.white, colors.white));
                }
            });
            //
            botaoSair.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //
                    JFrame janelaSair = new JFrame();
                    JPanel pn = new JPanel();
                    JLabel msg = new JLabel(strings.msgSair);
                    JButton btnSim = new JButton(strings.janelaSairBtnSim);
                    JButton btnNao = new JButton(strings.janelaSairBtnNao);
                    Container ctn = janelaSair.getContentPane();
                    ctn.setLayout(null);
                    //
                    ctn.add(btnNao);
                    ctn.add(btnSim);
                    ctn.add(msg);
                    pn.setBackground(colors.black);
                    ctn.setBackground(colors.black);
                    msg.setForeground(colors.white);
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
                    btnNao.setFont(new Font(strings.fontSegoePrint, BOLD,12));
                    btnNao.setBackground(colors.white);
                    btnNao.setForeground(colors.black);
                    btnNao.setFocusable(false);
                    btnNao.addMouseListener(new MouseAdapter() {
                        public void mouseEntered(MouseEvent mouseEvent) {
                            super.mouseEntered(mouseEvent);
                            btnNao.setBorder(BorderFactory.createEtchedBorder(colors.blue, colors.blue));
                        }
                    });
                    btnNao.addMouseListener(new MouseAdapter() {
                        public void mouseExited(MouseEvent mouseEvent) {
                            super.mouseExited(mouseEvent);
                            btnNao.setBorder(BorderFactory.createEtchedBorder(colors.white, colors.white));
                        }
                    });
                    //
                    btnSim.setBounds(posBtnSimX,posBtnSimY,tamanhoBotaoX,tamanhoBotaoY);
                    btnSim.setFont(new Font(strings.fontSegoePrint, BOLD, 12));
                    btnSim.setForeground(colors.black);
                    btnSim.setBackground(colors.white);
                    btnSim.setFocusable(false);
                    btnSim.addMouseListener(new MouseAdapter() {
                        public void mouseEntered(MouseEvent mouseEvent) {
                            super.mouseEntered(mouseEvent);
                            btnSim.setBorder(BorderFactory.createEtchedBorder(colors.blue, colors.blue));
                        }
                    });
                    btnSim.addMouseListener(new MouseAdapter() {
                        public void mouseExited(MouseEvent mouseEvent) {
                            super.mouseExited(mouseEvent);
                            btnSim.setBorder(BorderFactory.createEtchedBorder(colors.white, colors.white));
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
                    janelaSair.setBackground(colors.black);
                    janelaSair.pack( );
                    janelaSair.show( );
                    janelaSair.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    //
                    //
                    btnSim.addActionListener(new java.awt.event.ActionListener(){
                        public void actionPerformed(java.awt.event.ActionEvent event){
                            System.out.println(strings.closing);
                            System.exit(0);
                        }
                    });
                    //
                    //
                    btnNao.addActionListener(new java.awt.event.ActionListener(){
                        public void actionPerformed(java.awt.event.ActionEvent event){
                            janelaSair.dispose();
                        }
                    });
                    //
                }
            });
        //FIM DO BOTAOSAIR

        //CONFIGURAÇÕES DO PANEL2
            panel2.setBounds(configPanel2.posX, configPanel2.posY, configPanel2.X, configPanel2.Y);//posX, posY, X, Y
        //
        //CONFIGURAÇÕES DA LABEL1
            //panel2.setBorder(BorderFactory.createEtchedBorder());//borda no panel das labels
            labelContador.setFont(new Font(strings.fontSegoePrint, BOLD, 30));//edita o texto da label 1
            labelContador.setText(strings.numclic);
        //
        //CONFIGURAÇÕES DA LABEL2
            labelNumeroContador.setFont(new Font(strings.fontSegoePrint, BOLD, 30));//edita o texto da label 2
            labelNumeroContador.setText(strings.zero);
        //

        //CONFIGURAÇÕES DO JBUTTON BOTAOMAIS
            botaoMais.setBounds(configBtnMais.posX, configBtnMais.posY, configBtnMais.X, configBtnMais.Y);//posX, posY, X, Y
            botaoMais.setBackground(colors.black);
            botaoMais.setFont(new Font(strings.fontSegoePrint, BOLD, 15));
            botaoMais.setForeground(colors.white);
            botaoMais.setFocusable(false);
            botaoMais.addActionListener(new java.awt.event.ActionListener() {
                //int i=0;
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    numero.i=numero.i+1;
                    labelNumeroContador.setText((Integer.toString(numero.i)));
                }
            });
            botaoMais.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent mouseEvent) {
                    super.mouseEntered(mouseEvent);
                    botaoMais.setBorder(BorderFactory.createEtchedBorder(colors.green, colors.green));
                }
            });
            botaoMais.addMouseListener(new MouseAdapter() {
                public void mouseExited(MouseEvent mouseEvent) {
                    super.mouseExited(mouseEvent);
                    botaoMais.setBorder(BorderFactory.createEtchedBorder(colors.white, colors.white));
                }
            });
        //FIM BOTAOMAIS

        //CONFIGURAÇÕES BOTAO RESET
            botaoReset.setBounds(configBtnReset.posX, configBtnReset.posY, configBtnReset.X, configBtnReset.Y);
            botaoReset.setFont(new Font(strings.fontSegoePrint, BOLD, 15));
            botaoReset.setForeground(colors.white);
            botaoReset.setBackground(colors.black);
            botaoReset.setFocusable(false);
            botaoReset.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(ActionEvent actionEvent) {
                    labelNumeroContador.setText(strings.zero);
                    numero.i = 0;
                }
            });
            botaoReset.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent mouseEvent) {
                    super.mouseEntered(mouseEvent);
                    botaoReset.setBorder(BorderFactory.createEtchedBorder(colors.green, colors.green));
                }
            });
            botaoReset.addMouseListener(new MouseAdapter() {
                public void mouseExited(MouseEvent mouseEvent) {
                    super.mouseExited(mouseEvent);
                    botaoReset.setBorder(BorderFactory.createEtchedBorder(colors.white, colors.white));
                }
            });
        //

        //CONFIGURAÇÕES CAMPO DE TEXTO 1
            campoTexto1.setFocusable(true);
            campoTexto1.setBounds(configCampoTexto1.posX, configCampoTexto1.posY,configCampoTexto1.X,configCampoTexto1.Y);
        //

        //FUNÇÃO BOTAO GERAR
            BotaoGerar hue = new BotaoGerar();
            hue.mtd(botaoMais, campoTexto1, labelContador, 0, 0, tamanhoBotao.tamanhoX, tamanhoBotao.tamanhoY);
            hue.mtd(botaoGerar, campoTexto1, palavraDigitada , 200, 200, tamanhoBotao.tamanhoX, tamanhoBotao.tamanhoY);
        //

        //CONFIGURAÇÕES LABEL PALAVRA DIGITADA
            palavraDigitada.setBounds(configCampoTexto1.posX, configBtnGerar.posY+60, configCampoTexto1.X, configCampoTexto1.Y);
            palavraDigitada.setFont(new Font(strings.fontSegoePrint, BOLD, 12));
            palavraDigitada.setHorizontalAlignment(0);//alinhamento vertical centralizado
        //

        //CONFIGURAÇÕES DO JFRAME
            frame.setBounds(configJFrame.posX, configJFrame.posY, configJFrame.X, configJFrame.Y);//posição na tela
            frame.setPreferredSize(new Dimension(configJFrame.X, configJFrame.Y));//tamanho da janela
            frame.setUndecorated(true);
            frame.getContentPane().add(panel);
            frame.pack( );
            //frame.show( );
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //

    }//fim metodo main
}//fim classe main
