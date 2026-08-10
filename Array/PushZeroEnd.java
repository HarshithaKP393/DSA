public class PushZeroEnd {
    public static void main(String[] args) {
        int[] arr = {2,1,0,8,0,1,7,0,5,0,1,0};
        System.out.println("before arr");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\n after arr");
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
