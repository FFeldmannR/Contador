package com.feldmann;
//
import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

//
public class Main {
    //
    public static void main(String[] args) {
        //
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JButton botaoSair = new JButton(Strings.btnSair);
        JLabel labelContador = new JLabel(Strings.numclic);
        JLabel labelNumeroContador = new JLabel(Strings.zero);
        JButton botaoMais = new JButton(Strings.btnCont);
        JButton botaoReset = new JButton(Strings.btnReset);
        JTextField campoTexto1 = new JTextField();
        JButton botaoGerar = new JButton(Strings.btnGerar);
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

        //BOTAOSAIR
            configBotoes btnSair = new configBotoes();
            btnSair.mtdBotaoSair(botaoSair, configJFrame.X-47, 2);
        //

        //PANEL2
            panel2.setBounds(configPanel2.posX, configPanel2.posY, configPanel2.X, configPanel2.Y);//posX, posY, X, Y
        //

        //LABEL CONTADOR
            labelContador.setFont(new Font(Strings.fontSegoePrint, BOLD, 30));//edita o texto da label 1
            labelContador.setText(Strings.numclic);
        //

        //LABEL NUMERO CONTADOR
            labelNumeroContador.setFont(new Font(Strings.fontSegoePrint, BOLD, 30));//edita o texto da label 2
            labelNumeroContador.setText(Strings.zero);
        //

        //BOTAOMAIS
            configBotoes btnMais = new configBotoes();
            btnMais.mtdBotaoMais(botaoMais, labelNumeroContador, 140, configPanel2.posY+100);
        //

        //BOTAO RESET
            configBotoes btnReset = new configBotoes();
            btnReset.mtdBotaoReset(botaoReset, labelNumeroContador, 140+tamanhoBotao.tamanhoX+10, 200/*posY do panel2(100) + 100*/);
        //

        //CONFIGURAÇÕES CAMPO DE TEXTO 1
            campoTexto1.setFocusable(true);
            campoTexto1.setBounds(configCampoTexto1.posX, configCampoTexto1.posY,configCampoTexto1.X,configCampoTexto1.Y);
        //

        //FUNÇÃO BOTAO GERAR
            configBotoes configBtn = new configBotoes();
            configBtn.mtdBotaoGerar(botaoGerar, campoTexto1, palavraDigitada,
                                configCampoTexto1.posX+60, configCampoTexto1.posY+configCampoTexto1.Y+10);
        //

        //CONFIGURAÇÕES LABEL PALAVRA DIGITADA
            palavraDigitada.setBounds(configCampoTexto1.posX, configCampoTexto1.posY+configCampoTexto1.Y+tamanhoBotao.tamanhoY+20, configCampoTexto1.X, configCampoTexto1.Y);
            palavraDigitada.setFont(new Font(Strings.fontSegoePrint, BOLD, 12));
            palavraDigitada.setHorizontalAlignment(0);//alinhamento vertical centralizado
        //

        //CONFIGURAÇÕES DO JFRAME
            configJFrame propJFrame = new configJFrame();
            propJFrame.jFrame(frame, panel);
        //

    }//fim metodo main
}//fim classe main