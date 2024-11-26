
import java.util.*;

public class JobSequencingProblem {

    static class job {

        int deadLine;
        int profit;
        int id;    //0,1,2,3

        public job(int i, int d, int p) {
            id = i;
            deadLine = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<job> jobs = new ArrayList();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);  //descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadLine > time) {
                seq.add(curr.id);
                time++;
            }
        }
        //print seq
        System.out.println("max jobs =" + seq.size());

        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i) + " ");

        }
        System.out.println();
    }
}
