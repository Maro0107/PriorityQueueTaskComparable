import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<TaskComparable> test = new PriorityQueue<>();

        test.add(new TaskComparable(3,"trzy"));
        test.add(new TaskComparable(4,"cztery"));
        test.add(new TaskComparable(1,"jeden"));
        test.add(new TaskComparable(2,"dwa"));

        while (!test.isEmpty()){
            System.out.println(test.poll());
        }
    }
}
