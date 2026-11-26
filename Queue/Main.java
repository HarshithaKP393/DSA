package Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Queue");
        Queue que = new Queue(sc.nextInt());
        while(true){
        System.out.println("1 ENQUEUE 2 DEQUEUE 3 DISPLAY 4 EXIT");
        System.out.println("Enter Choice ");
            int ch = sc.nextInt();
        if(ch == 4){
            break;
        }
        switch (ch) {
            case 1:que.enqueue();; break;
            case 2:que.dequeue();;break;
            case 3:que.display();break;
            default:
                System.out.println("Invalid Choice");
        }

        }
    }
}
