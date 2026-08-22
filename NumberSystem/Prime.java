package NumberSystem;

public class Prime {
    public static void main(String[] args) {
        int n = 4;
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.println("Its prime num");
        }else{
            System.out.println("Not prime");
        }
    }
}
