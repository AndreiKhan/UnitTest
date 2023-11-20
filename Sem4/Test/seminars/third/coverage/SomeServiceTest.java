package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @Test
    void testReturnFizz() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnFizzBuzz() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnValue() {
        assertThat(someService.fizzBuzz(11)).isEqualTo("11");
    }

    @Test
    void firstLast6() {
        assertThat(someService.firstLast6(new int[] {6, 5, 4, 6})).isTrue();
    }

    @Test
    void sumCorrect() {
        assertThat(someService.luckySum(1, 2, 3)).isEqualTo(6);
        assertThat(someService.luckySum(13, 2, 3)).isEqualTo(5);
        assertThat(someService.luckySum(1, 13, 3)).isEqualTo(4);
        assertThat(someService.luckySum(1, 2, 13)).isEqualTo(3);
    }
}