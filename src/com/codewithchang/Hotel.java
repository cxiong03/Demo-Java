package com.codewithchang;

public class Hotel {
    private String hotelName;
    private boolean isOpen;

    public Hotel(String hotelName, boolean isOpen) {
        this.hotelName = hotelName;
        this.isOpen = isOpen;
    }

    public boolean roomsAvailable() {
        if(isOpen) {
            System.out.println("We're Open!");
        } else {
            System.out.println("Sorry, ");
        }
        return true;
    }
}
