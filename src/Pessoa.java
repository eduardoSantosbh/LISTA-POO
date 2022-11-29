

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

    public static String informaObesidade(double IMC) {
        String retorno = "";

        if (IMC < 18.5) {
            retorno = "Abaixo do peso";
        } else if (IMC >= 18.5 && IMC < 25) {
            retorno = "Peso normal";
        } else if (IMC >= 25 && IMC < 30) {
            retorno = "Sobrepeso";
        } else if (IMC >= 30 & IMC < 35) {
            retorno = "Obesidade grau 1";
        } else if (IMC >= 35 && IMC < 40) {
            retorno = "Obesidade grau 2";
        } else {
            retorno = "Obesidade grau 3";
        }

        return retorno;

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
