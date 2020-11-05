package com.codewithchang;

public class Hotel {
    private boolean isCheckedIn;
    private boolean isCheckedOut;

    public Hotel(boolean isCheckedIn, boolean isCheckedOut) {
        this.isCheckedIn = isCheckedIn;
        this.isCheckedOut = isCheckedOut;
    }

    public boolean reserve() {
        if(this.isCheckedIn) {
            System.out.println("This room is Occupied.");
        } else {
            System.out.println("This room is available.");
        }
        return true;
    }
}
