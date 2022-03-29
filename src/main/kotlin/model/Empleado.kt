package model

abstract class Empleado {
    var nombre : String
    var edad : Int
    var salario : Float

    var PLUS = 300

    init {
        this.nombre = ""
        this.edad = 0
        this.salario = 0.0f
    }

    abstract fun plus() : String
}