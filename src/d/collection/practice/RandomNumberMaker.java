package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        for(int i = 0; i < 10; i++) {
            HashSet<Integer> randSet = maker.getSixNumber();
            System.out.println(randSet);
        }
    }
    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> randSet = new HashSet<Integer>();
        Random random = new Random();
        while(randSet.size() < 6) {
            int tempNumber = random.nextInt(45);
            randSet.add(tempNumber);
        }
        return randSet;
    }
}