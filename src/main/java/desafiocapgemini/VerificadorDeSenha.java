package desafiocapgemini;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VerificadorDeSenha {
    
    private String senha;

    public String resultado(){
        if(verifica()){
            return "a senha é fraca deve ser adicionado mais " + tamanhoMinimo(senha) + " caracteres para tornala forte";
        }
        return "Senha forte";
    }

    private boolean verifica(){
        return !senha.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}");
    }

    private int tamanhoMinimo(String senha){
        if(senha.length() < 6){
            return 6 - senha.length();
        }
        return 0;
    }
}
