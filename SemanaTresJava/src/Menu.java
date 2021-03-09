public class Menu {
    int numeroOpcao;
    String[] textosMenus = {"1. Ver Menu", "2. Ler o Menu", "3. Repetir o Menu", "4. Tudo de novo", "5. Não li, pode repetir?", "0. Sair"};

    public void imprimeMenu() {
        for(String textoMenu: textosMenus) {
            System.out.println(textoMenu);
        }
    }

}
