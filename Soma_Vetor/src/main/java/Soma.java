import lombok.Data;

@Data
public class Soma {
    int[] vetor;

    int somaVetor(int[] vetor){
        int resultado = 0;

        for(int i=0; i < vetor.length; i++){
            resultado = resultado + vetor[i];
        }


       return resultado;
    }
}
