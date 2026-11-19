package Stack.Monotonic_Stack;

import java.util.Stack;

public class SimpleDecreasingStack {
    static void main() {
        int [] nums = {5 , 3, 4, 2, 6};
        Stack<Integer> Stack = new Stack<>();
        for(int num : nums){
            while(!Stack.isEmpty() && Stack.peek()<num){
                Stack.pop();
            }
            Stack.push(num);
        }
        System.out.println("Decreasing Satck: " +Stack);
        System.out.println("Minimum element:" +Stack.peek());
    }
}
