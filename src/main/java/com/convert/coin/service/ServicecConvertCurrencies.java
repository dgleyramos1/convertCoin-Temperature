package com.convert.coin.service;

import javax.swing.JOptionPane;

import com.convert.coin.model.Coin;

public class ServicecConvertCurrencies {
    
    public void ConvertBrlToUsd(double valor) throws Exception{

        Coin brlToUsd = ServicePrice.PriceCoin("USD");
        double bid = brlToUsd.getBid();
        double valorMoeda = valor/bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Dólares");
    }
}
