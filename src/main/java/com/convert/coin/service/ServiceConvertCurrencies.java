package com.convert.coin.service;

import javax.swing.JOptionPane;

public class ServiceConvertCurrencies {
    public void ConvertBrlToUsd(double valor) throws Exception{
        double valorMoeda = Convert(valor, "brl-usd", false);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Dólares");
    }
    public void ConvertUsdToBrl(double valor) throws Exception{
        double valorMoeda = Convert(valor, "brl-usd", true);
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToArs(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-ars", false);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Pesos Argentinos");
    }
    public void ConvertArsToBrl(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-ars", true);
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToEur(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-eur", false);
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Euros");
    }
    public void ConvertEurToBrl(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-eur", true);
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToGbp(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-gbp", false);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Libras Estelinas");
    }
    public void ConvertGbpToBrl(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-gbp", true);
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public void ConvertBrlToClp(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-clp", false);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valorMoeda + " Libras Estelinas");
    }
    public void ConvertClpToBrl(double valor) throws Exception {
        double valorMoeda = Convert(valor, "brl-clp", true);
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valorMoeda + " Reais");
    }
    public double Convert(double valor, String moeda, boolean toBrl) throws Exception{
        double bid = ServicePrice.PriceCoin(moeda).getBid();
        double valorMoeda;
        if(toBrl){
            valorMoeda  = valor / bid;
        }else{
            valorMoeda = valor * bid;
        }
        return valorMoeda = (double) Math.round(valorMoeda * 100d) / 100;
    }
}
