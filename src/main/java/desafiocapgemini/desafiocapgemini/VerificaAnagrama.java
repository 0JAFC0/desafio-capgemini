package desafiocapgemini.desafiocapgemini;

import java.util.ArrayList;
import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VerificaAnagrama {
    private int pares;

    public int analisa(String palavra){
        String[] listaCara = palavra.split("");
        String[] listaClone = listaCara.clone();

        Arrays.sort(listaClone);

        ArrayList list = new ArrayList<>();
        for(int i = 0;i < listaClone.length-1;i++){
            for(int x = 0;x<i+1;x++){
                if(listaClone[i].equals(listaClone[x])){
                    this.pares++;
                }
            }
        }
        return pares;
    }
}
