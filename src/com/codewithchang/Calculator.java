package com.codewithchang;

public class Calculator {
    public int Calculator(String input) {
        if(input.isEmpty())
            return 0;
        else
            return Integer.parseInt(input);
    }
}
