package Stack;

import java.util.Scanner;

class Stack{
    int max,top;
    int[] arr;

    Stack(int max){
        this.max = max;
        top=-1;
        arr = new int[max];
    }

    public void push(){
        if(top==max-1){
            System.out.println("Stack overflow");
        }else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ele");
            int ele = sc.nextInt();
            top++;
            arr[top] = ele;
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }else{
            System.out.println("Deleting/poping "+arr[top]);
            top--;
        }
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack empty");
        }else{
            for(int i =top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
}