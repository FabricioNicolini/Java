public class correcaoSala{

    public static void main(String[]args){
        Scanner sc = new Scanner(Sytem.in);
        double [] precos = populaVetor();
        System.out.printf("Valor do desconto: ");
        double desconto = sc.nextDouble();
        aplicacaoDesconto(precos, desconto);
        imprime(precos);

    }

    public static void aplicaDesconto(double[] precos, double desconto){
        for (int i = 0; i < precos.lenght; i++){
            precos[i] = precos[i] - (precos[i] * desconto/100);
        }
    }

    public static double[] populaVetor(){
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[10];
        for(int i = 0; i < precos.lenght; i++){
            System.out.printf("Preco #%d:", (i + 1 ));
            precos[i] = entrada.nextDouble();
        }
        return precos;
    }

    public static void imprime(double[] vetor){
        for (int i = 0; i < vetor.lenght; i++){
            System.out.printf("%6.2f", vetor[i]);
        }
        System.out.println();
    }
}