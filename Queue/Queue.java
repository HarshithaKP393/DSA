package Queue;

import java.util.Scanner;

public class Queue {
    int size,f,r;
    int[] arr;
    Queue(int size){
        this.size = size;
        f=0;
        r=-1;
        arr = new int[size];
    }

    public void enqueue(){
        if(r == size-1){
            System.out.println("Queue overflow");
        }else{
            System.out.println("Enter the ele");
            Scanner ob = new Scanner(System.in);
            int ele = ob.nextInt();
            arr[++r] = ele;
        }
    }

    public void dequeue(){
        if(f>r){
            System.out.println("empty");
        }else{
            System.out.println("deleting "+arr[f++]);
        }
    }

    public void display(){
        if(f>r){
            System.out.println("empty");
        }else{
            for(int i =f;i<=r;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
