import java.util.Scanner;
public class main{
    public static void Main ( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor dos custos do espetáculo: ");
        float VE=sc.nextFloat();
        System.out.print("Valor do ingresso: ");
        float VI=sc.nextFloat();

        int qI=(int) Math.ceil(VE/VI);
        int q23=(int) Math.ceil(VE*1.23/VI);

        System.out.printf("A quantidade de convites = %d\n ", qI);
        System.out.printf("lucro de 23%: %d\n", q23);
    }
}   