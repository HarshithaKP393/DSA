package NumberSystem;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 5;
        int b= 4;
        int c = 9;

        if(a>b){
            if(a>c){
                System.out.println("A is greater "+a);
            }else{
                System.out.println("C is greater "+c);
            }
        }else{
            if(b>c){
                System.out.println("B is greater "+b);
            }else{
                System.out.println("C is greater "+c);
            }
        }
    }
}
