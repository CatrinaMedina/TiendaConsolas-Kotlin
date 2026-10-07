package papito

open class Consola(
    val id : Int,
    val nombre: String,
    open val precioBase: Double,
    val categoria: String

){
    open fun precioFinal(tasaIVA: Double): Double = precioBase * (1 + tasaIVA)
    open fun etiqueta(): String = "Consola"
}