public class Main {
    public static void writeArray(int[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }
    public static void main(String[] args){
        Task1.userI();
    }
}
