package com.ayros.equation.equtions

class Equality(left: Double, right: Double){

    val verity = left == right

    override fun toString(): String =
        if(verity) "Равенство всегда истинно"
        else "Равенство всегда ложно"
}