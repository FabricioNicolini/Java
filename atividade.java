import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       double[] preco = new double[10];
       for (int i = 0; i < preco.length; i++) {
           System.out.println("Digite o preço do produto número " + (i + 1) + ": ");
           preco[i] = sc.nextDouble();
        }

       System.out.println("Veja os preços cadastrados: ");
       for (int i = 0; i < preco.length; i++) {
           System.out.println("Produto " + (i + 1) + ": R$ " + preco[i]);
        }

       System.out.println("Informe o desconto que deseja aplicar (em %): ");
       double desconto = sc.nextDouble();

       System.out.println("Produtos com desconto: ");
       for (int i = 0; i < precco.length; i++) {
           double novoPreco = preco[i] - (preco[i] * desconto / 100);
           System.out.println("Produto " + (i + 1) + " com desconto: R$ " + novoPreco);
       }
       sc.close();
   }
}