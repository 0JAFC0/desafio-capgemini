package desafiocapgemini.desafiocapgemini;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VerificadorDeSenha {
    
    private String senha;

    public String resultado(){
        if(verifica()){
            return "A senha esta fraca você precisa digitar "+tamanhoMinimo(senha)+" caracteres para deixar ela forte.";
        }
        return "Senha Forte";
    }

    private boolean verifica(){
        return !senha.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{6,}");
    }

    private int tamanhoMinimo(String senha){
        if(senha.length() < 6){
            return 6 - senha.length();
        }
        return 0;
    }
}
