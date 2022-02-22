package desafiocapgemini.desafiocapgemini;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CriadorDeEscadas {

    private int qtdDegraus;

    public String[] formaEscada(){
        String espaco = " ";
        String degrau = "*";

        String[] escada = new String[qtdDegraus];
        for(int i = 0;i < qtdDegraus;i++){
            escada[i] = espaco.repeat(qtdDegraus-(i+1));
            escada[i] += degrau.repeat(qtdDegraus-(qtdDegraus-(i+1)));
        }

        return escada;
    }
}
