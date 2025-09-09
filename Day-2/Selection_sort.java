public class Selection_sort {
    void selectionSort(int[] arr) {
        int n = arr.length,i,j;
        int min_idx;
        for(i = 0; i < n; i++){
            min_idx = i;
            for(j = i + 1; j < n; j++){
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] = temp;
        }
    }
}
