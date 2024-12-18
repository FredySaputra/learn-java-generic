package fredy.dwi.saputra.generic.application;

import fredy.dwi.saputra.generic.Pair;

public class PairApp<T,U> {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String,Integer>("Fredy",1);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
