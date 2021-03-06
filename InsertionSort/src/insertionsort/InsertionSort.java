package insertionsort;

public class InsertionSort{
    public void sort(int arr []){
        int n, key, j;
        n = arr.length;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j]>key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}