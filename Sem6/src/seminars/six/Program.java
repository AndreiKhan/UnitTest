package seminars.six;

import java.util.List;

public class Program {

    public String listAverage(List<Integer> list1, List<Integer> list2) {

        int sum1 = 0;
        int sum2 = 0;

        for (int num : list1) {
            sum1 += num;
        }

        for (int num : list2) {
            sum2 += num;
        }


        double average1 = sum1 / list1.size();
        double average2 = sum2 / list2.size();

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";

        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";

        } else {
            return "Средние значения равны";
        }
    }
}

