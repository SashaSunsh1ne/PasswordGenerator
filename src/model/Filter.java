package model;

import java.util.Random;

public interface Filter {
    char[] addFilter(char[] passwordCharArray, Random r);
}
