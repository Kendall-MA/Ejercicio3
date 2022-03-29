package model

class Repartidor : Empleado {
    var zona : String

    constructor(p_nombre: String, p_edad: Int, p_salario: Float, p_zona: String) {
        super.nombre = p_nombre
        super.edad = p_edad
        super.salario = p_salario
        this.zona = p_zona
    }

    override fun plus() : String {
        if (super.edad < 25 && this.zona == "Zona 3") {
            "${super.nombre} tiene el plus del salario"
        }
        return "${super.nombre} no tiene el plus del salario"
    }
}