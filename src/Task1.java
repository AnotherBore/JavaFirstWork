import java.util.ArrayList;

public class Task1 {

    public static void moreOrLessThan(int[] array, String[] condition) {
        boolean lessThan = condition[0].equals("<");
        ArrayList newList = new ArrayList<Integer>();
        int number = Integer.parseInt(condition[1]);
        if (lessThan) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < number) {
                    newList.add(array[i]);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > number) {
                    newList.add(array[i]);
                }
            }
        }
        if (newList.isEmpty()) System.out.println("Таких чисел в массиве нет");
        else System.out.println(newList);
    }


    public static void userI(){
        int[] array = Input.chooseHowFillArray();
        String[] condition = Input.withCondition(1);
        moreOrLessThan(array, condition);
    }
}


