package d.string.practice;

public class UseStringMethods {
    public static void main(String[] args) {
        String str = new String("The String class represents character strings.");
        UseStringMethods use = new UseStringMethods();
        // use.printWords(str);
        // use.findString(str, "string");
        // use.findAnyCaseString(str, "string");
        // use.countChar(str, 's');
        use.printContainWords(str, "ss");
    }
    public void printWords(String str) {
        String[] strings = str.split(" ");
        for(String string:strings){
            System.out.println(string);
        }
    }
    public void findString(String str, String findStr) {
        int idx = str.indexOf(findStr);
        if(idx != -1) {
            System.out.println(findStr+" is appeared at "+idx);
        }
    }
    public void findAnyCaseString(String str, String findStr) {
        String lowerStr = str.toLowerCase();
        String lowerFindStr = findStr.toLowerCase();
        int idx = lowerStr.indexOf(lowerFindStr);
        if(idx != -1){
            System.out.println(findStr+" is appeared at "+idx);
        }
    }
    public void countChar(String str, char c) {
        int count = 0;
        char[] array = str.toCharArray();
        for(char ch:array) {
            if(ch == c) {
                count++;
            }
        }
        System.out.println("char \'"+c+"\' count is "+count);
    }
    public void printContainWords(String str, String findStr) {
        String[] strings = str.split(" ");
        for(String string:strings){
            if(string.contains(findStr)) {
                System.out.println(string+" contains "+findStr);
            }
        }
    }
}