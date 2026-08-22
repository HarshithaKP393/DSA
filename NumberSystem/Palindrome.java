package NumberSystem;

public class Palindrome {
    public static void main(String[] args) {
        int n = 112211;
        int copy = n;
        int rev = 0;
        while(n!=0){
            int dig = n%10;
            rev = rev*10 + dig;
            n = n/10;
        }
        if(copy==rev){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
}
