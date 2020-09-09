package com.ayros.equation.equtions

import kotlin.math.sqrt


class Equation(val a : Double, val b : Double, val c : Double) {

    val discriminant = b * b - 4 * a * c
    val roots : Pair<Double,Double>? =
        if (discriminant >= 0) {
            Pair((-b - sqrt(discriminant)) / (2 * a), (-b + sqrt(discriminant)) / (2 * a))
        } else null

    override fun toString(): String {
        val str_eq = "${a}x*x + ${b}x + $c = 0\n    "
        val str_x = when{
            roots == null -> "Корней нет"
            roots.first == roots.second -> "x = ${roots.first}"
            else -> "x1 = ${roots.first}\n    x2 = ${roots.second}"
        }
        return str_eq + str_x
    }
}
