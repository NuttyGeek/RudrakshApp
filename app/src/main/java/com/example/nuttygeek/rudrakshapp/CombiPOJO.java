package com.example.nuttygeek.rudrakshapp;

/**
 * Created by nuttygeek on 18/8/17.
 */

public class CombiPOJO {

    String name;
    String[] mukhiNames;
    int[] mukhiQuantitity;

    public CombiPOJO(String name,String[] mukhiNames,int[] mukhiQuantity)
    {
        this.name=name;
        this.mukhiNames=mukhiNames;
        this.mukhiQuantitity=mukhiQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMukhiName(int position) {
        return mukhiNames[position];
    }

    public void setMukhiNames(String[] mukhiNames) {
        this.mukhiNames = mukhiNames;
    }

    public int getMukhiQuantitity(int position) {
        return mukhiQuantitity[position];
    }

    public void setMukhiQuantitity(int[] mukhiQuantitity) {
        this.mukhiQuantitity = mukhiQuantitity;
    }
}
