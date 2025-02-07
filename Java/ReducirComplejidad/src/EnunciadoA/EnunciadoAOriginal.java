package EnunciadoA;

public class EnunciadoAOriginal {
    public static void main(String[] args) {
    public void colocarBomba(int numeroBombas){
        double i=0;
        double z=0;
        int condicion=0;
        do {
            i=Math.random()*getAncho();
            z=Math.random()*getAlto();
            i=(int)i;
            z=(int)z;
            if (z!=0 && i!=0 && z!=alto-1 && i!=ancho-1){
                elArray[(int)i][(int) z ]="B";
                condicion++;
            }
            else
            if (z==0 && i==0) {
                elArray[(int) i][(int) z]=”B”;
                elArray[(int) getAncho-1][(int) getAlto-1]=”B”;
            }
        }
        while (condicion<=ancho);
    }
}
}
