public class correcaoSala{

    public static void main(String[]args){
        double [] precos = populaVetor();
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
}