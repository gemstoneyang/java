package d.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList8();
    }
    public void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList< >();
    }
    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        for(String tempData : list) {
            System.out.println(tempData);
        }
    }
    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("0  ");
        list2.addAll(list);
        for(String tempData : list2) {
            System.out.println("List2 : "+tempData);
        }
    }
    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        
        ArrayList<String> list2 = list;
        list.add("Oooops");
        for(String tempData : list2) {
            System.out.println("List2 : "+tempData);
        }
    }
    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for(int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get("+loop+")="+list.get(loop));
        }
    }
    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);
    }
    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[5];
        String[] strList = list.toArray(tempArray);
        for(String temp : strList) {
            System.out.println(temp);
        }
    }
    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        // System.out.println("Removed "+list.remove(0));
        // System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("A");
        list.removeAll(temp);
        for(int loop=0; loop<list.size(); loop++) {
            System.out.println("list.get("+loop+")="+list.get(loop));
        }
    }
}