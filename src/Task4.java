public class Task4 {
    public static byte isSorted(int[] array){
        byte mode = 0;
        if (array. length > 1){
            for(int i = 0; i < (array.length - 1); i++){
                if(array[i] < array[i+1])
                    mode = 1;
                else{
                    mode = 0;
                    break;
                }
            }
            if (mode == 0){
                for(int i = 0; i < (array.length - 1); i++){
                    if(array[i] > array[i+1])
                        mode = 2;
                    else{
                        mode = 0;
                        break;
                    }
                }
            }
        }
        else mode = 3;
        return mode;
    }

    public static void writeHowSorted(int mode){
        switch (mode){
            case 0: {
                System.out.println("Данный массив не упорядочен.");
                break;
            }
            case 1: {
                System.out.println("Данный массив упорядочен по возрастанию.");
                break;
            }
            case 2: {
                System.out.println("Данный массив упорядочен по возрастанию.");
                break;
            }
            case 3: {
                System.out.println("Данный массив состоит из одного элемента.");
                break;
            }
        }
    }

    public static void userI(){
        int[] array = Input.chooseHowFillArray();
        int mode = isSorted(array);
        writeHowSorted(mode);
    }
}
