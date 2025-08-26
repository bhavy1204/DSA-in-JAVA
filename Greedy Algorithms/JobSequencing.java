import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {

    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            this.id = i;
            this.profit = p;
            this.deadline = d;
        }

    }

    public static void main(String[] args) {
        int jobSequence[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobSequence.length; i++) {
            jobs.add(new Job(i, jobSequence[i][0], jobSequence[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // desceding order of profit. a,b are objects

        ArrayList<Integer> seq = new ArrayList<>();

        int time =0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);

            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }

        }

        System.out.println("max jobs : "+ seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println("\nTotal time " + time);

    }
}
