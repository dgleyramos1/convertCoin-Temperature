package com.convert.coin;


import com.convert.coin.model.Coin;
import com.convert.coin.service.ServicePrice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception{
        Coin usdToBrl = ServicePrice.PriceCoin("USD-BRL");
    }
}
