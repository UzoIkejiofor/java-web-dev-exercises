package exercises;

import java.util.ArrayList;

public class ArrayListPracticeCh_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i < 14; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(sumEven(numbers));
    }
    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }

        return total;

    }

}


