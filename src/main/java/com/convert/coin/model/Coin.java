package com.convert.coin.model;


public class Coin {
    private String code;
    private String codein;
    private String bid;


    public Coin(String code, String codein, String bid) {
        this.code = code;
        this.codein = codein;
        this.bid = bid;
    }

    public Coin() {
    }

    public Coin(Coin fromJson) {
    }
    public String getCode() {
        return code;
    }
    public String getCodein() {
        return codein;
    }
    public String getBid() {
        return bid;
    }

    @Override
    public String toString() {
        return "Coin [code=" + code + ", codein=" + codein + ", bid=" + bid + "]";
    }    
}
