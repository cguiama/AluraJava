package sintaxe;


import java.util.Scanner;

public class AliquotaIfs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double salario;
        String aliquota;
        double deducao;

        System.out.println("Qual � o seu sal�rio?");
        salario = scan.nextDouble();

        if (salario >= 1900.0 && salario <= 2800) {
            aliquota = "7,5%";
            deducao = 142.0;
            System.out.println("Sua aliquota �: " + aliquota + "% e voc� pode deduzir R$ " + deducao);
        } else if (salario >= 2800.0 && salario <= 3751.01) {
            aliquota = "15%";
            deducao = 350.0;
            System.out.println("Sua aliquota �: " + aliquota + "% e voc� pode deduzir R$ " + deducao);
        } else if (salario >= 3751.01) {
            aliquota = "22.5%";
            deducao = 636.0;
            System.out.println("Sua aliquota �: " + aliquota + "% e voc� pode deduzir R$ " + deducao);
        } else {
            System.out.println("Voc� n�o paga IR, que sorte! \n Ou n�o...");
        }

    }
}

