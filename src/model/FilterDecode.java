package model;

import java.util.Random;

public class FilterDecode extends SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, alphabetRusSha, alphabetRus, alphabetRusUpperSha, alphabetRusUpper, alphabetEngSha, alphabetEng, alphabetEngUpperSha, alphabetEngUpper, numsSha, nums);
    }

}

