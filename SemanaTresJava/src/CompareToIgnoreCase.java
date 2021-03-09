public class CompareToIgnoreCase {
    public static void main(String[]args) {
        String texto = "A API de Strings é uma das mais utilizadas na linguagem Java";
        String linguagem = texto.substring(texto.indexOf("Java"), texto.length());
        System.out.println(linguagem);

        if(linguagem.compareToIgnoreCase("java") == 0) {
            System.out.println("Usando compareToignoreCase: Encontrei a linguagem! Ela é " + linguagem);
        }
        if(linguagem.compareTo("java") == 0) {
            System.out.println("Usando compareTo: Encontrei a linguagem! Ela é " + linguagem);
        } else {
            System.out.println("Não achou com compareTo");
        }

        //Removendo caracteres e espaços de texto
        System.out.println(" Deyvison ".trim());
        System.out.println(texto.replace(" ",""));
    }
}

    /*O método compareToIgnoreCase () compara duas strings lexicograficamente,
    ignorando as diferenças entre maiúsculas e minúsculas.*/