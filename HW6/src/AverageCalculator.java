import java.util.List;

public class AverageCalculator {

    public double calculateAverage(List<Integer> numbers) {

        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public String compareAverages(List<Integer> list1, List<Integer> list2) {

        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if(average1 > average2) {
            return "Среднее значение первого списка больше среднего значения второго списка";
        } else if (average1 < average2) {
            return "Среднее значение первого списка меньше среднего значения второго списка";
        } else {
            return "Среднее значение первого списка равно среднему значению второго списка";
        }
    }
}
