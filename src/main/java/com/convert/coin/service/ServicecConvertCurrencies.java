package com.convert.coin.service;

import javax.swing.JOptionPane;

public class ServicecConvertCurrencies {
    
    public void ConvertBrlToUsd(double valor) throws Exception{

        System.out.println(ServicePrice.PriceCoin("BRL-EUR"));

        double valorMoeda = valor/5.23;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Dólares");
    }
}
