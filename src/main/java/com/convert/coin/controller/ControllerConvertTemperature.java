package com.convert.coin.controller;

import javax.swing.JOptionPane;

import com.convert.coin.service.ServiceConvertTemperature;

public class ControllerConvertTemperature {
    public void ConvertCurrencies(double valor) throws Exception{

        ServiceConvertTemperature convert = new ServiceConvertTemperature();

        String opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a unidade de temperatura que você deseja converter",
            "Temperatura",
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[]{
                "De Celsius para Fahrenheit", 
                "De Fahrenheit para Celsius", 
                "De Celsius para Kelvin",
                "De Kelvin para Celsius",
                "De Fahrenheit para Kelvin",
                "De Kelvin para Fahrenheit"
            }, 
            "Escolha").toString();


        switch(opcao){
            case "De Celsius para Fahrenheit":
                convert.ConvertCelsiusToFahrenheit(valor);
                break;
            case "De Fahrenheit para Celsius":
                convert.ConvertFahrenheitToCelsius(valor);
                break;
            case "De Celsius para Kelvin":
                convert.ConvertCelsiusToKelvin(valor);
                break;
            case "De Kelvin para Celsius": 
                convert.ConvertKelvinToCelsius(valor);
                break;
            
        }
    }
}
