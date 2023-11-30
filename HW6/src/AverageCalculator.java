import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    AverageListValue listValue1 = new AverageListValue(list1);
    AverageListValue listValue2 = new AverageListValue(list2);




    public String compareAverages(AverageListValue listValue1, AverageListValue listValue2) {

        double average1 = listValue1.averageValueList();
        double average2 = listValue2.averageValueList();

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения списков равны";
    }

}


