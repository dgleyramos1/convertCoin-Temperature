package com.convert.coin.service;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.convert.coin.model.Coin;
import com.google.gson.Gson;




public class ServicePrice {
    static String webService = "https://economia.awesomeapi.com.br/json/";
    static int codigoSucesso = 200;
    private static Coin newCoin;


    public static Coin PriceCoin(String coin) throws Exception{

        String urlParaChamada = webService + coin;

        URL url = new URL(urlParaChamada);

        URLConnection conn = url.openConnection();

        try {

            InputStream is = conn.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String co = "";
            List<String> jsonCoin = new ArrayList<String>();
            
            while((co = br.readLine()) != null){
                jsonCoin.add(co);
            }

            String singleString = jsonCoin.toString().replaceAll("[\\[\\]]","");

            Coin coinJson = new Gson().fromJson(singleString, Coin.class);
            
            newCoin = new Coin(coinJson.getCode(), coinJson.getCodein(), coinJson.getBid());

            System.out.println(newCoin.getCode() + " " + newCoin.getCodein() + " " + newCoin.getBid());
            return newCoin;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e.getMessage());
        }
    }
}
