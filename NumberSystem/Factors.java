package NumberSystem;

public class Factors {
    public static void main(String[] args) {
        int n = 8;
        for(int i = n*(-1); i<=n; i++){
            if(i!=0 && n%i == 0){
                System.out.print(i+" ");
            }
        }
        sumOfpositive(n);
    }
    public static void sumOfpositive(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        System.out.println("The Sum is +ve "+sum);
    }
}
