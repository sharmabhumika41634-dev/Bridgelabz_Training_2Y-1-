package Stack;

public class Stackops {
   int arr[] = new int [5];
   int top = 0;
   public void push(int data) {
       if(top==arr.length){
           System.out.println("Stack is full");
       }
       arr[top] = data;
       top++;
   }
       public void display(){
           for(int n:arr){
               System.out.println(n+" ");
           }
       }
       public void pop(){
       int data;
       top--;
       data=arr[top];
       arr[top]=0;
       }
   }

