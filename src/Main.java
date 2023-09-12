import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        //
        //задача 1
        int[] integer = new int[] {1, 2, 3};
        //
        // а можно сделать так:
        //int[] integer = new int[3];
        //integer[0] = 1;
        //integer[1] = 2;
        //integer[2] = 3;
        //
        double[] fractional = {1.57d, 7.654d, 9.986d};
        boolean[] answers = {true, false, true, false};
        //
        //задача 2
        System.out.println("\nЗадача 2");
        for (int i = 0; i < integer.length; i++){
            if (i == integer.length - 1) {
                System.out.print(integer[i]);
                break;
            }
            System.out.print(integer[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < fractional.length; i++){
            if (i == fractional.length - 1) {
                System.out.print(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < answers.length; i++){
            if (i == answers.length - 1) {
                System.out.print(answers[i]);
                break;
            }
            System.out.print(answers[i] + ", ");
        }
        //
        //задача 3
        System.out.println("\n\nЗадача 3");
        for (int i = integer.length; i > 0; i--){
            if (i == 1) {
                System.out.print(integer[i - 1]);
                break;
            }
            System.out.print(integer[i - 1] + ", ");
        }
        System.out.println();
        for (int i = fractional.length; i > 0; i--){
            if (i == 1) {
                System.out.print(fractional[i - 1]);
                break;
            }
            System.out.print(fractional[i - 1] + ", ");
        }
        System.out.println();
        for (int i = answers.length; i > 0; i--){
            if (i == 1) {
                System.out.print(answers[i - 1]);
                break;
            }
            System.out.print(answers[i - 1] + ", ");
        }
        //
        //задача 4
        System.out.println("\n\nЗадача 4");
        for (int i = 0; i < integer.length; i++ ){
            if (integer[i] % 2 != 0) {
                integer[i]++;
            }
        }
        System.out.print(Arrays.toString(integer));
    }
}