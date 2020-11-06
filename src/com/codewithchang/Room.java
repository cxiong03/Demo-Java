package com.codewithchang;

public class Room {
    private boolean isCheckedIn;
    private String roomType;
    private String floor;
    private double price;

    public Room(boolean isCheckedIn, String roomType, String floor, double price) {
        this.isCheckedIn = isCheckedIn;
        this.roomType = roomType;
        this.floor = floor;
        this.price = price;
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
