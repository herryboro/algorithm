package theory.struture.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack1<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T a) {
        stack.add(a);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push("총원");
        st.push(24);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
