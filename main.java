import java.util.Scanner;
public class main{
    public static void Main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor dos custos do espetáculo");
        float VE=sc.nextFloat();
        System.out.print("Valor do ingresso");
        float VI=sc.nextFloat();

        int qI=(int) Math.ceil(VE/VI);
        int q23=(int) Math.ceil(VE*1.23/VI);

        System.out.println("A quantidade de convites a serem vendidos para que o custo do espetáculo seja alcançado é: "+ qI);
        System.out.println("A quantidade de convites vendidos para obter um lucro de 23% é: "+ q23);
    }
    
}   