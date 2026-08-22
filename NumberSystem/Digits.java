package NumberSystem;

public class Digits {
public static void main(String[] args) {
    int n = 28375637;
    int sum=0;
    int cnt = 0;
    while(n!=0){
        int dig = n%10;
        cnt++;
        System.out.print(dig+" ");
        sum+=dig;
        n=n/10;
    }
    System.out.println("\nsum of digits "+sum);
    System.out.println("The num of digits are "+cnt);
}
    
}