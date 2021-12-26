package c.javapackage;

import c.javapackage.sub.*;

public class Package {
    public static void main(String[] args) {
        // System.out.println("Package class.");
        Sub sub = new Sub();
        sub.subClassMethod();
        
        Samepackage samepackage = new Samepackage();
        samepackage.say();
    }
}