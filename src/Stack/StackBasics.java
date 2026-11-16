package Stack;

import java.util.Stack;

public class StackBasics {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st); //print stack
        System.out.println(st.peek()); //topmost element(50)//
        st.pop(); //remove topmost element[10,20,30,40]
        System.out.println(st);
    }
}
