package MetodosClassesString;

public class MainCitacaoV2 {
    public static void main(String[] args) {
        CitacaoV2 ct = new CitacaoV2();
        ct.setAutor("Deyvison de Jose Martins de Paula");
        System.out.println(ct.getAutor());
        ct.criarCitacao();
    }
}
