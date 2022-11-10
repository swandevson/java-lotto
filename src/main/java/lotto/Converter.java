package lotto;

import java.util.List;
import java.util.stream.Collectors;

public class Converter {
    public static int convertMoneyInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch(Exception exception) {
            throw new IllegalArgumentException();
        }
    }

    public static List<Integer> convertNumbersInput(String input) {
        List<String> splitedInput = List.of(input.split(","));


        try {
            List<Integer> numbers = splitedInput.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            return numbers;
        } catch (Exception exception) {
            throw new IllegalArgumentException();
        }

    }

    public static int convertBonusNumberInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception exception) {
            throw new IllegalArgumentException();
        }
    }
}
