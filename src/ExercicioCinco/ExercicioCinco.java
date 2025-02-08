package ExercicioCinco;

import java.util.Random;
import java.util.Scanner;

public class ExercicioCinco {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);
        int tentativas = 10;

        System.out.println("Tetnte adivinhar qual é o número aleatório de 0 até 100. Você tem 10 tentativas!");

        while (tentativas != 0){

            System.out.println("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas = tentativas - 1;

            if (palpite == numeroAleatorio){
                System.out.println("Parabéns!!! Você acertou!!!");
                return;
            } else if(palpite < numeroAleatorio){
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
            System.out.println("Tentativas restantes: " + tentativas);
        }

        System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
    }
}
