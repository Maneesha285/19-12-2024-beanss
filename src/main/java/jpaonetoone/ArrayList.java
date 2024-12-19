package jpaonetoone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        long starttime;
        long endTime;
        long total;
        starttime=System.nanoTime();
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> b = Arrays.asList(3,4,5,6,7,8,9,10,11,12);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                int c = b.get(j);
                if (a.get(i).equals(c)) {
                    System.out.println(c);
                }
            }
        }
        endTime =System.nanoTime();
        total=endTime-starttime;

        System.out.println("Execution time: " + (total ) + " milliseconds");

        long timeSet = System.nanoTime();
        List<Integer> a1= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        List<Integer> b1 = Arrays.asList(3,4,5,6,7,8,9,10,11,12);


        HashSet<Integer> common=new HashSet<>(b1);
        for (int list :a1){
            if(common.contains(list)){
                System.out.println(list);
            }
        }
        long end=System.nanoTime();
        long totalTime=end-timeSet;


        System.out.println("Execution time: " + (totalTime) + " milliseconds");


    }
}
