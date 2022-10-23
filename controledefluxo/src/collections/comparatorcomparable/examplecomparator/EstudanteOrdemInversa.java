package collections.comparatorcomparable.examplecomparator;

import java.util.Comparator;

import collections.comparatorcomparable.examplecomparable.Estudante;

public class EstudanteOrdemInversa implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
    
}
