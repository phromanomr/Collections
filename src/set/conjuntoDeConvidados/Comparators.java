package set.conjuntoDeConvidados;

import java.util.Comparator;

public class Comparators {
    
    public static class CompararPorCodigoConvite implements Comparator<Convidado> {

        @Override
        public int compare(Convidado convidado1, Convidado convidado2) {
            return Integer.compare(convidado1.getCodigoConvite(), convidado2.getCodigoConvite());
        }
        
    }

}
