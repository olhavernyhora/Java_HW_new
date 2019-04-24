package com.epam.validator;

public class LibrarySizeLessThanZero extends Exception {
    @Override
    public String getMessage(){
        return "Library size cannot be less or equal to zero.";
    }
}
