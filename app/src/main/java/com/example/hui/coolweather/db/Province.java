package com.example.hui.coolweather.db;

/**
 * Created by hui on 2018/2/11.
 */

public class Province {
    private int id;

    private String proviceName;

    private int proviceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProviceName(){
        return  proviceName;
    }

    public void setProviceName(String proviceName){
        this.proviceName = proviceName;
    }

    public int getProviceCode(){
        return proviceCode;
    }

    public void setProviceCode(int proviceCode){
        this.proviceCode = proviceCode;
    }

}
