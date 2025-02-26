import java.util.Scanner;
public class redeSocial{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe quantas postagens serão analisadas?: ");
        int pos = sc.nextInt();
        int totalCurtidas=0;
        for(int i=0;i<pos;i++){
            System.out.println("Número de curtidas da postagem :");
            int numCurtidas=sc.nextInt();
            if(numCurtidas>=100){
                System.out.println("Publicação famosa");
            }else{
                System.out.println("Publicação com poucas curtidas");
            }
            totalCurtidas=totalCurtidas+numCurtidas;
        }
        float mediaCurtidas = totalCurtidas/pos;
        System.out.println("A média de curtidas é: "+ mediaCurtidas);
        System.out.println("O número de publicações é: "+ pos);
        sc.close();
    }
}