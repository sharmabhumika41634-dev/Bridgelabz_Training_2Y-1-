package String.LeetCode.PracticeProblem;

public class StringBuilderDemo {
    static void  main(String[] args){
        StringBuilder str = new StringBuilder();
        str.append("bhumika");
        System.out.println("to add append method " +str);
        str.insert(5,'x');
        System.out.println("to add insert method " +str);
        str.reverse();
        System.out.println("to add revarse method " +str);
        str.delete(1,2);
        System.out.println("to add delete method " +str);
        str.deleteCharAt(6);
        System.out.println("to add deletechaAt method " +str);
    }
}
