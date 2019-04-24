package com.epam.validator;

import java.util.Calendar;

public class SearchYearOutOfBound extends Exception {
    Calendar cal = Calendar.getInstance();
    @Override
    public String getMessage(){
        return "Year has to be greater than 0 and earlier than " + cal.get(Calendar.YEAR);
    }
}

