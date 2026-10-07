package hijitos

import papito.Consola

class Nintendo (
    id : Int, nombre: String, override val precioBase: Double, categoria: String,
    private val costoBundle: Double
):Consola (id,nombre,precioBase,categoria){
    override fun precioFinal(tasaIVA: Double): Double = (precioBase * (1 + tasaIVA)) + costoBundle
    override fun etiqueta(): String = "Nintendo"

}