package com.epam.validator;

public class PercentageOutOfBound extends Exception {
    @Override
    public String getMessage(){
        return "Indicated percentage is out of bounds.";
    }
}
