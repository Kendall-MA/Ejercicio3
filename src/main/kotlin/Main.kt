import model.Comercial
import model.Repartidor

fun main(args: Array<String>) {

    var repartidor1 = Repartidor("Juan", 22, 200000.0f, "Zona 3")
    var repartidor2 = Repartidor("Carlos", 20, 800000.0f, "Zona 1")

    var comercial1 = Comercial("Allan", 10, 500000.0f, 220.0)
    var comercial2 = Comercial("Brandon", 35, 400000.0f, 220.0)

    println(repartidor1.plus())
    println(repartidor2.plus())

    println(comercial1.plus())
    println(comercial2.plus())
}