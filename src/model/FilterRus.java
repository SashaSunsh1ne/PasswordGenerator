package model;

import java.util.Random;

public class FilterRus extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, alphabetRus, random);
    }

}
