import javax.sound.sampled.SourceDataLine;

public class pessoa {

    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;
    double IMC;
    data data_nascimento;

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

    public double calculoIMC(double IMC) {
        double calculo = peso / (Math.pow(altura, altura));
        return calculo;
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

}
