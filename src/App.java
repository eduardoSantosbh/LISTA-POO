public class App {
    public static void main(String[] args) {

        Pessoa victor = new Pessoa("Victor", "Sansgiorge",20,1.85,80,0);

        victor.calculoIMC(victor);
        victor.informaObesidade(victor);
        System.out.println(victor);

    }

}
