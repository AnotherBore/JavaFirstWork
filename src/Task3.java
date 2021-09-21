import java.util.Arrays;

public class Task3 {
    public static int[] deleteDublicates(int[] array){
        int unique = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                unique++;
            }
        }
        int[] newArray = new int[unique];
        int k = 0;
        if (newArray.length > 0){
            newArray[k++] = array[0];
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){ newArray[k++] = array[i];
            }
        }
        return newArray;
    }
    public static void userI(){
        int[] array = Input.stringWithNumbers();
        Arrays.sort(array);
        int[] newArray = deleteDublicates(array);
        Main.writeArray(newArray);
    }

}
