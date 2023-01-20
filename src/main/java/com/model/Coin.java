package com.model;

public class Coin {
    private String code;
    private String codein;
    private String bid;


    public Coin(String code, String codein, String bid) {
        this.code = code;
        this.codein = codein;
        this.bid = bid;
    }


    public String getCode() {
        return this.code;
    }

    public String getCodein() {
        return this.codein;
    }

    public String getBid() {
        return this.bid;
    }
}
