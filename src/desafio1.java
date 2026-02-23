import java.util.Scanner;

public class desafio1 {

    static void main() {
        Scanner sc = new Scanner(System.in);


        int opcao = 0;
        while (opcao < 5) {
            System.out.println("================================");
            System.out.println("Escolha uma opção:");
            System.out.println("""
                    1- Multiplicação
                    2- Divisão
                    3- Adição
                    4- Subtração
                    5- Sair
                    :
                    """);
            opcao = sc.nextInt();

            if (opcao < 1 || opcao == 5) {
                System.out.println("Sair");
                sc.close();
                return; // para o código não continuar executando
            }

            System.out.print("Informe o primeiro numero:");
            int num1 = sc.nextInt();

            System.out.print("Informe o primeiro numero:");
            int num2 = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Multiplicação:" + num1 + "x" + num2 + "=" + (num1 * num2));
                    break;
                case 2:
                    System.out.println("Divisão:" + num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case 3:
                    System.out.println("Adição:" + num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case 4:
                    System.out.println("Subtração:" + num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
            }
        }


    }

}
