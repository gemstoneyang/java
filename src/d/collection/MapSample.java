package d.collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkContains();
    }
    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }
    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("B", "b");
        Set<String> keySet = map.keySet();
        for(String key : keySet) {
            System.out.println(key+"="+map.get(key));
        }
    }
    public void checkValue() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("B", "b");
        
        Collection<String> list = map.values();
        for(String val : list) {
            System.out.println(val);
        }
    }
    public void checkEntry() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("B", "b");
        
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey()+"="+tempEntry.getValue());
        }
    }
    public void checkContains() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("B", "b");
        map.put("D", "d");
        
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }
}