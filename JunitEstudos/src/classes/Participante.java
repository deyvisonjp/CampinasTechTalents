package classes;

public class Participante {
    private String nome;
    private byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //this.nome = nome;
        nome = this.nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
