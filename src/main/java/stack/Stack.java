package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Object> stackContent = new ArrayList<>();
    public boolean isEmpty() {
        return stackContent.isEmpty();
    }

    public void pushObject(Object object) {
        stackContent.add(object);
    }

    public Object popObject() {
        topObject();
        Object temp = stackContent.remove(stackContent.size()-1);
        return temp;
    }

    public Object topObject() {
        if(isEmpty()) throw new IllegalStateException("can not top empty stack");
        return stackContent.get(stackContent.size()-1);
    }
}
