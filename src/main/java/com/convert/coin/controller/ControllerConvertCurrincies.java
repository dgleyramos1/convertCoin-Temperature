package com.convert.coin.controller;

import javax.swing.JOptionPane;

import com.convert.coin.service.ServicecConvertCurrencies;

public class ControllerConvertCurrincies {

    ServicecConvertCurrencies convert = new ServicecConvertCurrencies();
    
    public void ConvertCurrencies(double valor) throws Exception{
        String opcao = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter o seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais para Dólares", "De Dóllar para Reias"}, "Escolha").toString();


        switch(opcao){
            case "De Reais para Dólares":
                convert.ConvertBrlToUsd(valor);
                break;
        }
    }
}
