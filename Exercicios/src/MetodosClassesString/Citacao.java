package MetodosClassesString;

import java.util.Locale;

public class Citacao {

    public static void main(String[]args) {

        String autor = "Deyvison Jose de Paula Antunes";
        System.out.println("--- CONVERTE EM CITAÇÃO 1.0 ---");
        autor = autor.toUpperCase();

        //Remove da, das, de, dos
        if(autor.indexOf(" DA ") > 0 ) {
            autor = autor.replace(" DA ", " ");
        } else if (autor.indexOf(" DAS ") > 0) {
            autor = autor.replace(" DAS ", " ");
        } else if (autor.indexOf(" DE ") > 0) {
            autor = autor.replace(" DE ", " ");
        } else if (autor.indexOf(" DOS ") > 0){
            autor = autor.replace(" DOS ", " ");
        }

        System.out.println(autor);

        int pos = autor.lastIndexOf(" ");
        String ultimopNome = autor.substring(pos, autor.length());

        String inicialPrimeiroNome = autor.substring(0, 1);

        int posSegundoNome = autor.indexOf(" ");
        String inicialSegundoNome = autor.substring(posSegundoNome+1, posSegundoNome+2);

        System.out.println(autor + " -> " +
                ultimopNome.toUpperCase() + ", " +
                inicialPrimeiroNome + ". " + inicialSegundoNome + "."
        );

        System.out.println("-".repeat(autor.length()*2));

    }
}


// CITAÇÃO 2.0
/*
public class NomeCompleto {

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarCitacao(){

        String abreviacao = "";

        String arrayEx[] = {"de", "da", "do", "des", "das", "dos"};

        String arrayNomes[] = nome.split(" ");

        String sobrenome = arrayNomes[arrayNomes.length - 1].toUpperCase();

        for(int i = 0; i < arrayNomes.length -1 ; i++) {

            boolean verificacao = false;

            for(int j = 0; j < arrayEx.length; j++) {
                if(arrayNomes[i].equals(arrayEx[j])) {
                    verificacao = true;
                }
            }

            if(!verificacao) {
                abreviacao += arrayNomes[i].substring(0,1).toUpperCase() + ". ";
            }

        }

        System.out.println("Citação: " + sobrenome + ", " + abreviacao.trim());

    }



    ----

    public class Citacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		NomeCompleto nomeCompleto = new NomeCompleto();

		char continuar = 's';

		do {

		System.out.println("\nEntre com um nome completo: ");
		nomeCompleto.setNome(sc.nextLine().trim());

		System.out.println("\n\nNome completo: " + nomeCompleto.getNome().toUpperCase()+ "\n");

		nomeCompleto.criarCitacao();

		System.out.println("\n\nDeseja criar outra citação? (s/n)");
		continuar = sc.nextLine().charAt(0);

		}while (continuar == 's');

		System.out.println("\nObrigada, até a próxima!");
		sc.close();


	}

}

}*/