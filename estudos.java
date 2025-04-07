import java.util.Scanner;

public class estudos{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escreva um dia da semana ");
        String dia = sc.nextLine();
        System.out.println("Escreva um valor inteiro");
        int valor = sc.nextInt();
        System.out.println("Escreva um double");
        double por = sc.nextDouble();
        System.out.printf("Hoje é %s. Faz %.4e minutos que comecei a aprender Java e já entendi quase %.1f%n de tudo que foi discutido até aqui.", dia, (double) valor, por);

        


        sc.close();
    }
}