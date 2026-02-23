import java.util.Scanner;

public class teste {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nomeProd = "";
        double financeiro = 100;
        int estoque = 0;

        System.out.println("""
                1- Compra
                2- Venda
                3- Estoque
                4- Financeiro
                5- Sair
                :
                """);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o nome do produto");
                String nome = sc.next();

                System.out.println("Informe o valor do produto");
                double valor = sc.nextDouble();

                System.out.println("Informe o quantidade do produto");
                int quantidade = sc.nextInt();

                nomeProd = nome;
                financeiro = financeiro - valor;
                estoque = estoque + quantidade;
                break;
            case 2:
                System.out.println("Informe o nome do produto");
                String nomeProduto = sc.next();

                System.out.println("Informe o valor do produto");
                double valorProduto = sc.nextDouble();

                System.out.println("Informe o quantidade do produto");
                int quantidadeProduto = sc.nextInt();

                estoque = estoque + quantidadeProduto;
                financeiro = financeiro + (valorProduto * 1.05);
                break;
            case 3:
                System.out.println("Estoque: " + estoque);
                break;
            case 4:
                System.out.println("Financeiro: " + financeiro);
                break;
            case 5:
                sc.close();
                return;
        }
    }
}
