package Stack;

public class Stackops {
   int arr[] = new int [5];
   int top = 0;
   public void push(int data) {
       arr[top] = data;
       top++;
   }
       public void display(){
           for(int n:arr){
               System.out.println(n+" ");
           }
       }
   }

