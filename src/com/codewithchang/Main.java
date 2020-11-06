package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("The Saint Hotel", true);
        Room room1 = new Room(true, "Standard", "1st Floor", 100);
        System.out.println(hotel1.roomsAvailable());
        System.out.println(room1.reserve());
    }
}
