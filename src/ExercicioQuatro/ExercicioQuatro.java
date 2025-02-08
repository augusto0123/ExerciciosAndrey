package ExercicioQuatro;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = scanner.nextInt();

        while (x != 1){
            System.out.printf(x + " -> ");
            if (x % 2 == 0){
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
        }
        System.out.println(x);
    }
}
