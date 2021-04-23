package CasasAlcarria;

/*
función hash: método de la multiplicación
Las claves son cadenas de caracteres, primero se transforma
a valor entero. A continuación se aplica el método de multiplicación
 */

public class Dispersion {

    static final int M = 1024;
    static final double R = 0.618034;

    static long transformaClave(String clave) {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(clave.length(), 10); j++) {
            d = d * 27 + (int) clave.charAt(j);
        }
        /*
Para un valor mayor que el máximo entero genera un
numero negativo.
         */
        if (d < 0) {
            d = -d;
        }
        return d;
    
    }
}