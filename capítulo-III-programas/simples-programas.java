import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void scanner() {
        // 1. Inicializar una instancia de la clase Scanner
        // para tomar ingresos del usuario
        Scanner entradaUsuario = new Scanner(System.in); // cogemos el telefono

        // 2. Mensajes orientativos y leer entradas
        System.out.println("Ingresa el mes: ");
        String mes = entradaUsuario.next();   // leer una entrada cadena

        System.out.println("Ingresa el día: ");
        int dia = entradaUsuario.nextInt();  // leer una entrada entero

        // Escribir codigo para procesar estas entradas
        System.out.println("Hoy es " + dia + " de " + mes );

        // 3. cerrar el scanner ~= colgando telefono
    }
    public static int[] RevertirArreglo(int[] miArregloOriginal){
        // 1. inicializar un arreglo de mismo tamaño
        int[] miArregloRevertido = new int[miArregloOriginal.length];
        
        
        // 2. Llenarlo de manera al revés
        int indice = miArregloRevertido.length - 1;
        //System.out.print(indice);
        for (int contador = 0; contador < miArregloRevertido.length; contador ++ ) {    
            miArregloRevertido[contador] = miArregloOriginal[indice ];
            //System.out.print(miArregloRevertido[contador]);
            indice -= 1;
        }
        return miArregloRevertido;

    }

    public static double VfConT(double v0, double tiempo){
        // calcula velocidad final sabiendo la velocidad inicial y tiempo

        double g = 9.81; // metros por segundo al cuadrado
        double vf = v0 + g * tiempo;
        return vf; 
    }

    public static double VfConH(double v0, double altura){
        // calcula velocidad final sabiendo v0 y altura

        double g = 9.81; // metros por segundo al cuadrado
        double v02 = Math.pow(v0, 2);
        double vf = Math.sqrt(v02 + 2 * g * altura );
        return vf; 
    }

    public static void Ballenas() {
        // 1. Inicializar una instancia de la clase Scanner
        // para tomar ingresos del usuario
        Scanner entradaUsuario = new Scanner(System.in); // cogemos el telefono

        System.out.println("Hola, persona cruel, ingresa lo que mediste (tiempo o altura): "); 
        
        while (entradaUsuario.hasNext()){
            String entrada = entradaUsuario.next();

            if ( entrada.equalsIgnoreCase("altura")) { // ==
                System.out.println("Ingresa tu velocidad inicial y la altura de la caída" + 
                                "(decimales separado por un espacio): "); 
                
                double miV0 = entradaUsuario.nextDouble();
                double miAltura = entradaUsuario.nextDouble();
                
                double miVelocidadFinal = VfConH(miV0, miAltura); 

                System.out.println("La velocidad final de impacto es de: " + miVelocidadFinal + " m/s");
                
            } else if ( entrada.equalsIgnoreCase("tiempo")) {
                
                try {
                    System.out.println("Ingresa tu velocidad inicial y el tiempo de la caída" + 
                                    "(decimales separado por un espacio): ");
                
                    double miV0 = entradaUsuario.nextDouble();
                    double miTiempo = entradaUsuario.nextDouble();
                    if (miV0 < 0  || miTiempo < 0) {
                        throw new IllegalArgumentException("Asumimos caída libre, no puedes" +
                                                        " ingresar velocidad o tiempo negativo. ");
                    }
                    
                    double miVelocidadFinal = VfConT(miV0, miTiempo); 
                    
                    System.out.println("La velocidad final de impacto es de: " + miVelocidadFinal + " m/s");

                } catch (IllegalArgumentException error) {
                    // 1. Terminar elegantement
                    // 2. puedo aceptas nuevas entradas ***
                    System.out.println("Por favor, ingresa valores positivos");

                    double miV0 = entradaUsuario.nextDouble();
                    double miTiempo = entradaUsuario.nextDouble();
                
                    double miVelocidadFinal = VfConT(miV0, miTiempo); 
                
                    System.out.println("La velocidad final de impacto es de: " + miVelocidadFinal + " m/s");
                    
                    // 3. reiniciar el programa
                    Ballenas();

                }
            
            } else if (entrada.equalsIgnoreCase("para")){
                System.out.println("Programa ha terminado");
                break;
            }
    }
        
        entradaUsuario.close(); // colgamos el telefono

        
    }
}
