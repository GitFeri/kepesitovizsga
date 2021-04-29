package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char oneChar = input.charAt(i);
            if ('0' <= oneChar && oneChar <= '9')
                sum += Integer.parseInt(String.valueOf(oneChar));
        }
        return sum;
    }
}
