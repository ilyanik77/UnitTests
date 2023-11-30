import java.util.List;

public class AverageListValue {

    public List<Integer> list;

    public AverageListValue(List<Integer> list) {
        this.list = list;
    }

        public double averageValueList() {

            double sum = 0;
            double average = 0;

            for ( int elem : this.list) {

                sum += elem;
            }
            average = sum / this.list.size();
            return average;
        }



}

//public class AverageValue {
//    List<Integer> list = new ArrayList<>();
//    public AverageValue(List<Integer> list) {
//        this.list = list;
//    }
//
//    public double averageValue() {
//        int average = 0;
//        int sum = 0;
//        for (Integer elem : list) {
//            sum = sum + elem;
//        }
//        average = sum / list.size();
//        return average;
//    }
//}
