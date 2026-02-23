import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class desafio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto meuProduto = new Produto();

        // Cria estoque tipo Map com chave String e valor Integer
        Map<String, Integer> estoque = new HashMap<>();

        double financeiro = 100;

        System.out.println("""
                Bem vindo a merceria da Feyre *-*
                1- Compra
                2- Venda
                3- Estoque
                4- Financeiro
                5- Sair
                :
                """);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: // todo venda
                break;
            case 2: // todo compra
                break;
            case 3: // todo estoque
                break;
            case 4: // todo financeiro
                System.out.println("Saldo Atual: R$" + financeiro);
                break;
            case 5: // todo sair
                sc.close();
                return;

        }
    }

}


//      todo Quando o usuário selecionar compra
//       - armazenar o nome do produto
//       - armazenar preço
//       - quantidade produto
//       - descontar valor do produto do Financeiro

//       todo Quando o usuário selecionar venda,
//       - retirar um (ou mais) produto(s) do estoque
//       - adicionar o valor do produto(s) no Financeiro, (adicione 5% a mais para cada produto vendido).

//       todo Por as opções Estoque e Financeiro
//        ( verificar quais produtos estocados e valor em caixa).
//
//        Importante, sempre comece com R$100 em caixa.