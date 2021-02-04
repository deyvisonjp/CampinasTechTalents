public class Exercicio27Jan {

    String nome = "Deyvison";
    String endereco = "Rua Francisco Pinto Ribeiro nº27 b. Triângulo - Pat. do Muriaé - MG";
    Byte idade = 32;
    char estadoCivil = 'C';
    float salario = 10000.00f; // Dos sonhos

    @Override
    public String toString() {
        return "Exercícios (27/01/2021) -  Meus Dados" + "\n" +
                "Nome: " + nome + "\n" +
                "Endereco: " + endereco + "\n" +
                "Idade: " + idade + "\n" +
                "Estado Civil: " + estadoCivil + "\n" +
                "Salário: R$ " + String.format("%.2f", salario) + (" ... DOS SONHOS");
    }
}
