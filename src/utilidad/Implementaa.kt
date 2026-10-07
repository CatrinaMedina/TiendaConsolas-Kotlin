package utilidad

fun leerEntero(prompt: String, defecto: Int = 0): Int{
    print(prompt)
    val entradita = readln()
    return try{ entradita.toInt()}
    catch (e: NumberFormatException){
        println("Numero invalido, se usuara $defecto")
        defecto
    }
}