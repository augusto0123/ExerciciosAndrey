package ExercicioUm;

public class ExercicioUm {

    public static void executar(){

        double salarioUm = 1800.00;
        double salarioDois = 2850.00;
        double salarioTres = 1600.40;
        double salarioQuatro = 5300.25;
        double salarioCinco = 2050.25;

        double total = salarioUm + salarioDois + salarioTres + salarioQuatro + salarioCinco;

        double media = total / 5;

        System.out.printf("A média de salários desta empresa é R$ %.2f\n", media);
    }
}
