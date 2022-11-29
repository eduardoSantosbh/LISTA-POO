import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        pessoa victor = new pessoa();

        double peso;
        System.out.println("Qual seu peso? ");
        peso = sc.nextDouble();
        victor.setPeso(peso);
        victor.getPeso();

        double altura;
        System.out.println("Qual sua altura? ");
        altura = sc.nextDouble();
        victor.setAltura(altura);
        victor.getAltura();
        sc.close();

    }

}
