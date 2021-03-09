package MetodosClassesString;

public class CitacaoV2 {
    public String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor.toUpperCase();
    }

    public void criarCitacao(){

        String abreviacao = "";

        String arrayEx[] = {"DE", "DA", "DO", "DAS", "DOS"};

        String arrayNomes[] = autor.split(" ");

        String ultimoNome = arrayNomes[arrayNomes.length - 1];

        for (int i = 0; i < 2; i++) {

            for (String excecao: arrayEx) {
                if(arrayNomes[i].equals(excecao)) {
                    ++i;
                }
            }
            abreviacao += arrayNomes[i].substring(0,1) + ". ";
        }

        System.out.println(ultimoNome + ", " + abreviacao);

    }


}
