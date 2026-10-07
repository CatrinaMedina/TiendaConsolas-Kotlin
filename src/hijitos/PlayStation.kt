package hijitos

import papito.Consola
class PlayStation (
    id : Int, nombre: String, override val precioBase: Double, categoria: String,
    private val mesesPlus: Int
): Consola (id,nombre,precioBase,categoria) {
    override fun precioFinal(tasaIVA: Double): Double = precioBase* (1 + (tasaIVA * 0.5))
    override fun etiqueta(): String = "PlayStation ($mesesPlus meses Plus)"
}