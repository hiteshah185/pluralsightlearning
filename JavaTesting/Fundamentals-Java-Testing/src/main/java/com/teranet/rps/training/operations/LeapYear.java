package com.teranet.rps.training.operations;

public class LeapYear {
        private static final int LEAP_YEAR_BASE_DIVISOR = 4;
        private static final int CENTURY_YEAR_DIVISOR = 100;
        private static final int FOUR_CENTURY_YEAR_DIVISOR = 400;
        public static boolean isLeapYear2(final int year) {
        return isDivisible(year, 4)
                && (!isDivisible(year, 100) || isDivisible(year, 400));
        }

        private static boolean isDivisible(final int year, final int denominator) {
        return year % denominator == 0;
        }

        public boolean isLeapYear(final int year) {
            return isDivisibleBy(year, LEAP_YEAR_BASE_DIVISOR)
                    && applyCenturyYearRule(year)
                    && applyFourCenturyYearRule(year);
        }

        private boolean isDivisibleBy(final int year, final int divisor) {
            return year % divisor == 0;
        }

        private boolean applyCenturyYearRule(final int year) {
            return !isDivisibleBy(year, CENTURY_YEAR_DIVISOR);
        }

        private boolean applyFourCenturyYearRule(final int year) {
            return !applyCenturyYearRule(year) || isDivisibleBy(year, FOUR_CENTURY_YEAR_DIVISOR);
        }
}
