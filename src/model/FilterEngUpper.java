package model;

import java.util.Random;

public class FilterEngUpper extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, alphabetEngUpper, random);
    }

}