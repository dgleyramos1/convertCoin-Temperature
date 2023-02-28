package com.convert.coin;

import javax.swing.JOptionPane;

import com.convert.coin.controller.ControllerConvertCurrincies;
import com.convert.coin.controller.ControllerConvertTemperature;

/**
 * Hello world!
 *
 */
public class App {

    static ControllerConvertCurrincies controllerCoin = new ControllerConvertCurrincies();
    static ControllerConvertTemperature controllerTemperature = new ControllerConvertTemperature();

    public static void main(String[] args) throws Exception {
        int resposta = -1;

        do {
            String opcoes = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.OK_CANCEL_OPTION,
                    null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha");

            if (opcoes == null) {
                return;
            }

            switch (opcoes) {
                case "Conversor de Moeda":
                    String coin = JOptionPane.showInputDialog("Insira um valor");
                    if (coin.matches("^[A-Za-z]*")) {
                        resposta = JOptionPane.showConfirmDialog(null,
                                "Por favor, coloque somente números! Deseja continuar?");
                        finish(resposta);
                        break;
                    }
                    double valor = Double.parseDouble(coin);
                    controllerCoin.ConvertCurrencies(valor);
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    finish(resposta);
                    break;
                case "Conversor de Temperatura":
                    String temperature = JOptionPane.showInputDialog("Insira um valo");
                    if (temperature.matches("^[A-Za-z]*")) {
                        resposta = JOptionPane.showConfirmDialog(null,
                                "Por favor, coloque somente números! Deseja continuar?");
                        finish(resposta);
                        break;
                    }
                    double graus = Double.parseDouble(temperature);
                    controllerTemperature.ConvertCurrencies(graus);
                    resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    finish(resposta);
                    break;
            }
        } while (resposta == 0);
    }

    public static void finish(int resposta) {
        if (JOptionPane.OK_OPTION == resposta) {
            System.out.println("Escolha opção Afirmativa");
        } else {
            JOptionPane.showMessageDialog(null, "Progama finalizado");
        }
    }
}
