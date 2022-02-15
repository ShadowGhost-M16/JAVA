class Sorter {

    public static void bubbleSort(int arr[]) {
      boolean swapped;
      for (int i = 0; i < arr.length; i++) {
        swapped = false;
        for (int j = 0; j < arr.length-i-1; j++) {
          if (arr[j] > arr[j+1]) {
            int tmp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp;
            swapped = true;
          }
        }
        if (!swapped) break;
      } // at the end of the ith iteration, the 
        // last i elements are sorted
    }
  
    public static void selectionSort(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
        int minidx = i;
        for (int j = i+1; j < arr.length; j++) {
          if (arr[j] < arr[minidx]) {
            minidx = j;
          }
        }
        if (i != minidx) {
          int tmp = arr[i];
          arr[i] = arr[minidx];
          arr[minidx] = tmp;
        }
      }
    }
  
     public static void objselectionSort(Object arr[]) {
      for (int i = 0; i < arr.length; i++) {
        int minidx = i;
        for (int j = i+1; j < arr.length; j++) {
          if (arr[j].compareTo(arr[minidx]) < 0) {
            minidx = j;
          }
        }
        if (i != minidx) {
          Object tmp = arr[i];
          arr[i] = arr[minidx];
          arr[minidx] = tmp;
        }
      }
    }
  
    public static void insertionSort(int arr[]) {
      for (int i = 1; i < arr.length; i++) {
        int k = i - 1;
        int curr = arr[i];
        while (k >= 0 && curr < arr[k]) {
          arr[k+1] = arr[k];
          k--;
        }
        arr[k+1] = curr;
      }   // arr[0..i] is sorted
    }
  
    public static void printArr(int arr[]) {
      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  
    public static void strprintArr(String arr[]) {
      for (String i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();
    } 
  
    public static void objPrintArr(Object arr[]) {
      for (Object i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
      // Integer arr[] = { 7, 1, 8, 9, 5, 2, 6 };
      // Sorter.bubbleSort(arr);
      // Sorter.objPrintArr(arr);
  
      String strarr[] = {"hello", "goodbye", "cat", "dog"};
      Sorter.objselectionSort(strarr);
      Sorter.objPrintArr(strarr);
  
      List list = new ArrayList();
      list.add(7);
      String s = (String)list.get(0);
    }
  }