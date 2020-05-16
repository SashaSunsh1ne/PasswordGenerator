package model;

import java.util.Random;

public class SuperForFilters {

    static final char[] alphabetRus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    static final char[] alphabetRusSha = {'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'а', 'б', 'в', 'г'};
    static final char[] alphabetRusUpper = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    static final char[] alphabetRusUpperSha = {'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'А', 'Б', 'В', 'Г'};

    static final char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] numsSha = {'4', '5', '6', '7', '8', '9', '0', '1', '2', '3'};

    static final char[] alphabetEng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final char[] alphabetEngSha = {'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd'};
    static final char[] alphabetEngUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static final char[] alphabetEngUpperSha = {'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D'};

    static final char[] symbols = {'.', '_', '@'};

    public char[] filter(char[] passwordCharArray, char[] alphabet, Random random) {
        for (int i = 0; i < passwordCharArray.length; i++) {
            if (passwordCharArray[i] == '*') {
                passwordCharArray[i] = alphabet[random.nextInt(alphabet.length)];
            }
        }
        for (int i = 0; i < 4; i++) {
            passwordCharArray[random.nextInt(passwordCharArray.length)] = alphabet[random.nextInt(alphabet.length)];
        }
        return passwordCharArray;
    }

    public char[] filter(char[] passwordCharArray, char[]... alphabets) {
        for (int i = 0; i < passwordCharArray.length; i++) {
            for (int j = 0; j < alphabets.length - 1; j+=2) {
                for (int k = 0; k < alphabets[j].length; k++){
                    if (passwordCharArray[i] == alphabets[j][k]) {
                        passwordCharArray[i] = alphabets[j + 1][k];
                        break;
                    }
                }
            }
        }
        return passwordCharArray;
    }
}
