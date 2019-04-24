package com.epam.validator;

import java.util.Calendar;

public class Validator {

    public static void validateLibrarySize(int number) throws LibrarySizeLessThanZero{
        if (number <= 0) {
            throw new LibrarySizeLessThanZero();}
    }
    public static void validateSearchYear(int number) throws SearchYearOutOfBound{
        Calendar cal = Calendar.getInstance();
        if (number <= 0 || number > cal.get(Calendar.YEAR)) {
            throw new SearchYearOutOfBound();}
    }
    public static void validateDiscount(double percent) throws PercentageOutOfBound {
        if (percent < -100 || percent > 100) {
            throw new PercentageOutOfBound();
        }
    }
}

