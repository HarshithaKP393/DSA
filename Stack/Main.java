package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        Stack st = new Stack(sc.nextInt());
        while(true){
        System.out.println("1 PUSH 2 POP 3 DISPLAY 4 EXIT");
        System.out.println("Enter Choice ");
            int ch = sc.nextInt();
        if(ch == 4){
            break;
        }
        switch (ch) {
            case 1:st.push(); break;
            case 2:st.pop();break;
            case 3:st.display();break;
            default:
                System.out.println("Invalid Choice");
        }

        }
    }
}
