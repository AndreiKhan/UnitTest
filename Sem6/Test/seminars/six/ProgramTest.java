package seminars.six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class ProgramTest {

    Program programTest;
    List<Integer> listTest1;
    List<Integer> listTest2;

    @BeforeEach
    void setUp() {
        // заранее создал экземпляр и списки(в первом списке среднее значение меньше, во втором списке среднее значение больше)
        programTest = new Program();
        listTest1 = new ArrayList<Integer>(Arrays.asList(2564, 5897, -2465)); // среднее значение меньше
        listTest2 = new ArrayList<Integer>(Arrays.asList(4352, 0, 4867, 5687)); // среднее значение больше
    }

    @Test
    void listAverageFirst() {
        // первый список отправляю вторым
        assertThat(programTest.listAverage(listTest2, listTest1)).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    void listAverageSecond() {
        // первый список отправляю первым
        assertThat(programTest.listAverage(listTest1, listTest2)).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void listAverageBoth() {
        // первый список отправляю дважды
        assertThat(programTest.listAverage(listTest1, listTest1)).isEqualTo("Средние значения равны");
    }
}
