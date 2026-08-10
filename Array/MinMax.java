class MinMax {

    public static void findMinMax(int[] arr) {

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Minimum and second minimum
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin && arr[i] != min) {
                secMin = arr[i];
            }

            // Maximum and second maximum
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        System.out.println("Largest num " + max);
        System.out.println("Sec Largest " + secMax);
        System.out.println("Smallest " + min);
        System.out.println("Second smallest " + secMin);
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 33, 29, 65, 0, 35, 7, 8, 32};

        findMinMax(arr);
    }
}