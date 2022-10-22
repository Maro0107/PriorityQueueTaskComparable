
public class TaskComparable implements Comparable<TaskComparable>{
    private int orderId;
    private String name;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskComparable(int orderId, String name) {
        this.orderId = orderId;
        this.name = name;
    }

    @Override
    public int compareTo(TaskComparable o) {
        int a = this.orderId;
        int b = o.orderId;
         if (a==b)
            return 0;
         else if (a>b)
             return 1;
         else
             return -1;
    }

    @Override
    public String toString() {
        return "TaskComparable{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                '}';
    }
}
