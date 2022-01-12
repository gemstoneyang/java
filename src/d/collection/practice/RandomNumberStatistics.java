package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
    
    public static void main(String[] args) {
        RandomNumberStatistics statis = new RandomNumberStatistics();
        statis.getRandomNumberStatistics();
    }
    public void getRandomNumberStatistics() {
        Random random = new Random();
        for(int i=0; i < 5000; i++) {
            int num = random.nextInt(50) + 1;
            putCurrentNumber(num);
        }
        printStatistics();
    }
    public void putCurrentNumber(int tempNumber) {
        if(hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber)+1);
        }
        else {
            hashtable.put(tempNumber, 1);
        }
    }
    public void printStatistics() {
        Set<Integer> set = hashtable.keySet();
        for(Integer key : set) {
            System.out.print(key+"="+hashtable.get(key)+" ");
            if(key%10-1 == 0) System.out.println();
        }
    }
}