package com.company.Entities;

/**
 * Created by Serhii_Kobzar on 9/20/2016.
 */
public class Adress {

    private String index;
    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;

    @Override
    public String toString() {
        return "Adress{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }

    public Adress(String str) {
        String [] adrArr = str.split(",");
        this.index = adrArr[0];
        this.city = adrArr[1];
        this.street = adrArr[2];
        this.houseNumber = adrArr[3];
        this.flatNumber = adrArr[4];
    }

}
