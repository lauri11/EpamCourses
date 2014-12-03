package com.epam.courses.devices;

/**
 * Created by Lena on 12/3/2014.
 */
public class Device {
    protected String maker = "someMaker";
    protected String model;

    public String getMaker(){
        return maker;
    }

    public String getMaker(String any){
        return maker + " " + any;
    }
}
