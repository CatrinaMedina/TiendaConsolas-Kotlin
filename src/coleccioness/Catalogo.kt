package coleccioness

import hijitos.Nintendo
import hijitos.PlayStation
import papito.Consola

val catalogo: List<Consola> = listOf(
    Nintendo(1, "Nintendo Switch Pro", 499990.0, "Nintendo", 19990.0),
    PlayStation(2, "PS4", 549990.0, "PlayStation", 12),
    Nintendo(3, "Nintendo Switch", 749990.0, "Nintendo", 9990.0)
)
val catalogoPorId: Map<Int, Consola> = catalogo.associateBy { it.id }

