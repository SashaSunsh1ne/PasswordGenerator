package model;

import java.util.Random;

public class FilterEng extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, alphabetEng, random);
    }

}