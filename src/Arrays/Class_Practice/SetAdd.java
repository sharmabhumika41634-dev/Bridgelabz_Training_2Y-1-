package Arrays.Class_Practice;

import java.util.HashSet;
import java.util.Set;

public class SetAdd {
    static void main() {
        Set<Integer>set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        System.out.println(set);
    }
}
