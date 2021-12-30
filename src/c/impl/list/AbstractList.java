package c.impl.list;

public abstract class AbstractList implements List {
    @Override
    public void add() {
        return;
    }
    
    @Override
    public void update(int index, Object value) {
        return;
    }
    
    @Override
    public void remove(int index) {
        return;
    }
    
    public abstract void clear();
}