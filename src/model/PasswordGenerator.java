package model;

import java.util.Random;

public class PasswordGenerator {

    private Random random;

    private char[] alphabetRus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private char[] alphabetRusSha = {'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'а', 'б', 'в', 'г'};
    private char[] alphabetRusUpper = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    private char[] alphabetRusUpperSha = {'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'А', 'Б', 'В', 'Г'};

    private char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private char[] numsSha = {'4', '5', '6', '7', '8', '9', '0', '1', '2', '3'};

    private char[] alphabetEng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] alphabetEngSha = {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd'};
    private char[] alphabetEngUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] alphabetEngUpperSha = {'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D'};

    private char[] symbols = {'.', '_', '@'};

    private int maxLenght;
    private char[] passwordCharArray;
    boolean isFirst = true;

    public PasswordGenerator(int maxLenght, Random random) {
        this.maxLenght = maxLenght;
        this.random = random;
        passwordCharArray = new char[maxLenght];
        for (int i = 0; i < passwordCharArray.length; i++) {
            passwordCharArray[i] = '*';
        }
    }

    public PasswordGenerator(String password) {
        this.maxLenght = password.length();
        this.random = new Random();
        passwordCharArray = password.toCharArray();
    }

    public void filterAddEng (){
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (isFirst) {
                passwordCharArray[i] = alphabetEng[random.nextInt(alphabetEng.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length - 1)] = alphabetEng[random.nextInt(alphabetEng.length - 1)];
        }
    }

    public void filterAddEngUpper (){
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (isFirst) {
                passwordCharArray[i] = alphabetEngUpper[random.nextInt(alphabetEngUpper.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length - 1)] = alphabetEngUpper[random.nextInt(alphabetEngUpper.length - 1)];
        }
    }

    public void filterAddRus (){
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (isFirst) {
                passwordCharArray[i] = alphabetRus[random.nextInt(alphabetRus.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length - 1)] = alphabetRus[random.nextInt(alphabetRus.length - 1)];
        }
    }

    public void filterAddRusUpper (){
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (isFirst) {
                passwordCharArray[i] = alphabetRusUpper[random.nextInt(alphabetRusUpper.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length - 1)] = alphabetRusUpper[random.nextInt(alphabetRusUpper.length - 1)];
        }
    }

    public void filterAddNums (){
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (isFirst) {
                passwordCharArray[i] = nums[random.nextInt(nums.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length - 1)] = nums[random.nextInt(nums.length - 1)];
        }
    }

    public void filterAddSymbols (){
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (isFirst) {
                passwordCharArray[i] = symbols[random.nextInt(symbols.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length - 1)] = symbols[random.nextInt(symbols.length - 1)];
        }
    }

    public void filterCode () {
        for (int i = 0; i < passwordCharArray.length; i++) {
            for (int j = 0; j < alphabetRus.length; j++){
                if (passwordCharArray[i] == alphabetRus[j]) {
                    passwordCharArray[i] = alphabetRusSha[j];
                    break;
                }
            }
            for (int j = 0; j < alphabetRusUpper.length; j++){
                if (passwordCharArray[i] == alphabetRusUpper[j]) {
                    passwordCharArray[i] = alphabetRusUpperSha[j];
                    break;
                }
            }
            for (int j = 0; j < alphabetEng.length; j++){
                if (passwordCharArray[i] == alphabetEng[j]) {
                    passwordCharArray[i] = alphabetEngSha[j];
                    break;
                }
            }
            for (int j = 0; j < alphabetEngUpper.length; j++){
                if (passwordCharArray[i] == alphabetEngUpper[j]) {
                    passwordCharArray[i] = alphabetEngUpperSha[j];
                    break;
                }
            }
            for (int j = 0; j < nums.length; j++){
                if (passwordCharArray[i] == nums[j]) {
                    passwordCharArray[i] = numsSha[j];
                    break;
                }
            }
        }
    }

    public void filterDecode () {
        for (int i = 0; i < passwordCharArray.length; i++) {
            for (int j = 0; j < alphabetRusSha.length; j++){
                if (passwordCharArray[i] == alphabetRusSha[j]) {
                    passwordCharArray[i] = alphabetRus[j];
                    break;
                }
            }
            for (int j = 0; j < alphabetRusUpperSha.length; j++){
                if (passwordCharArray[i] == alphabetRusUpperSha[j]) {
                    passwordCharArray[i] = alphabetRusUpper[j];
                    break;
                }
            }
            for (int j = 0; j < alphabetEngSha.length; j++){
                if (passwordCharArray[i] == alphabetEngSha[j]) {
                    passwordCharArray[i] = alphabetEng[j];
                    break;
                }
            }
            for (int j = 0; j < alphabetEngUpperSha.length; j++){
                if (passwordCharArray[i] == alphabetEngUpperSha[j]) {
                    passwordCharArray[i] = alphabetEngUpper[j];
                    break;
                }
            }
            for (int j = 0; j < numsSha.length; j++){
                if (passwordCharArray[i] == numsSha[j]) {
                    passwordCharArray[i] = nums[j];
                    break;
                }
            }
        }
    }

    public String toString() {
        String passwordString = new String(passwordCharArray);
        return passwordString;
    }
}
