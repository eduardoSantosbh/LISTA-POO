

public class Pessoa {

    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;
    double IMC;
    Data data_nascimento;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso, double IMC) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.IMC = IMC;

    }


    public void setNome(String meuNome) {
        nome = meuNome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String meuSobrenome) {
        sobrenome = meuSobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setIdade(int minhaIdade) {
        idade = minhaIdade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double minhaAltura) {
        altura = minhaAltura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double meuPeso) {
        peso = meuPeso;
    }

    public double getPeso() {
        return peso;
    }

    public void setIMC(double minhaIMC) {
        IMC = minhaIMC;
    }

    public double getIMC() {
        return IMC;
    }

    public void calculoIMC(Pessoa pessoa) {

         IMC = pessoa.getPeso() / (Math.pow(pessoa.getAltura(), pessoa.getAltura()));

    }

    public void informaObesidade(Pessoa pessoa) {

        if (pessoa.getIMC() < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (pessoa.getIMC() >= 18.5 && pessoa.getIMC() < 25) {
            System.out.println("Peso normal");
        } else if (pessoa.getIMC() >= 25 && pessoa.getIMC() < 30) {
            System.out.println("Sobrepeso");
        } else if (pessoa.getIMC() >= 30 && pessoa.getIMC() < 35) {
            System.out.println("Obesidade grau 1");
        } else if (pessoa.getIMC() >= 35 && pessoa.getIMC() < 40) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }



    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", IMC=" + IMC +
                ", data_nascimento=" + data_nascimento +
                '}';
    }
}
