package com.convert.coin.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.convert.coin.model.Coin;
import com.google.gson.Gson;



public class ServicePrice {
    static String webService = "https://economia.awesomeapi.com.br/json/last/";
    static int codigoSucesso = 200;

    Coin coin;


    public static Coin PriceCoin(Coin coin) throws Exception{

        String urlParaChamada = webService + coin;

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conn.getResponseCode());

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output = "";
            String line;
            while ((line = br.readLine()) != null) {
                output += line;
            }

            conn.disconnect();


            Gson gson = new Gson();

            coin = gson.fromJson(new String(output.getBytes()), Coin.class);

            return coin;
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
