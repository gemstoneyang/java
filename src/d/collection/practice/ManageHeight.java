package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();
    
    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();
        for(int i=1; i<6; i++) {
            System.out.println("Class No.:"+i);
            // sample.printHeight(i);
            sample.printAverage(i);
        }
    }
    public void setData() {
        int[][] arr = {
            {170, 180, 173, 175, 177},
            {160, 165, 167, 186},
            {158, 177, 187, 176},
            {173, 182, 181},
            {170, 180, 165, 177, 172}
        };
        for(int i=0; i<arr.length; i++) {
            ArrayList<Integer> tmpList = new ArrayList<Integer>();
            for(int j=0; j<arr[i].length; j++) {
                tmpList.add(arr[i][j]);
            }
            gradeHeights.add(tmpList);
        }
    }
    public void printHeight(int classNo) {
        ArrayList<Integer> tmpList = gradeHeights.get(classNo-1);
        for(Integer tmp : tmpList) {
            System.out.println(tmp);
        }
    }
    public void printAverage(int classNo) {
        double avg = 0.0;
        ArrayList<Integer> tmpList = gradeHeights.get(classNo-1);
        for(Integer tmp : tmpList) {
            avg += tmp;
        }
        avg /= tmpList.size();
        System.out.println("Height average:"+avg);
    }
}