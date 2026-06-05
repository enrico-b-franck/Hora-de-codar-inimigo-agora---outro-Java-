import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

// 1 - Baby Steps


        String planeta = "Plutão";

        System.out.println("Planeta: " + planeta);



        // 2 -  Hello Clarice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);

        // 3- A Bit of Information
        Scanner nome_idade = new Scanner(System.in);

        System.out.print("Digite seu nome ");
        String nome_1 = nome_idade.nextLine();

        System.out.println("Olá " + nome_1 );

        System.out.print("Digite sua idade ");
        int idade = nome_idade.nextInt();

        System.out.println("Olá " + nome_1 + " você tem " + idade + " anos");

        // 4 -A Bit of Geometry

        Scanner forma = new Scanner(System.in);

        System.out.println("--- CÁLCULO DA ÁREA DO RETÂNGULO ---");

        // Solicita os dados ao usuário
        System.out.print("Informe o valor da base: ");
        double base = forma.nextDouble();

        System.out.print("Informe o valor da altura: ");
        double altura = forma.nextDouble();

        // Realiza o cálculo da área (Base x Altura)
        double area = base * altura;

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("A área do retângulo é: %.2f\n", area);


        // 5-  1, 2 e 3

        Scanner numeros = new Scanner(System.in);

        System.out.print("Informe um valor " );
        int numero = numeros.nextInt();

        if(numero < 0){
            System.out.println("Seu número é negativo ");
        }
        else if(numero > 0 ){
            System.out.println("Seu número é positivo ");

        }
        else {
            System.out.println("Seu número é neutro ");
        }


        // 6 e 6.1 - Qual o maior?
        // Para o 6.1, basta apenas mudar no int [3] para [4] e o int array valorys[2] para [3]
        Scanner maior = new Scanner(System.in);
        int[] valorys = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1 ) + "º valor: ");
            valorys[i] = maior.nextInt();

            Arrays.sort(valorys);
            int mayor = valorys[2];
            System.out.println("O maior valor é " + mayor);
        }

        // 7
        Scanner entrada_1 = new Scanner(System.in);
        double[] valorez = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valorez[i] = entrada_1.nextDouble();}


        Arrays.sort(valorez);
        double somar = valorez[1] + valorez[2];
        System.out.println("A soma dos dois maiores é: " + somar);

        //7.1

        Scanner entrada = new Scanner(System.in);
        double[] valores = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores[i] = entrada.nextDouble();}


        Arrays.sort(valores);
        double soma = valores[3] + valores[4];
        System.out.println("A soma dos dois maiores é: " + soma);



        //8

        Scanner valores_um_e_dois = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = valores_um_e_dois.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = valores_um_e_dois.nextDouble();

        while (valor2 <= 0) {
            System.out.println("Valor inválido! O segundo valor deve ser maior que zero.");
            System.out.print("Digite novamente o segundo valor: ");
            valor2 = valores_um_e_dois.nextDouble();
        }

        double resultado = valor1 / valor2;

        System.out.println("Resultado da divisão: " + resultado);


        //9
        Scanner entrada_00 = new Scanner(System.in);
        double[] numeros_00 = new double[10];
        double soma_00 = 0;

        // Leitura dos 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            numeros_00[i] = entrada_00.nextDouble();
            soma += numeros_00[i];
        }

        // Exibição dos valores digitados
        System.out.println("\nValores informados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros_00[i] + " ");
        }

        // Cálculo da média
        double media = soma / 10;

        System.out.println("\n\nMédia aritmética: " + media);



        // 10

        Scanner entrada_010 = new Scanner(System.in);
        double soma_010 = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma_010 += entrada_010.nextDouble();
        }

        double media_010 = soma_010 / 4;

        System.out.println("Média: " + media_010);

        if (media_010 >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        // 11

        for (int i= 31; i >0; i--){
            System.out.println( + i-1 );

        }
        System.out.println("Booom!");

        // 12
        for (int i= 11; i >0; i--){
            System.out.println( + i-1 );

        }
        // 13

        Scanner entrada_013 = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero_013 = entrada_013.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero_013 = entrada_013.nextInt();

        int soma_013 = 0;
        int quantidade_013 = 0;

        for (int numero_013 = primeiroNumero_013;
             numero_013 <= segundoNumero_013;
             numero_013++) {

            soma_013 += numero_013;
            quantidade_013++;
        }

        double media_013 = (double) soma_013 / quantidade_013;

        System.out.println("Soma dos números: " + soma_013);
        System.out.println("Quantidade de números: " + quantidade_013);
        System.out.println("Média aritmética: " + media_013);


        // 14
        Scanner entrada_014 = new Scanner(System.in);

        int aprovados_014 = 0;
        String resposta_014;

        do {

            double soma_014 = 0;

            for (int nota_014 = 1; nota_014 <= 6; nota_014++) {
                System.out.print("Digite a nota " + nota_014 + ": ");
                soma_014 += entrada_014.nextDouble();
            }

            double media_014 = soma_014 / 6;

            System.out.println("Média final: " + media_014);

            if (media_014 >= 6.5) {
                System.out.println("Aluno APROVADO!");
                aprovados_014++;
            } else {
                System.out.println("Aluno REPROVADO!");
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            resposta_014 = entrada_014.next();

        } while (resposta_014.equalsIgnoreCase("S"));

        System.out.println("\nQuantidade de alunos aprovados: " + aprovados_014);

        //15

        Scanner entrada_015 = new Scanner(System.in);

        double anacleto_015 = 1.50;
        double felisberto_015 = 1.10;

        int anos_015 = 0;

        while (felisberto_015 <= anacleto_015) {
            anacleto_015 += 0.02;
            felisberto_015 += 0.03;
            anos_015++;
        }

        System.out.println("Serão necessários " + anos_015 + " anos para Felisberto ser maior que Anacleto.");


        //16

        Scanner entrada_016 = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int eleitores_016 = entrada_016.nextInt();

        System.out.print("Digite o percentual de votos brancos: ");
        double brancos_016 = entrada_016.nextDouble();

        System.out.print("Digite o percentual de votos válidos: ");
        double validos_016 = entrada_016.nextDouble();

        System.out.print("Digite o percentual de votos nulos: ");
        double nulos_016 = entrada_016.nextDouble();

        double quantidadeBrancos_016 = eleitores_016 * brancos_016 / 100;
        double quantidadeValidos_016 = eleitores_016 * validos_016 / 100;
        double quantidadeNulos_016 = eleitores_016 * nulos_016 / 100;

        System.out.println("Votos Brancos: " + quantidadeBrancos_016);
        System.out.println("Votos Válidos: " + quantidadeValidos_016);
        System.out.println("Votos Nulos: " + quantidadeNulos_016);

        //17

        Scanner entrada_017 = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica: ");
        double custoFabrica_017 = entrada_017.nextDouble();

        double distribuidor_017 = custoFabrica_017 * 0.28;
        double impostos_017 = custoFabrica_017 * 0.45;

        double custoFinal_017 =
                custoFabrica_017 +
                        distribuidor_017 +
                        impostos_017;

        System.out.println("Custo final ao consumidor: R$ " + custoFinal_017);

        //18

        Scanner entrada_018 = new Scanner(System.in);

        double salarioBase_018 = 5000.00;

        System.out.print("Quantidade de carros vendidos: ");
        int carrosVendidos_018 = entrada_018.nextInt();

        System.out.print("Valor total das vendas: R$ ");
        double valorVendas_018 = entrada_018.nextDouble();

        System.out.print("Comissão fixa por carro vendido: R$ ");
        double comissaoPorCarro_018 = entrada_018.nextDouble();

        double comissaoTotal_018 =
                carrosVendidos_018 * comissaoPorCarro_018;

        double bonusVendas_018 =
                valorVendas_018 * 0.05;

        double salarioFinal_018 =
                salarioBase_018 +
                        comissaoTotal_018 +
                        bonusVendas_018;

        System.out.println("Salário Base: R$ " + salarioBase_018);
        System.out.println("Comissão dos Carros: R$ " + comissaoTotal_018);
        System.out.println("Bônus das Vendas: R$ " + bonusVendas_018);
        System.out.println("Salário Final: R$ " + salarioFinal_018);

        //19

        Scanner entrada_019 = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double ladoA_019 = entrada_019.nextDouble();

        System.out.print("Digite o lado B: ");
        double ladoB_019 = entrada_019.nextDouble();

        System.out.print("Digite o lado C: ");
        double ladoC_019 = entrada_019.nextDouble();

        if ((ladoA_019 < ladoB_019 + ladoC_019) &&
                (ladoB_019 < ladoA_019 + ladoC_019) &&
                (ladoC_019 < ladoA_019 + ladoB_019)) {

            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        //20

        Scanner entrada_020 = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String produto_020 = entrada_020.nextLine();

        System.out.print("Quantidade adquirida: ");
        int quantidade_020 = entrada_020.nextInt();

        System.out.print("Preço unitário: ");
        double precoUnitario_020 = entrada_020.nextDouble();

        double valorVenda_020 =
                quantidade_020 * precoUnitario_020;

        double percentualDesconto_020;

        if (quantidade_020 <= 5) {
            percentualDesconto_020 = 0.02;
        } else if (quantidade_020 <= 10) {
            percentualDesconto_020 = 0.03;
        } else {
            percentualDesconto_020 = 0.05;
        }

        double desconto_020 =
                valorVenda_020 * percentualDesconto_020;

        double imposto_020 =
                valorVenda_020 * 0.20;

        double totalPagar_020 =
                valorVenda_020 - desconto_020 + imposto_020;

        System.out.println("\n===== NOTA FISCAL =====");
        System.out.println("Produto: " + produto_020);
        System.out.println("Quantidade: " + quantidade_020);
        System.out.println("Preço Unitário: R$ " + precoUnitario_020);
        System.out.println("Valor da Venda: R$ " + valorVenda_020);
        System.out.println("Desconto: R$ " + desconto_020);
        System.out.println("Imposto: R$ " + imposto_020);
        System.out.println("Total a Pagar: R$ " + totalPagar_020);

        //21

        Scanner entrada_021 = new Scanner(System.in);

        System.out.print("Código do empregado: ");
        int codigo_021 = entrada_021.nextInt();

        System.out.print("Ano de nascimento: ");
        int nascimento_021 = entrada_021.nextInt();

        System.out.print("Ano de ingresso na empresa: ");
        int ingresso_021 = entrada_021.nextInt();

        int anoAtual_021 = 2026;

        int idade_021 =
                anoAtual_021 - nascimento_021;

        int tempoTrabalho_021 =
                anoAtual_021 - ingresso_021;

        System.out.println("Idade: " + idade_021);
        System.out.println("Tempo de trabalho: " + tempoTrabalho_021);

        if (idade_021 >= 65 ||
                tempoTrabalho_021 >= 30 ||
                (idade_021 >= 60 && tempoTrabalho_021 >= 25)) {

            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        //22

        Scanner entrada_022 = new Scanner(System.in);

        int numero_022 = 1;

        for (int linha_022 = 1; linha_022 <= 20; linha_022++) {

            System.out.print("(" + linha_022 + ", ");

            for (int contador_022 = 1; contador_022 <= 10; contador_022++) {
                System.out.print(numero_022 + " ");
                numero_022++;
            }

            System.out.println(")");
        }

        //23

        Scanner entrada_023 = new Scanner(System.in);

        for (int linha_023 = 1; linha_023 <= 20; linha_023++) {

            System.out.print("(" + linha_023 + ", ");

            for (int numero_023 = 1; numero_023 <= 10; numero_023++) {
                System.out.print(numero_023 + " ");
            }

            System.out.println(")");
        }
        //24

        Scanner entrada_024 = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");
        double horas_024 = entrada_024.nextDouble();

        System.out.print("Valor da hora: ");
        double valorHora_024 = entrada_024.nextDouble();

        double salario_024;

        if (horas_024 > 160) {
            salario_024 = (160 * valorHora_024) +
                    ((horas_024 - 160) * valorHora_024 * 1.5);
        } else {
            salario_024 = horas_024 * valorHora_024;
        }

        System.out.println("Salário total: R$ " + salario_024);

        //25

        Scanner entrada_025 = new Scanner(System.in);

        String[] vetor_025 = new String[12];

        for (int i_025 = 0; i_025 < 12; i_025++) {
            vetor_025[i_025] = entrada_025.next();
        }

        System.out.println("Saída 1:");

        for (int i_025 = 11; i_025 >= 0; i_025--) {
            System.out.print(vetor_025[i_025] + " ");
        }

        System.out.println("\n\nSaída 2:");

        for (int i_025 = 11; i_025 >= 0; i_025--) {
            if (Character.isDigit(vetor_025[i_025].charAt(0))) {
                System.out.print(vetor_025[i_025] + " ");
            }
        }

        System.out.print("- ");

        for (int i_025 = 11; i_025 >= 0; i_025--) {
            if (Character.isLetter(vetor_025[i_025].charAt(0))) {
                System.out.print(vetor_025[i_025] + " ");
            }
        }


    }
}
