# 🎮 TiendaConsolas-Kotlin

Aplicación de **consola en Kotlin** que simula una tienda de mini consolas. El usuario elige una consola del catálogo, indica la cantidad y el programa calcula el subtotal con IVA, aplica un descuento y muestra el total a pagar.

Proyecto académico de la asignatura **Desarrollo de Aplicaciones Móviles** (Duoc UC), pensado para practicar los fundamentos de Kotlin.

---

## 🧩 Conceptos que se usan

- **Programación orientada a objetos:** clase base `Consola` (`open class`) y dos subclases, `Nintendo` y `PlayStation`, que sobrescriben `precioFinal()` y `etiqueta()`.
- **Colecciones:** `List` para el catálogo y `Map` (`associateBy`) para buscar una consola por su ID.
- **Corrutinas:** `runBlocking` y una función `suspend` con `delay` que simula el cálculo asíncrono del descuento.
- **Manejo de errores:** `try/catch` para el promedio por unidad y para leer números inválidos.
- **Funciones con valores por defecto**, expresiones `when` y organización del código en **paquetes**.

---

## 🛒 Catálogo

| ID | Consola | Marca | Precio base |
|----|---------|-------|-------------|
| 1 | Nintendo Switch Pro | Nintendo | $499.990 |
| 2 | PS4 | PlayStation | $549.990 |
| 3 | Nintendo Switch | Nintendo | $749.990 |

---

## 💰 Reglas de precio

- **IVA:** 19 %.
- **Nintendo:** precio base + IVA + costo del *bundle* (extra fijo por consola).
- **PlayStation:** precio base con la mitad del IVA aplicado.
- **Descuento sobre el subtotal:**
  - Desde **$600.000** → 15 %
  - Desde **$300.000** → 10 %
  - Menos de $300.000 → sin descuento

---

## 📁 Estructura

```
src/
├── Main.kt                      # Flujo principal del programa
├── papito/Consola.kt            # Clase base
├── hijitos/Nintendo.kt          # Subclase Nintendo
├── hijitos/PlayStation.kt       # Subclase PlayStation
├── coleccioness/Catalogo.kt     # Lista y mapa del catálogo
├── descuenton/Descuentardo.kt   # Cálculo del descuento (suspend)
└── utilidad/Implementaa.kt      # Lectura segura de enteros
```

---

## ▶️ Cómo ejecutarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/CatrinaMedina/TiendaConsolas-Kotlin.git
   ```
2. Ábrelo en **IntelliJ IDEA** (necesita el JDK y la librería `kotlinx-coroutines-core`).
3. Ejecuta la función `main` de `Main.kt`.

### Ejemplo de uso

```
TIENDAZA MINI CONSOLAS DEMO
1: Nintendo Switch Pro - Nintendo - $499990.0
2: PS4 - PlayStation (12 meses Plus) - $549990.0
3: Nintendo Switch - Nintendo - $749990.0
Elige una consola por ID: 1
Ingresa cantidad que deseas: 2
...
```

---

## 🛠️ Tecnologías

**Kotlin · Kotlin Coroutines · IntelliJ IDEA**

---

👩‍💻 Desarrollado por **Catrina Medina** · [@CatrinaMedina](https://github.com/CatrinaMedina)
