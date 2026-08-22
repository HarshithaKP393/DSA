package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3,6,7,5,2,7,8,9,5,3,0,9,8,5,7,4,2};
        int n = arr.length;
        System.out.println("Before sorting ");
        for (int i : arr) {
            System.out.print(i+" , ");
        }
        for(int i=0;i<=n-1;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("\n After sorting");
        for (int i : arr) {
            System.out.print(i+" , ");
        }
    }
}
