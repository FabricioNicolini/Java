import java.util.Scanner;
public class ex5 {
    public static void main(String[]args){
        String palavra = "AULA JAVA";
        Scanner sc = new Scanner(System.in);
        String letra = "";
        int tentativas = 6;
        boolean acertou = false;
        String palavra_certa = "";
        
        
        
        
        while(tentativas > 0 && !acertou){
            System.out.println(palavra_certa);
            letra = sc.nextLine();
            for(int i = 0; i < palavra.length(); i++){
                
            }
            System.out.print("\nDigite uma letra: ");
            letra = sc.nextLine();
            tentativas--;
        }
        if(acertou){
            System.out.println("Parabens voce acertou");
        }else{
            System.out.println("Nao acertou a palavra: "+palavra);
        }
        sc.close();
    }
}