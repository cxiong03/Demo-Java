package com.codewithchang;

public class StandardRoom extends Room{
    private String roomNumber;
    private int amountOfRooms;

    public StandardRoom(boolean isCheckedIn, String roomType, String floor, int price, String roomNumber, int amountOfRooms) {
        super(isCheckedIn, roomType, floor, price);
        this.roomNumber = roomNumber;
        this.amountOfRooms = amountOfRooms;
    }
}
