package com.ayros.equation.equtions

class SimpleEquation(val b: Double, val c: Double) {

    val root = -c/b

    override fun toString(): String {
        return "${b}x + $c = 0\n    x = $root"
    }
}