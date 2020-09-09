package com.ayros.equation

import com.ayros.equation.equtions.Equality
import com.ayros.equation.equtions.Equation
import com.ayros.equation.equtions.SimpleEquation

fun equation(a: Double,b: Double,c: Double)=

    when{
        a == 0.0 && b == 0.0 -> Equality(c,0.0)
        a == 0.0 -> SimpleEquation(b,c)
        else -> Equation(a,b,c)
    }

