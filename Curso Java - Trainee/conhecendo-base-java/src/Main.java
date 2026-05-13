
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercício 01
        /* 
        double soma = 0, nota;
        int totalNotas = 3;
        for (int i = 0; i < totalNotas; i++) {
            System.out.print("Digite o valor da nota " + (i + 1) + ": ");
            nota = scanner.nextDouble();
            System.out.println();

            soma += nota;

        }

        double notaFinal = soma / totalNotas;

        if (notaFinal <= 4.0) {
            System.out.println("Reprovado!");

        } else if (notaFinal <= 4.0 || notaFinal <= 6.9) {
            System.out.println("Recuperação!");

        } else if (notaFinal >= 7.0) {
            System.out.println("Aprovado!");

        }

         */
        //Exercício 02
        /* 
        int dias = 365, anos;
        System.out.print("Digite quantos anos tu tem: ");
        anos = scanner.nextInt();

        System.out.println("Você tem " + (dias * anos) + " dias de idade");

         */
        //Exercício 03
        /* 
        int num = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));

        }

         */
        //Exercício 04
        /* 
        int num1, num2;
        System.out.print("Digite o valor do número 01: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o valor do número 02: ");
        num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println(num1 == num2);
        } else if (num1 == num2) {

        }
         */
        //Exercício 05
        /* 
        double precoProduto, desconto = 10.0;
        System.out.print("Digite o preço do produto: ");
        precoProduto = scanner.nextDouble();

        double valorDoDesconto = precoProduto * (desconto / 100);
        double precoFinal = precoProduto - valorDoDesconto;

        System.out.println("Preço original: " + precoProduto);
        System.out.println("Valor do desconto: " + valorDoDesconto);
        System.out.println("Preço final: " + precoFinal);

        */



    }

}
