package Arrays.Class_Practice;

import java.util.HashMap;

public class DemoMap {
    static void main() {
        HashMap<String,Integer> studentAges = new HashMap<>();
        studentAges.put("Rahul",12);
        studentAges.put("Mayank",22);
        studentAges.put("Ayushi",20);
        System.out.println("Ayushi's age:"+studentAges.get("Ayushi"));

        studentAges.put("Ayushi",21);

        boolean hasMayank = studentAges.containsKey("Mayank");
        boolean hasAge20 = studentAges.containsValue(20);


    }
}
