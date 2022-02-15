package faran_work.sorting_algorthem;

import java.util.Arrays;

public class sorting {
    public void bubble(int arr []) 
    {
        // size is the length of the array
        int size = arr.length;
        for (int i = 0; i < size-1; i++)//from index 0 to the second last element
        {
            for( int j = 1; j < size-i-1; j++)// from 1 to the third last element
            {
                if (arr[j] > arr [j +1])// compare the adjecent elements to on another
                {
                    int temp = arr[j];// swapping the number with their index until it reaches a sorted array
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void SelectionSort (int arr [])
    {
        int size = arr.length;
        for (int i = 0; i < size-1; i++)
        {
            int min = i;

            for ( int j = i+1; j < size; j++)
            {
                if (arr[j] < arr[min])// compare the adjecent elements to on another
                {
                    min = j;
                }
                int temp = arr[min];// swapping the index
                arr[min] = arr[i];
                arr[i] = temp;

            }
        }
    }
        public void InsertionSort (int arr [])
    {
        int size = arr.length;
        for (int i = 1; i < size; i++)
        {
            int key =  arr[i];// key is use comparing other num
            int j = i-1;// index of other number;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] =  arr[j];
                j = j-1;
            }
            arr[j+1] = key;
              
        }
    }
      

    public static void main(String[] args) 
    {
        int arr [] = {1,3,5,2,9,6};
        int arr2 [] = {2,3,5,23,9,6};
        int arr3[] = {3,2,4,9,6};
        sorting obj = new sorting();
        obj.bubble(arr);
        System.out.println(Arrays.toString(arr));
        obj.SelectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        obj.InsertionSort(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}
