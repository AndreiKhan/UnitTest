package seminars.third.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import seminars.third.hw.MainHW;

import static org.assertj.core.api.Assertions.*;

public class MainHWTest {
    MainHW mainHW = new MainHW();

    @ParameterizedTest
    @CsvSource({"2", "3", "0", "5", "-12", "1", "100"})
    void evenOddNumber(int a) {
        assertThat(mainHW.evenOddNumber(a)).isEqualTo(a % 2 == 0);
    }

    @ParameterizedTest
    @CsvSource({"-4", "16", "35", "100", "25", "78", "945", "56", "0"})
    void numberInInterval(int a) {
        assertThat(mainHW.numberInInterval(a)).isEqualTo(25 < a && a < 100);
    }
}
