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
        boolean correctInput = false;
        int choice = 0;
            System.out.println("Какое задание выполнить (1-4)?");
            choice = Input.integer();
            switch (choice)
            {
                case 1: Task1.userI();
                case 2: Task2.userI();
                default: System.out.println("Такого задания нет!");
            }
    }
}
