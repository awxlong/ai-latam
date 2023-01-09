public class App {
    public static void Variables(){
        // VARIABLES PRIMITIVAS
        byte miPrimeraVariable = 32;
        long miVariableLarga = 25;
        short miVariableCorta = 11; 
        short variableAdicional = miVariableCorta;

        int miEntero = 27 + 59 - 120; 
        float miDecimalSencillo = 1.25f;
        double miDecimalComplicado = 3.14159236;
        char miCaracter = 'a';
        boolean miBoleana = true; 


        // VARIABLES REFERENCIALES
        String miCadena = "Hola, Mundo";
        String miCadenaSobra = miCadena;
        int[] miArreglo = new int[]{2, 5, 8, 9, 17};
        // clase

        VARIABLES BOOLEANAS
        boolean miSegundaVariableBool = false;
        boolean negacion = !false;    // voltear el valor como una moneda
                                    // En Python negacion es "not"

        boolean desigualdad = 5 > 3; //expresion booleana va a ser verdad 
        boolean desigualdad2 = !(-5 > 3); // true
        boolean igualdad = 2 + 2 == 4; // = significa definir, 
                                       // == significa igual que
        boolean igualdad2 = (2*5 - 9*7 != 9*7 - 2*5);

        // CONJUNCIONES
        boolean conjuncion1 = 5 > 3 && 4 > 2; // En Python, "and"
        boolean conjuncion2 = desigualdad2 && 0 < -1; // false

        // DISYUNCION
        boolean dinsyuncion1 = conjuncion2 || 2 > 4;
        boolean dinsyuncion2 = igualdad || -1 > 0; 

        boolean expresionComplicada = dinsyuncion1 || dinsyuncion2 
                                      && igualdad2 || desigualdad;
        System.out.println(dinsyuncion2);
    }
}
