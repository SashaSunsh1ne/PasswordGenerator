package model;

import java.util.Random;

public class FilterSymbols extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, symbols, random);
    }

}
