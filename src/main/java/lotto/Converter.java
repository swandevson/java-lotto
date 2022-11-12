package lotto;

import static lotto.Constant.ErrorMessage.WRONG_INPUT;

import java.util.List;
import java.util.stream.Collectors;



public class Converter {
    public static int convertToInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception exception) {
            throw new IllegalArgumentException(WRONG_INPUT);
        }
    }

    public static List<Integer> convertToIntegerList(String input) {
        List<String> splitedInput = List.of(input.split(","));

        try {
            List<Integer> numbers = splitedInput.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            return numbers;
        } catch (Exception exception) {
            throw new IllegalArgumentException(WRONG_INPUT);
        }
    }
}
