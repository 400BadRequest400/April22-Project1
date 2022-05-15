package algorithme;

public class InsertionSort {

    public static void main(String[] args) {



        int [] array = {2, 7, 1, 16, 23, 4, 0};
        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {

                if (array[j] < array[j-1]){

                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("======================================");


        final long startTime = System.currentTimeMillis();
        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;
        //this.executionTime = executionTime;

        System.out.println(executionTime);
    }
}
