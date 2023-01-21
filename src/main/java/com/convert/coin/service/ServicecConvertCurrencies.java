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
    public void ConvertUsdToBrl(double valor) throws Exception{
        Coin usdToBrl = ServicePrice.PriceCoin("USD");
        double bid = usdToBrl.getBid();
        double valorMoeda = valor * bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToArs(double valor) throws Exception {
        Coin brlToArs = ServicePrice.PriceCoin("brl-ars");
        double bid = brlToArs.getBid();
        double valorMoeda = valor*bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Pesos Argentinos");
    }
    public void ConvertArsToBrl(double valor) throws Exception {
        Coin arsToBrl = ServicePrice.PriceCoin("brl-ars");
        double bid = arsToBrl.getBid();
        double valorMoeda = valor/bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToEur(double valor) throws Exception {
        Coin brlToEur = ServicePrice.PriceCoin("brl-eur");
        double bid = brlToEur.getBid();
        double valorMoeda = valor*bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Euros");
    }
    public void ConvertEurToBrl(double valor) throws Exception {
        Coin eurToBrl = ServicePrice.PriceCoin("brl-eur");
        double bid = eurToBrl.getBid();
        double valorMoeda = valor/bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToGbp(double valor) throws Exception {
        Coin brlToGbp = ServicePrice.PriceCoin("brl-gbp");
        double bid = brlToGbp.getBid();
        double valorMoeda = valor*bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Libras Estelinas");
    }
    public void ConvertGbpToBrl(double valor) throws Exception {
        Coin gbpToBrl = ServicePrice.PriceCoin("brl-gbp");
        double bid = gbpToBrl.getBid();
        double valorMoeda = valor/bid;
        valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    
}
