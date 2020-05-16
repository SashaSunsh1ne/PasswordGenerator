package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PasswordGenerator {

    private char[] passwordCharArray;
    private ArrayList<Filter> filters = new ArrayList<>();
    private Random random = new Random();

    public PasswordGenerator(int passwordLength, ArrayList<Filter> filters) {
        passwordCharArray = new char[passwordLength];
        Arrays.fill(passwordCharArray, '*');
        this.filters.addAll(filters);
    }

    public PasswordGenerator(String password, Filter... filters) {
        passwordCharArray = password.toCharArray();
        this.filters.addAll(Arrays.asList(filters));
    }

    public String createPassword () {
        filters.forEach(filter -> passwordCharArray = filter.addFilter(passwordCharArray, random));
        return new String(passwordCharArray);
    }
}
