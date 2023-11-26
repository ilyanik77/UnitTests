import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.AbstractList;
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
    public void calculateAverageTest() {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        double expectedAverage = 3.0;
        double actualAverage = averageCalculator.calculateAverage(numbers);
        Assertions.assertEquals(expectedAverage, actualAverage, 0.01);
    }

    @Test
    public void compareAveragesTest() {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        String expectedMessage = "Среднее значение первого списка меньше среднего значения второго списка";
        String actualMessage = averageCalculator.compareAverages(list1, list2);

        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
