import java.util.ArrayList;

public class Task2 {
    public static void isEqual(int[] array, String[] condition) {
        boolean isEqual = condition[0].equals("=");
        ArrayList newList = new ArrayList<Integer>();
        int number = Integer.parseInt(condition[1]);
        if (isEqual) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    newList.add(array[i]);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != number) {
                    newList.add(array[i]);
                }
            }
        }
        if (newList.isEmpty()) System.out.println("Таких чисел в массиве нет");
        else System.out.println(newList);
    }
    public static void userI(){
        int[] array = Input.chooseHowFillArray();
        String[] condition = Input.withCondition(2);
        isEqual(array, condition);
    }
}
