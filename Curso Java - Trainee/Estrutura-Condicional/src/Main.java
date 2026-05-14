
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercício 01
        /* 
        double soma = 0, notas;
        int num = 3;

        for (int i = 0; i < num; i++) {
            System.out.print("Digite o valor da nota " + (i + 1) + ": ");
            notas = scanner.nextDouble();
            soma += notas;

        }

        double media = soma / num;

        if (media < 4) {
            System.out.println("Tirou nota " + media + " por tanto é reprovado!");

        } else if (media == 4 && media < 7) {
            System.out.println("Tirou nota " + media + " por tanto é recuperação!");

        } else if (media > 7) {
            System.out.println("Tirou nota " + media + " por tanto aprovado!");

        }
         */
        //Exercício 02
        /* 
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " é par.");
            
        }

        else{
            System.out.println("É ímpar.");
        }
         */
        //Exercício 03
        /* 
        String[] mirim = new String[5];
        String[] infantil = new String[5];
        String[] juvenil = new String[5];

        String comandoSair, posicaoAtleta;

        do {

            do {
                System.out.print("Deseja adicionar o atleta em mirim, infantil, juvenil ou sair?: ");
                posicaoAtleta = scanner.nextLine();

                if (posicaoAtleta.equals("mirim")) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite o nome da criança: ");
                        mirim[i] = scanner.nextLine();

                    }

                } else if (posicaoAtleta.equals("infantil")) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite o nome das criança grandes: ");
                        infantil[i] = scanner.nextLine();

                    }

                } else if (posicaoAtleta.equals("juvenil")) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Digite o nome dos jovens: ");
                        juvenil[i] = scanner.nextLine();

                    }

                } else if (posicaoAtleta.equals("sair")) {
                    break;
                }

            } while (!posicaoAtleta.equals("sair"));

            for (int i = 0; i < 5; i++) {
                System.out.println("Nome da criança: " + mirim[i]);

            }

            System.out.println("===================================");

            for (int i = 0; i < 5; i++) {
                System.out.println("Nome da criança jovem: " + infantil[i]);

            }

            System.out.println("===================================");

            for (int i = 0; i < 5; i++) {
                System.out.println("Nome do jovem: " + juvenil[i]);

            }

            System.out.println("===================================");

            System.out.print("Deseja encerrar o programa?(S/N): ");
            comandoSair = scanner.nextLine();

        } while (!comandoSair.equals("S"));

        System.out.println("Programa Encerrado!");

         */
        //Exercício 04
        /* 
        String continuar;

        do {

            double num1, num2;
            String operador;

            do {
                System.out.print("Escolha um dos seguintes operadores +,-,/,* ou ^: ");
                operador = scanner.nextLine();

            } while (!operador.equals("+") && !operador.equals("-") && !operador.equals("/") && !operador.equals("*") && !operador.equals("^"));

            System.out.print("Digite o primeiro valor: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            num2 = scanner.nextDouble();

            scanner.nextLine();

            if (operador.equals("+")) {
                System.out.println("Soma de " + num1 + " e " + num2 + " é " + (num1 + num2));

            } else if (operador.equals("-")) {
                System.out.println("Subtração de " + num1 + " e " + num2 + " é " + (num1 - num2));

            } else if (operador.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Divisão por zero não existe!");

                } else {
                    System.out.println("Divisão de " + num1 + " e " + num2 + " é " + (num1 / num2));
                }

            } else if (operador.equals("*")) {
                System.out.println("Multiplicação de " + num1 + " e " + num2 + " é " + (num1 * num2));

            } else if (operador.equals("^")) {
                System.out.println("Potenciação de " + num1 + " e " + num2 + " é " + (Math.pow(num1, num2)));

            }

            System.out.print("Deseja encerrar o programa?(S/N): ");
            continuar = scanner.nextLine();

        } while (continuar.equals("N"));
        System.out.println("Programa Encerrado!");

         */
        //Exercício 05
        /* 
        double altura, peso;

        peso = scanner.nextDouble();
        altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");

        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("=Obesidade");

        } else if (imc >= 40) {
            System.out.println("Obesidade grave");

        }

         */
    }
}
