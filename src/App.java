import java.util.Scanner;


//Respondendo: EXERCICIOS LAÇOS DE REPETIÇÃO

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        // Questões 1, 2, 3
        int countDo = 0;
        int countWhile = 0;
        int countFor = 0;

        do {
            System.out.println("contagem: " + countDo);
            countDo++;
        } while (countDo <= 10);

        System.out.println("");

        while (countWhile<=10) {
            System.out.println("contagem: " + countWhile);
            countWhile++;
        }

        
        System.out.println("");

        for(int i = 0; countFor <= 10; i++) {
            countFor++;
            System.out.println("contagem: " + i);
        }

        //Questão 4
        boolean isContinue4 = true;
        String resposta4;

        while (isContinue4) {
            System.out.println("Então você quer continuar ? S/N");
            resposta4 = sc.nextLine().toLowerCase();

            if (resposta4.equals("s")) {
                System.out.println("Certo vamos continuar então.");
            }else {
                System.out.println("Tudo bem atá a proxima.");
                break;
            }
        }


        //Questão 5
        boolean isContinue5 = true;
        String resposta5;

        do {
            System.out.println("Então você quer continuar ? S/N");
            resposta5 = sc.nextLine().toLowerCase();

            if (resposta5.equals("s")) {
                System.out.println("Certo vamos continuar então.");
            }else {
                System.out.println("Tudo bem atá a proxima.");
                break;
            }
        } while (isContinue5);

         //Questão 6
        int countNums = 0;
        int inputUser6;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        do {
            System.out.println("Insira 5 numeros: ");
            inputUser6 = sc.nextInt();

            if (inputUser6 >= 0) {
                System.out.println(inputUser6 + " é positivo.");
                numerosPositivos ++;
            }
            else {
                System.out.println(inputUser6 + " é negativo.");
                numerosNegativos ++;
            }           

            countNums++;

        } while (countNums <= 5);

        System.out.println("Ao total temos: "+ numerosPositivos + " positivos.");
        System.out.println("Ao total temos: " + numerosNegativos + " negativos.");

        //Questão 7
        int inputUser7 = 0;
        boolean isContinue7 = true;
        int valoresPares = 0;
        int valoresImpares = 0;

        while (isContinue7) {
            System.out.println("Digite alguns numeros: ");
            inputUser7 = sc.nextInt();
            System.out.println("Caso queira sair digite: -1.");

            if (inputUser7 == -1) {
                break;
            }
            
            if (inputUser7 % 2 == 0) {
                valoresPares ++;
            } else {
                valoresImpares ++;
            }

            inputUser7++;
        }

        System.out.println("A media dos pares é: " + (valoresPares / inputUser7));
        System.out.println("A media dos pares é: " + (valoresImpares / inputUser7));

        //Questão 8
        int countMax = 0;
        int inputUser8;
        int maior = Integer.MIN_VALUE;  // Inicialize maior com o menor valor possível
        int menor = Integer.MAX_VALUE;  // Inicialize menor com o maior valor possível

        do {
            System.out.println("Digite valores: ");
            inputUser8 = sc.nextInt();

            if (inputUser8 > maior) {
                maior = inputUser8;
            }
            if (inputUser8 < menor) {
                menor = inputUser8;
            }
            countMax++;

        } while (countMax < 6);

        System.out.println("\nMaior valor lido: " + maior);
        System.out.println("Menor valor lido: " + menor);

        // Questão 9
        int inputUser9;
        int numerosEntre0a25 = 0;
        int numerosEntre26a50 = 0;
        int numerosEntre51a75 = 0;
        int numerosEntre76a100 = 0;

        while (true) {
            System.out.println("Digite um número (ou um número negativo para sair): ");
            inputUser9 = sc.nextInt();

            if (inputUser9 < 0) {  // Condição de saída do loop
                break;
            }

            if (inputUser9 >= 0 && inputUser9 <= 25) {
                numerosEntre0a25++;
            } else if (inputUser9 >= 26 && inputUser9 <= 50) {
                numerosEntre26a50++;
            } else if (inputUser9 >= 51 && inputUser9 <= 75) {
                numerosEntre51a75++;
            } else if (inputUser9 >= 76 && inputUser9 <= 100) {
                numerosEntre76a100++;
            } else {
                System.out.println("Número fora do intervalo de 0 a 100.");
            }
        }

        System.out.println("Total de números entre 0 a 25: " + numerosEntre0a25);
        System.out.println("Total de números entre 26 a 50: " + numerosEntre26a50);
        System.out.println("Total de números entre 51 a 75: " + numerosEntre51a75);
        System.out.println("Total de números entre 76 a 100: " + numerosEntre76a100);

        //Questão 10
        int somaSalarios = 0;
        int somaFilhos = 0;
        int maiorSalario = Integer.MIN_VALUE;
        //Inputs
        int numeroFilhos;
        int salario;
        //Contadores
        int contadorSalarios = 0;
        int contadorFilhos = 0;
        int salariosAte1000 = 0;
        String sair;

        while (true) {
            System.out.println("Coleta de dados populacional:");
            System.out.print("Quanto você ganha: ");
            salario = sc.nextInt();
            sc.nextLine();

            System.out.print("Quantos filhos você tem: ");
            numeroFilhos = sc.nextInt();
            sc.nextLine();

            //Media salarial
            somaSalarios += salario;
            contadorSalarios++; // Incrementa o contador de entradas de salário

            //Media de filhos da população
            somaFilhos += numeroFilhos;
            contadorFilhos++;

            //Maior salario
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            //Pessoas com o slario até 1000
            if (salario <= 1000) {
                salariosAte1000++;
            }
        
            System.out.print("Deseja sair? (s/n): ");
            sair = sc.nextLine().toLowerCase();

            if (sair.equals("s")) {
                break;
            }
        }

        // Verifica se há pelo menos um salário registrado para evitar divisão por zero
        if (contadorSalarios > 0) {
            int mediaSalarial = somaSalarios / contadorSalarios;
            System.out.println("A média salarial da população é " + mediaSalarial);
        } else {
            System.out.println("Nenhum dado salarial foi inserido.");
        }

        if (contadorFilhos > 0) {
            int mediaFilhos = somaFilhos / contadorFilhos;
            System.out.println("A média de filhos da população é " + mediaFilhos);
        } else {
            System.out.println("Nenhum dado de filhos foi inserido.");
        }

        System.out.println("\nMaior salario: " + maiorSalario);
        System.out.println("No total há "+ salariosAte1000 + " com salario ate 1000");

        sc.close();
    }
}
