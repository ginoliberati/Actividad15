package kruskal;

import disjointset.DisjointSet;
import disjointset.HeuristicDisjointSet;
import grafo.Grafo;
import grafo.Pesado;
import kruskal.sorter.MergeSorter;
import kruskal.sorter.Sorter;
import lista.ListaDoble;
import lista.PositionList;

import java.util.Iterator;
import java.util.List;

public class KruskalOrdenadoConHeuristica implements Kruskal {
    public PositionList<Pesado> kruskal(Grafo grafo) {
        PositionList<Pesado> listaResultado = new ListaDoble<>();
        List<Pesado> arcos = grafo.getArcos();

        Sorter sorter = new MergeSorter();
        arcos = sorter.sort(arcos);

        DisjointSet conjuntos = new HeuristicDisjointSet(grafo.getNodos());
        Iterator<Pesado> iter = arcos.iterator();
        Pesado arco = iter.next();

        while (conjuntos.size() != 1) {
            int conjNodo1 = conjuntos.findSet(arco.getNodo1());
            int conjNodo2 = conjuntos.findSet(arco.getNodo2());

            if (conjNodo1 != conjNodo2) {
                listaResultado.addFirst(arco);
                conjuntos.union(conjNodo1, conjNodo2);
            }

            arco = iter.next();
        }

        return listaResultado;
    }
}
