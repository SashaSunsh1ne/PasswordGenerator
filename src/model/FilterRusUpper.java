package model;

import java.util.Random;

public class FilterRusUpper extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, alphabetRusUpper, random);
    }

}
