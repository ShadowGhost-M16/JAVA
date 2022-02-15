package data_structure.week2.week3_generix;

public class generics_sorters<T> {
    private T[] arr;

    public generics_sorters(T[] arr) {
        this.arr = arr;
    }
    
    public  void BubbleSorts (int arr[]) {// cant have static 
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].compareTo (arr[j+1]) > 0)  {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = (int) temp;
                    swapped = true;
                }
            }
    }
 
}
}


