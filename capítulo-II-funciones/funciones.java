public class Funciones {
    public static int CuadradoSuma(int miEntero, int segundoEntero){
        // Calcular el cuadrado de una suma
        double resultado = Math.pow(miEntero + segundoEntero, 2);
        int resultado_convertido = (int) resultado; 
        return resultado_convertido;
    }

    public static int SumaCuadrado (int a, int b){
        // Calcular la suma de cuadrados ;)
        double resultado = Math.pow(a, 2) + Math.pow(b, 2);
        int resultado_convertido = (int) resultado; 
        return resultado_convertido; 
    }

    public static boolean ChequeoFinal (int cuadrado_suma, int suma_cuadrado){
        // Chequea si dos valores son iguales
        boolean check = cuadrado_suma == suma_cuadrado;
        return check;
    }

    
    

    public static void ChequeoIgualdad(){
        // int[] miArreglo = new int[]{1, 2, 3, 4, 5};
        // int[] mismoArreglo = new int[]{1, 2, 3, 4, 5};
        // si quiero chequear si dos arreglos son iguales, 
        // es mejor usar bucle
        // si quiero imprimir los valores, puedo usar 
        // un bucle mejorado
        // System.out.println(miArreglo);
    }
    public static int SumarArreglo (int[] miArreglo){
        // sumar los enteros de manera sucesiva
        int acumulador = 0;
        for (int entero : miArreglo) {
            acumulador = acumulador + entero;
        }
        return acumulador; 
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
    
    public static void ChequeoPar (int entero){
        // si el numero es par
        if (entero % 2 == 0) {  // primera condicion
            System.out.println("Este es un entero par!");
            if (entero == 2) {
                System.out.println("Es es mi primo dos!");
            }
        }
        // si el numero es impar
        else if (entero % 2 == 1) {
            System.out.println("Este es un entero impar!");
        }

        }

    public static void main(String[] args) {

        // Integer miEntradaEntero = Integer.parseInt(args[0]);

        // ChequeoPar(miEntradaEntero); // si especifo entrada, tengo que recompilar para obtener un 
        //                              // resultado diferente
        
        // 1. crear nuestro propio arreglo
        int[] miArregloPersonalizado = new int[args.length];
        // 2. Llenarlo con cada uno de los args descifrados a
        // enteros
        for (int i = 0; i < args.length; i ++) {
            // Parsing de cadena a entero; "12" != 12
            Integer miEntrada = Integer.parseInt(args[i]);
            miArregloPersonalizado[i] = miEntrada;
        }
        // 3. Ejecutar mi funcion SumarArreglo
        int miSuma = Chequeo.SumarArreglo(miArregloPersonalizado);
        System.out.println(miSuma);


    }
    
}
