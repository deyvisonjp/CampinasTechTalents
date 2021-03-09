package ExercicioAutenticar;

import ExercicioAutenticar.Funcionario;

public class Gerente extends Funcionario {

    public boolean autentica(int senha) {
        if(getSenha() == senha) {
            return true;
        }
        return false;
    }
}
