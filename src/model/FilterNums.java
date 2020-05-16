package model;

import java.util.Random;

public class FilterNums extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, nums, random);
    }

}
