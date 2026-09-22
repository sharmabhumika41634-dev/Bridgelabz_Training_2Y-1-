package Arrays.Class_Practice;

import java.util.HashMap;

public class Demo2 {
    static void main() {
        int arr[]={1,2,3,1,1,2,4,5,6,7,5,4,3,3,4,6,7,8,3,6,7,8,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
