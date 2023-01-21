package com.convert.coin.service;

import javax.swing.JOptionPane;

public class ServiceConvertTemperature {
    
    public void ConvertCelsiusToFahrenheit(double valor){

        double fahrenheit = (valor * 1.8) + 32;

        JOptionPane.showMessageDialog(null, "Valor em Celsius " + valor + " convertido em Fahrenheit " + fahrenheit);
    }
}
