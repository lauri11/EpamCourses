package com.epam.courses.devices;

/**
 * Created by Lena on 12/3/2014.
 */
public class Laptop extends Mobile {
    public String getMaker(){
        return super.getMaker() + "Laptop";
    }

    public void powerOff(){
        System.out.println("Power Off");
    }
}
