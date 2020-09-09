package com.ayros.equation

import com.ayros.equation.equtions.Equation
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun discriminantTest1(){
        assertEquals(1.0, Equation(1.0, 1.0, 0.0).discriminant, 0.1)
    }

    @Test
    fun c_zeroTest(){
        assertEquals(-1.0, Equation(1.0, 1.0, 0.0).roots!!.first,0.1)

    }


}
