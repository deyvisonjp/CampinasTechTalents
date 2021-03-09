public class CompareTo {
    public static void main(String[] args) {
        String nomeUm = "Deyvison";
        String nomeDois = "Deyvis";
        System.out.println(nomeDois + " tem " + nomeDois.compareTo(nomeUm) + " caracteres, comparado ao " + nomeUm);
        System.out.println(nomeUm + " tem " + nomeUm.compareTo(nomeDois) + " caracteres, comparado ao " + nomeDois);
    }
}
