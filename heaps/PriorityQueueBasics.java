import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBasics {

    // PQ for objects
    // We want to priortise students based on basis of rank.
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(4);
        pq.add(90);
        pq.add(40);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(10);
        pq2.add(4);
        pq2.add(90);
        pq2.add(40);
        pq2.add(1);

        System.out.println("In reverse way");
        while (!pq2.isEmpty()) {
            System.out.println(pq2.peek());
            pq2.remove();
        }


        PriorityQueue<Student> stu = new PriorityQueue<>();

        stu.add(new Student("ram", 10));
        stu.add(new Student("ramu", 43));
        stu.add(new Student("bhavy", 1));
        stu.add(new Student("tonu", 56));
        stu.add(new Student("monu", 100));

        System.out.println("Objects:-\n--------------------------");
        while (!stu.isEmpty()) {
            System.out.print(stu.peek().name);
            System.out.println(" - "+stu.peek().rank);
            System.out.println("--------------------------");
            stu.remove();
        }
    }
}
