import java.util.Scanner;

public class Programa {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("número em gravado na variavel primitiva: " + n);
        Integer n2 = n;
        System.out.println("Número gravado na variavel Wrapper: " + n2);

        sc.close();
    }

}
