package com.convert.coin.controller;

import javax.swing.JOptionPane;

import com.convert.coin.service.ServicecConvertCurrencies;

public class ControllerConvertCurrincies {

    ServicecConvertCurrencies convert = new ServicecConvertCurrencies();
    
    public void ConvertCurrencies(double valor) throws Exception{
        String opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a moeda para a qual você deseja converter o seu dinheiro",
            "Moedas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[]{
                "De Real para Dólar", 
                "De Dólar para Real", 
                "De Real para Peso Argentino", 
                "De Peso Argentino para Real",
                "De Real para Euro",
                "De Euro para Real",
                "De Real para Libra Estelina",
                "De Libra Estelina para Real",
                "De Real para Peso Chileno",
                "De Peso Chileno para Real"
            }, 
            "Escolha").toString();


        switch(opcao){
            case "De Real para Dólar":
                convert.ConvertBrlToUsd(valor);
                break;
            case "De Dólar para Real":
                convert.ConvertUsdToBrl(valor);
                break;
            case "De Real para Peso Argentino":
                convert.ConvertBrlToArs(valor);
                break;
            case "De Peso Argentino para Real":
                convert.ConvertArsToBrl(valor);
                break;
            case "De Real para Euro":
                convert.ConvertBrlToEur(valor);
                break;
            case "De Euro para Real":
                convert.ConvertEurToBrl(valor);
                break;
            case "De Real para Libra Estelina":
                convert.ConvertBrlToGbp(valor);
                break;
            case "De Libra Estelina para Real":
                convert.ConvertGbpToBrl(valor);
                break;
            case "De Real para Peso Chileno":
                convert.ConvertBrlToClp(valor);
                break;
            case "De Peso Chileno para Real":
                convert.ConvertClpToBrl(valor);
                break;
        }
    }
}
