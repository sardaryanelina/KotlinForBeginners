fun main() {
    println(a(3, 8))
    println(highOrderFun(3, summa(5, 6), ::summa))
    println(highOrderFun(3, 4, ::multiply))
    println(funcReturn(3)(15, 15))

    // Companion object
    val a = A()
    println(A.someName())
    println(A.someName())
    println(A.someName())
    println(A.someName())
    println(a.abc())

    // Singleton
    val b = B
    println(b.bb())

    val c = B
    println(c.bb())
}

val a = { x: Int, y: Int -> x + y }

fun summa(x: Int, y: Int) = x + y
fun multiply(x: Int, y: Int) = x * y

fun highOrderFun(x: Int, y: Int, func: (Int, Int) -> Int) = func(x, y)
fun highOrderFun2(x: Int, y: Int, func: (par1: Int, par2: Int) -> Int) =
    func(x, y) // same as the one above with different syntax

val listOfFunctions = listOf<(Int, Int) -> Int>(::summa, ::multiply)

fun funcReturn(num: Int): (Int, Int) -> Int = if (num > 5) listOfFunctions[0] else listOfFunctions[1]






