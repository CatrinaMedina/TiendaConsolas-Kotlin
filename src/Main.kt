import kotlinx.coroutines.*
import coleccioness.catalogo
import coleccioness.catalogoPorId
import utilidad.leerEntero
import descuenton.calcularDescuentardoAsync

fun main() = runBlocking {
    println("TIENDAZA MINI CONSOLAS DEMO")
    for (item in catalogo){
        println("${item.id}: ${item.nombre} - ${item.etiqueta()} - $${item.precioBase}")
    }
    val iva: Double = 0.19
    val idProducto = leerEntero("Elige una consola por ID: ", 1)
    val cantidad = leerEntero("Ingresa cantidad que deseas: ", 1)

    val producto = catalogoPorId[idProducto]
    if (producto == null){
        println("Consola no encontrada!!!")
        return@runBlocking
    }
    val subtotal = producto.precioFinal(iva)* cantidad
    println("Elegiste ${producto.nombre} (${producto.etiqueta()}) x$cantidad")
    println("Subtotal con IVA y extras: $subtotal")

    println("Calculando descuento...")
    val descuento = calcularDescuentardoAsync(subtotal)
    println("Descuento Listo!!!")
    val total = subtotal - descuento

    if (descuento > 0){
        println("Se aplico el descuentito de ${descuento}!")
    }else{
        println("No aplico aquel descuentito")
    }

    val carro = listOf(producto)
    println("\n--- Carrito ---")

    for (carro in carro){
        println("${carro.nombre} - ${carro.categoria} -$${carro.precioFinal(iva)}")
    }
    println("Total a pagar es de: $total")

    try {
        val promedio = total / cantidad
        println("Precio promedio por unidad es de..: $promedio")
    } catch (e: Exception) {
        println("Error al calcular este promedio ${e.message}")
    }

}