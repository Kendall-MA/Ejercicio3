package model

class Comercial : Empleado {
    var comision : Double

    constructor(p_nombre: String, p_edad: Int, p_salario: Float, p_comision: Double) {
        super.nombre = p_nombre
        super.edad = p_edad
        super.salario = p_salario
        this.comision = p_comision
    }

    override fun plus() : String {
        if (super.edad > 30 && this.comision > 200) {
            return "${super.nombre} tiene el plus del salario"
        }
        return "${super.nombre} no tiene el plus del salario"
    }
}