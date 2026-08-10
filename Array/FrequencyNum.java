public class FrequencyNum {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3,6,7,5,2,7,8,9,5,3,0,9,8,5,7,4,2};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i] == true)continue;
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[j] == arr[i]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Number "+arr[i]+" ,count --> "+count);
        }

    }
}


// Ahh, you want **notes in a more natural “remember the logic” format**, not line-by-line explanation. Try this:

// ### Frequency of Numbers — Logic

// * Take one element at a time.
// * Check how many times that element appears **after its current position**.
// * Keep a `count` for the occurrences.
// * Whenever a duplicate is found, mark its index as `visited`.
// * Before processing any element, check `visited[]`.
// * If already visited → **skip it**.
// * Otherwise → count it and print the frequency.

// **Why `visited[]`?**
// Without it, the same number would be counted and printed again when its duplicate index is reached.

// **Pattern to remember:**

// > **Current element → Search remaining array → Count duplicates → Mark duplicates → Print**

// **Time:** `O(n²)`
// **Space:** `O(n)`

