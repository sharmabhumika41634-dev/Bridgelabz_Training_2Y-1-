package Arrays.Class_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class LearingArrayList {
    static void main() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,3);
        list.add(1,6);
        list.add(2,9);
        list.add(3,12);
        list.add(3,100);
        System.out.println("This is our list:"+ list);
        int nums[] = new int[5];
        for(int i=0; i<nums.length;i++){
            nums [i] = list.get(i);
        }
        System.out.println("we have converted the Arraylist into Array:");
        System.out.println(Arrays.toString(nums));
    }
}
