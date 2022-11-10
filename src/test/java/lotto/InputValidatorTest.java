package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;



class InputValidatorTest {
    @DisplayName("입력한 당첨번호에 ','와 숫자가 아닌 문자가 존재하면 예외를 던진다.")
    @Test
    void inputNumbersByInvalidSeparator() {
        String input = "1, 3, 2, 5, 4- 5";

        assertThatThrownBy(() -> Converter.convertNumbersInput(input))
                .isInstanceOf(IllegalArgumentException.class);
       }

    @DisplayName("사용자가 올바르지 않은 money를 넣을 시 예외를 던진다")
    @Test
    void inputMoneyByInvalidForm() {
        String input = "1,000";

        assertThatThrownBy(() -> Converter.convertMoneyInput(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("사용자가 숫자가 아닌 보너스 숫자를 넣을 시 예외를 던진다")
    @Test
    void inputBonusNumberByInvalidForm() {
        String input = "일";

        assertThatThrownBy(() -> Converter.convertBonusNumberInput(input))
                .isInstanceOf(IllegalArgumentException.class);
    }



}
