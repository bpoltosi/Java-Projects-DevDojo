package aulasstart;

public class aulas {
    static void main(String[] args) {
/*
        System.out.println("Hello World");

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 / numero01;
        System.out.println("O resultado da operação é " + resultado);

        int resto = 21 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;

        System.out.println("is Dez Maior Que Vinte " + isDezMaiorQueVinte);
        System.out.println("is Dez Menor Que Vinte " + isDezMenorQueVinte);

        int idade = 20;
        float salario = 2000F;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade <= 30 && salario >= 3381;
        System.out.println(" é dentro da lei, maior que 30 " + isDentroDaLeiMaiorQue30);
        System.out.println(" é dentro da lei, menor que 30 " + isDentroDaLeiMenorQue30);


        double valorTotalContaCorrente = 1000;
        double valorTotalContaPoupança = 4000;
        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupança >= valorPlayStation;
        boolean gastarTodasEconomias = valorTotalContaPoupança + valorTotalContaCorrente >= valorPlayStation;
        System.out.println("PlayStation Cinco é Compravel, Apenas Com Uma Conta " + isPlayStationCincoCompravel);
        System.out.println("If You Spend A Merge Of Accounts, Is possible purchasing a PlayStation 5 " + gastarTodasEconomias);


        double bonus = 1800;
        bonus += 1000;
        bonus -= 500;
        bonus *= 4;
        bonus /= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;

        System.out.println(contador);

        int idade = 10;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado == true) {
            System.out.println("Autorizado");
        }
        if (!isAutorizado) {
            System.out.println("Não Autorizado");
        }


        int idade = 10;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado == true) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não Autorizado");

            {
                int idade = 17;
                String categoria;

                if (idade < 15) {
                    categoria = ("Infantil");
                } else if (idade >= 15 && idade < 18) {
                    categoria = ("juvenil");
                } else {
                    categoria = ("Adulto");
                }
                System.out.println(categoria);


                {
                    double salario = 10000;
                    String resultado = (salario > 5000) ? "Eu posso doar dinheiro" : "Eu ainda não posso doar dinheiro";
                    System.out.println(resultado);
                }

                {
                    double salario = 2000;
                    double lucro = salario * 1.5;
                    double mensal = lucro / 12;
                    System.out.println("Sua renda mensal é de " + mensal);
                }

                {
                    double salario = 6000;
                    double salarioAnual = salario * 12;
                    double primeiraFaixa = 9.70 / 100;
                    double segundaFaixa = 37.35 / 100;
                    double terceiraFaixa = 49.50 / 100;
                    double valorImposto;

                    if (salarioAnual <= 34712) {
                        valorImposto = primeiraFaixa * salarioAnual;
                    } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
                        valorImposto = segundaFaixa * salarioAnual;
                    } else {
                        valorImposto = salarioAnual = terceiraFaixa * salarioAnual;
                    }
                    System.out.println(valorImposto);
                }

                {
                    byte dia = 10;
                    switch (dia) {
                        case 1:
                            System.out.println("Domingo");
                            break;
                        case 2:
                            System.out.println("Segunda");
                            break;
                        case 3:
                            System.out.println("Terça");
                            break;
                        case 4:
                            System.out.println("Quarta");
                            break;
                        case 5:
                            System.out.println("Quinta");
                            break;
                        case 6:
                            System.out.println("Sexta");
                            break;
                        case 7:
                            System.out.println("Sabado");
                            break;
                        default:
                            System.out.println("Opção Invállida");
                            break;
                    }
                }

                {
                    char sexo = 'M';
                    switch (sexo) {
                        case 'M':
                            System.out.println("Homem");
                            break;
                        case 'F':
                            System.out.println("Mulher");
                            break;
                        default:
                            System.out.println("Inválido");
                            break;
                    }
                }

                {
                    byte dia = 3;
                    switch (dia) {
                        case 2, 3, 4, 5, 6:
                            System.out.println("Dia Útil");
                            break;
                        case 1, 7:
                            System.out.println("Finl de Semana");
                            break;
                        default:
                            System.out.println("Dia Inválido");
                            break;
                    }
                }

                {
                    int count = 0;
                    while (count <= 10) {
                        System.out.println(count);
                        count += 1;

                    }
                }

                {
                    int count = 1;
                    do {
                        System.out.println("dentro do do-while " + count);
                        count++;
                    }
                    while (count <= 10);
                }

                {
                    for (int i = 0; i <= 10; i++) {
                        System.out.println("For" + i);
                    }

                    {
                        int count;
                        for (count = 0; count <= 10; count++) {
                            System.out.println("For" + count);
                        }
                    }

                    {
                        int numeros = 0;
                        int par;
                        int impar;

                        for (int i = 0; i <= 1000000; i++) {
                            if (i % 2 == 0) {
                                System.out.println(i);
                            }
                        }
                    }
                    {
                        int valorMax = 50;
                        for (int i = 0; i <= valorMax; i++) {
                            if (i > 10) {
                                break;
                            }
                            System.out.println(i);
                        }
                    }

                    {
                        double valorTotal = 30000;
                        for (int parcela = 1; parcela <= valorTotal; parcela++) {
                            double valorParcela = valorTotal / parcela;
                            if (valorParcela < 1000) {
                                break;
                            }
                            System.out.println("Numero de parcelas " + parcela + ", com valor: R$" + valorParcela);
                        }
                    }

                    {
                        double valorTotal = 30000;
                        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
                            double valorParcela = valorTotal / parcela;
                            if (valorParcela < 1000) {
                                continue;
                            }
                            System.out.println("Numero de parcelas " + parcela + ", com valor: R$" + valorParcela);
                        }
                    }

                    {
                        int[] idades = new int[3];
                        idades[0] = 21;
                        idades[1] = 11;
                        idades[2] = 31;
                        System.out.println(idades[2]);
                    }
                }
            }
        }

        {
            String[] nomes = new String[3];
            nomes[0] = "Bruno";
            nomes[1] = "Evelyn";
            nomes[2] = "Ednei";
            for (int i = 0; i < nomes.length; i++) {
                System.out.println(nomes[i]);
            }
        }


        {
            int[] numeros = new int[3];
            int[] numeros2 = {1, 7, 3, 9, 5};
            int[] numeros3 = new int[]{2, 7, 9, 12};

            for (int i = 0; i < numeros2.length; i++) {
                System.out.println(numeros2[i]);
            }

            for (int num : numeros3) {
                System.out.println(num);
            }

        int[] palavras = new int[3];
        int[] palavras2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] palavras3 = new int[]{2, 4, 6, 8, 10};
        int[] palavras4 = new int[]{1, 3, 5, 7, 9};
        String[] nomes = new String[]{"Bruno", "Evelyn", "Ednei", "Carmen"};
        String[] nomes2 = new String[]{"Lilian", "Paulo", "Anita"};

        for (String names2 : nomes2) {
            System.out.println(names2);
        }

        for (String names : nomes) {
            System.out.println(names);
        }

        for (int words2 : palavras4) {
            System.out.println(words2);
        }

        for (int words : palavras3) {
            System.out.println(words);
        }

        {
            int[][] dias = new int[3][3];
            dias[0][0] = 31;
            dias[0][1] = 28;
            dias[0][2] = 31;
            dias[1][0] = 30;
            dias[1][1] = 31;
            dias[1][2] = 30;

            for (int i = 0; i < dias.length; i++) {
                for (int j = 0; j < dias[i].length; j++) {
                    System.out.println(dias[i][j]+" teste1");
                }
            }
            for (int [] arrBase: dias){
                for (int num: arrBase){
                    System.out.println(num);
                }
            }
        }

        {
            int[] array2 = {0, 1};
            int[] array3 = {5, 6, 7, 8, 9, 10};
            int[] array = {2, 3, 4};
            int[][] arrayInt = new int[3][];
            arrayInt[1] = array;
            arrayInt[0] = array2;
            arrayInt[2] = array3;

            for (int[] arrayBase : arrayInt) {
                System.out.println("\n------------------");
                for (int num : arrayBase) {
                    System.out.print(num + " , ");
                }
            }
        }

        {
            int[][] arrayInt2 = {{0, 1}, {2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
            for (int[] arrayBase : arrayInt2) {
                System.out.println("\n------------------");
                for (int num : arrayBase) {
                    System.out.print(num + " , ");
                }
            }
        }

        {
            java.util.Scanner s = new java.util.Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = s.nextLine();
            System.out.println("\n" + nome + ", seja bem vindo (a) :");
        }
        */
        {

        }
    }
}