package com.epam.courses.devices;

/**
 * Created by Lena on 12/3/2014.
 */
public class Mobile extends Device {
    public String getMaker(){
        return super.getMaker() + "Mobile";
    }

    public String getMaker(String any, int num){
        return maker + " " + any + " " + num;
    }
}
