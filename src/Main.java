public class Main {
    public static void writeArray(int[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        int exit = 0;
        int choice = 0;
        while (exit != 100){
            System.out.println("Какое задание выполнить (1-4)?");
            choice = Input.integer();
            switch (choice) {
                case 1: {
                    Task1.userI();
                    break;
                }
                case 2: {
                    Task2.userI();
                    break;}
                case 3: {
                    Task3.userI();
                    break;
                }
                case 4: {
                    Task4.userI();
                    break;
                }
            }
            System.out.println("Для выхода из программы введите 100");
            exit = Input.integer();
        }
    }
}
