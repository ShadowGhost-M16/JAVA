package data_structure;

public class classnote1 {
    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arrayMatches = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++){
                if( array[i] == array[j] ) {
                    arrayMatches[i] = j;
                    
                }
            }

        }
    }

}