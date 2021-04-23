package CasasAlcarria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc;
        String clave;
        CasaRural busqueda;
        TablaDispersa tabla = new TablaDispersa();

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("    .:CASAS ALCARRIA:.");
            System.out.println("1 - Agregar Casa");
            System.out.println("2 - Buscar Casa");
            System.out.println("3 - Dar de baja Casa");
            System.out.println("4 - Salir");
            System.out.print("OPCION: ");
            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {

                case 1:
                    CasaRural casa = new CasaRural();
                    tabla.insertar(casa);
                    break;

                case 2:
                    System.out.println("Ingrese la clave de la casa a buscar: ");
                    clave = entrada.nextLine();

                    try {
                        busqueda = tabla.buscar(clave);
                        busqueda.muestra();
                    } catch (Exception e) {

                        System.out.println("No se encontró la casa.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese la clave de la casa a eliminar: ");
                    clave = entrada.nextLine();
                    tabla.eliminar(clave);
                    
            }
        } while (opc != 4);
    }
}
