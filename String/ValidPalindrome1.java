package String;

public class ValidPalindrome1 {
    public static void main(String[] args) {
        String s = "Too hot to hoot";
        char[] fresh = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        int n = fresh.length;
        int l =0;
        int r = n-1;
        while(l<r){
            if(fresh[l]==fresh[r]){
                l++;
                r--;
            }else{
                System.out.println("False");
            }
        }
        System.out.println("True");
    }
}
