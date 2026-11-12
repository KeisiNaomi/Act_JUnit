package com.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {
    @Test
    void probarArregloSinCeros() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = {1, 2, 3, 4};
        assertEquals(0, arrayOperations.numZero(x));
    }

    @Test
    void probarArregloConCeroAlInicio() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = {0, 1, 5, 2, 8};
        assertEquals(1, arrayOperations.numZero(x));
    }

    @Test
    void probarArregloConVariosCeros() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = {0, 1, 0, 2, 0};
        assertEquals(3, arrayOperations.numZero(x));
    }

    @Test
    void probarArregloNull() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = null;
        assertThrows(NullPointerException.class, () -> arrayOperations.numZero(x));
    }

    @Test
    void probarArregloVacio() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = {};
        assertEquals(0, arrayOperations.numZero(x));
    }

    @Test
    void probarArregloConCeroAlFinal() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = {1, 2, 3, 0};
        assertEquals(1, arrayOperations.numZero(x));
    }

    @Test
    void probarArregloConNegativos() {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] x = {-1, -2, 0, -3, -4, 0};
        assertEquals(2, arrayOperations.numZero(x));
    }
}
