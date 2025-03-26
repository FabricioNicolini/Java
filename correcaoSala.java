import java.util.Scanner;
public class correcaoSala{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double [] precos = populaVetor();
        System.out.printf("Valor do desconto: ");
        double desconto = sc.nextDouble();
        
        aplicaDesconto(precos, desconto);
        imprime(precos);

    }

    public static void aplicaDesconto(double[] precos, double desconto){
        for (int i = 0; i < precos.length; i++){
            precos[i] = precos[i] - (precos[i] * desconto/100);
        }
    }

    public static double[] populaVetor(){
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        for(int i = 0; i < precos.length; i++){
            System.out.printf("Preco #%d:", (i + 1 ));
            precos[i] = sc.nextDouble();
        }
        return precos;
    }

    public static void imprime(double[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%8.2f", vetor[i]);
        }
        System.out.println();
    }
}