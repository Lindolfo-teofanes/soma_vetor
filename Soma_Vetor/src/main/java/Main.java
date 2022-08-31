import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        final int VETOR[] = {45,12,2,8,37,98};
        Soma soma = new Soma();

        do{
            op = menu();

            switch (op){
                case 1:
                    System.out.println("Calculando...");
                    System.out.println("O resultado e " + soma.somaVetor(VETOR));
                    break;
                case 2:
                    System.out.println("Obrigado por utilizar nossa calculadora!!");
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    break;
            }
        }while(op != 2);
    }

    public static int menu(){
        System.out.println("\n\n..:: Calculadora de vetores ::..");
        System.out.println("Escolha uma opcao:");
        System.out.println("1 - somar o vetor ");
        System.out.println("2 - sair");
        int op = in.nextInt();

        return op;
    }
}
