package com.epam.Task2;

/**
 * Created by skarzhynskaya_katya on 1/20/17.
 */

public class Customer {

    private String GoodName;
    private int number;
    private Shop sh;

    public Customer(String goodName, int number, Shop sh) {
        GoodName = goodName;
        this.number = number;
        this.sh = sh;

    }

    public void getToRent(String GoodName){
        boolean availability = sh.isInShop(GoodName); // вызвали метод из шопа со строкой названия
        if (availability) {
            sh.getGood(GoodName);
        } else {
            System.out.println("We don't have such equipment");
        }
    }


}
