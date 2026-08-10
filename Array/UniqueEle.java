public class UniqueEle {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3,6,7,5,2,7,8,9,5,3,0,9,8,5,7,4,2};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(visited[i] == true) continue;
            for(int j=i+1;j<n;j++){
                if(arr[j] == arr[i]){
                    visited[j] = true;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
