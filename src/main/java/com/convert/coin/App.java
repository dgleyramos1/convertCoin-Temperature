package com.convert.coin;


import javax.swing.JOptionPane;

import com.convert.coin.controller.ControllerConvertCurrincies;

/**
 * Hello world!
 *
 */
public class App{

    static ControllerConvertCurrincies controller = new ControllerConvertCurrincies();
    public static void main( String[] args ) throws Exception{
        int resposta = -1;

        do {
            String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de temperatura"}, "Escolha" ).toString();



            switch(opcoes){
                case "Conversor de Moeda":
                    String input = JOptionPane.showInputDialog("Insira um valor");
                    double valor = Double.parseDouble(input);
                    controller.ConvertCurrencies(valor);
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    finish(resposta);
                    break;
            }
        } while (resposta == 0);
    }

    public static void finish(int resposta){
        if(JOptionPane.OK_OPTION == resposta){
            System.out.println("Escolha opção Afirmativa");
        } else{
            JOptionPane.showMessageDialog(null, "Progama finalizado");
        }
    }
}
