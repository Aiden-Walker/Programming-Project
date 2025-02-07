package hashmap.beans;

import java.util.ArrayList;

public class Cubilete {
    ArrayList<Dado> cubilete;

    public Cubilete(int numDados, int numCaras) {
        cubilete = new ArrayList<>();
        for (int i = 0; i < numDados; i++) {
            cubilete.add(new Dado(numCaras));
        }
    }
    public int lanzarDados() {
        int sumaValoresTiradas = 0;
        for (Dado dado : cubilete) {
            sumaValoresTiradas= sumaValoresTiradas+(int)(Math.random()*dado.getNumCaras())+1;
        }
        // lanzar cada dado y sumar acumulativamente los valores
        return sumaValoresTiradas;
    }
}
