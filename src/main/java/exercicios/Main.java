package exercicios;

public class Main {
    public static void main(String[] args) {

        System.out.println("============== Ex1 ==============");
        imprimirNome("Thiago");

        System.out.println("============== Ex2 ==============");
        calcularOperacoes(10, 3);

        System.out.println("============== Ex3 ==============");
        compra(15);

        System.out.println("============== Ex4 ==============");
        valorFrete("SP");


        System.out.println("============== Ex5 ==============");
        // Modelos: X1, UNO, HB20.
        concessionaria("X1");

        System.out.println("============== Ex6 ==============");
        clubePesca(2,2);

        System.out.println("============== Ex7 ==============");
        duracaoDaRacao(50, 500);

        System.out.println("============== Ex8 ==============");
        minimercadoFerreirinha(200);

    }

    //Exercicio1
    public static void imprimirNome(String meuNome) {
        System.out.println("My name: " + meuNome);
    }

    //Exercicio2
    public static void calcularOperacoes(double num1, double num2) {
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f\n", divisao);
    }

    //Exercicio3
    public static void compra(int idadeUsuario) {
        int idadePadraoParaCompra = 16;

        if (idadeUsuario >= idadePadraoParaCompra) {
            System.out.println("Pode fazer a Compra");
        } else {
            System.out.println("Não pode realizar a compra");
        }
    }

    //Exercicio4
    public static void valorFrete(String local) {

        int valor;
        switch (local) {
            case "SP" -> {
                valor = 100;
                System.out.println("O valor do frete é: " + valor);
            }
            case "BA" -> {
                valor = 200;
                System.out.println("O valor do frete é: " + valor);
            }
            case "MG" -> {
                valor = 300;
                System.out.println("O valor do frete é: " + valor);
            }
            default -> System.out.println("Local não encontrado, impossivel calcular");
        }
    }

    //Exercicio5
    public static void concessionaria(String modelo) {

        double desconto;
        String marca;
        double preco;
        double parcela;

        switch (modelo) {
            case "X1" -> {
                marca = "BMW";
                preco = 299950;
                desconto = 0.3 * preco;
                parcela = (preco - desconto) / 12;
                System.out.println("Marca: " + marca + " " + modelo);
                System.out.println("Valor do veículo: R$" + preco);
                System.out.println("Valor da entrada(30%): R$" + desconto);
                System.out.printf("Parcela em 12x: R$%.2f\n", parcela);
            }
            case "UNO" -> {
                marca = "FIAT";
                preco = 11249;
                desconto = 0.3 * preco;
                parcela = (preco - desconto) / 12;
                System.out.println("Marca: " + marca + " " + modelo);
                System.out.println("Valor do veículo: R$" + preco);
                System.out.println("Valor da entrada(30%): R$" + desconto);
                System.out.println("Parcela em 12x: R$" + parcela);
            }
            case "HB20" -> {
                marca = "HYUNDAI";
                preco = 60000;
                desconto = 0.3 * preco;
                parcela = (preco - desconto) / 12;
                System.out.println("Marca: " + marca + " " + modelo);
                System.out.println("Valor do veículo: R$" + preco);
                System.out.println("Valor da entrada(30%): R$" + desconto);
                System.out.println("Parcela em 12x: R$" + parcela);
            }
            default -> System.out.println("Modelo não encontrado");
        }
    }

    //Exercicio6
    public static void clubePesca(int pessoas, int peixe) {
        int valorPeixeExtra = 0;

        if (peixe > pessoas) {
            valorPeixeExtra = 12 * (peixe - pessoas);
        }
        int valorDaConta = (pessoas * 20) + valorPeixeExtra;
        System.out.printf("Uma família de %d pessoas pescou %d peixes, e seu valor total foi de R$ %.2f\n", pessoas, peixe, (double)valorDaConta);
    }

    //Exercicio7
    public static void duracaoDaRacao(double pesoDaRcao, double consumoDiarioCachorro){
        double pesoDaRacaoEmGramas = pesoDaRcao * 1000;
        int duracaoEmDias = (int) (pesoDaRacaoEmGramas / consumoDiarioCachorro);
        int sobra = (int) (pesoDaRacaoEmGramas % consumoDiarioCachorro);

        System.out.printf("A duração da ração é: %d dias\n", duracaoEmDias);
        if (sobra == 0){
            System.out.println("Não sobrou nenhuma ração. Compre mais. ");
        }
        else {
            System.out.printf("A quantidade que sobrou é: %d g", sobra);
        }
    }

    //Exercicio8
    public static void minimercadoFerreirinha(double valorTotal) {
        if (valorTotal < 20.0) {
            System.out.println("O valor mínimo para parcelamento é de R$ 20,00.");
        } else {
            int numeroMaximoParcelas = (int) (valorTotal / 20);
            double valorParcela = valorTotal / numeroMaximoParcelas;

            System.out.println("Número máximo de parcelas: " + numeroMaximoParcelas);
            System.out.printf("Valor de cada parcela: R$ %.2f\n", valorParcela);
        }
    }

}

