public class SortColors {
    public static void sortColors(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid =0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                arr[mid] = arr[low];
                arr[low] = 0;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;
            }
        }
        for (int i : arr) {
            System.out.print(i+",");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
    }
}
