package descuenton

import kotlinx.coroutines.delay

suspend fun calcularDescuentardoAsync(total: Double): Double{
    delay(300)
    return when{
        total >= 600000 -> total * 0.15
        total >= 300000 -> total * 0.10
        else -> 0.0
    }
}