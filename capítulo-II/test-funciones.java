import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestArreglo1()
    {
        // Definimos una entrada que deseamos
        int[] miArregloEjemplar1 = new int[]{1, 2, 3, 4, 5}; 
        // Definimos un egreso que esperamos que 
        // la funcion devuelva
        int[] miArregloEsperado1 = new int[]{5, 4, 3, 2, 1};

        // Ejecutamos mi funcion
        int[] miArregloDevuelto = Funciones.RevertirArreglo(miArregloEjemplar1); 
        
        // Devuelva true si mi funcion devuelve el arreglo invertido
        assertArrayEquals(miArregloEsperado1, miArregloDevuelto );

    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestArreglo2()
    {
        // Definimos una entrada que deseamos
        int[] miArregloEjemplar2 = new int[]{-10, -8, -6, -4, -2, 0}; 
        // Definimos un egreso que esperamos que 
        // la funcion devuelva
        int[] miArregloEsperado2 = new int[]{0, -2, -4, -6, -8, -10};

        // Ejecutamos mi funcion
        int[] miArregloDevuelto = Funciones.RevertirArreglo(miArregloEjemplar2); 
        
        // Devuelva true si mi funcion devuelve el arreglo invertido
        assertArrayEquals(miArregloEsperado2, miArregloDevuelto );
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestArregloVacio()
    {
        // Definimos una entrada que deseamos
        int[] miArregloEjemplar1 = new int[]{}; 
        // Definimos un egreso que esperamos que 
        // la funcion devuelva
        int[] miArregloEsperado1 = new int[]{};

        // Ejecutamos mi funcion
        int[] miArregloDevuelto = Funciones.RevertirArreglo(miArregloEjemplar1); 

        
        // Devuelva true si mi funcion devuelve el arreglo invertido
        assertArrayEquals(miArregloEsperado1, miArregloDevuelto );
    }
}
