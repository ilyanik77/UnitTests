import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageCalculatorTest {

    private AverageCalculator averageCalculator;
    @BeforeEach
    private void setUp() {
        averageCalculator = new AverageCalculator();
    }


    @Test
    public void getAverageValueList() {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        AverageListValue al = new AverageListValue(list);

        double expectedAverage = 3.0;
        double actualAverage = al.averageValueList();

        Assertions.assertEquals(expectedAverage, actualAverage, 0.01);
    }

    @Test
    public void compareAveragesMore() {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        AverageListValue al1 = new AverageListValue(list1);
        AverageListValue al2 = new AverageListValue(list2);

        String expectedMessage = "Первый список имеет большее среднее значение";
        String actualMessage = averageCalculator.compareAverages(al1, al2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void compareAveragesLess() {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        AverageListValue al1 = new AverageListValue(list1);
        AverageListValue al2 = new AverageListValue(list2);

        String expectedMessage = "Второй список имеет большее среднее значение";
        String actualMessage = averageCalculator.compareAverages(al1, al2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void compareAveragesEqual() {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        AverageListValue al1 = new AverageListValue(list1);
        AverageListValue al2 = new AverageListValue(list2);

        String expectedMessage = "Средние значения списков равны";
        String actualMessage = averageCalculator.compareAverages(al1, al2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }


}

