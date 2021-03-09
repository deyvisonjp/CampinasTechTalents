package MetodosClassesString;

public class IndexOf {
    public static void main(String[]args) {
        String letras = "abcadefghijklmcopqredeftuvz";

        System.out.printf("O primeiro 'c' está localizado no index %d\n", letras.indexOf('c'));
        System.out.printf("O primeiro 'a' está localizado no index %d\n", letras.indexOf('a', 1));

        //Não Existe
        System.out.printf("'$' está localizado no index %d\n\n", letras.indexOf('$'));

        //lastIndexOf
        System.out.printf("O último 'c' está localizado no index %d\n", letras.lastIndexOf('c'));
        System.out.printf("O último 'a' está localizado no index %d\n", letras.lastIndexOf('a', 5));
        System.out.printf("'$' está localizado no index %d\n\n", letras.lastIndexOf('$'));

        System.out.printf("\"def\" esta localizado no index %d\n", letras.indexOf("def"));

        //Com dois argumentos, a string a pesquisar e o outro o ponto onde iniciará a pesquisa
        System.out.printf("\"def\" esta localizado no index %d\n", letras.indexOf("def", 7));
    }
}
