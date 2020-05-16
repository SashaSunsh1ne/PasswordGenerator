package model;

import java.util.Random;

public class FilterCode extends  SuperForFilters implements Filter {

    @Override
    public char[] addFilter(char[] passwordCharArray, Random random) {
        return filter(passwordCharArray, alphabetRus, alphabetRusSha, alphabetRusUpper, alphabetRusUpperSha, alphabetEng, alphabetEngSha, alphabetEngUpper, alphabetEngUpperSha, nums, numsSha);
    }

}

