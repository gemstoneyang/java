package c.util;

public class FinalVariable {
    final int instanceVariable=1;
    
    public void method(final int parameter) {
        final int loacalVarWiable;
        localVariable = 2;
        localVariable = 3; // compile error!
        parameter = 4; // compile error!
    }
}