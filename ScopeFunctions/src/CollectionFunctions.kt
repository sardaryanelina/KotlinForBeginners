import javax.lang.model.type.NullType

fun main() {
    val listOfStrings = arrayListOf("Gevorg", "John", "Armen", "Vera", "Arman")
    val listOfDifferentTypes = arrayListOf(12, "Gevorg", true, "Vera", null)
    val newListOfStrings = listOfStrings.filter {
        it.startsWith("G")
    }

    val newListOfStrings2 = listOfStrings.filterIndexed { index, s -> index > 2 && s.contains("A") }
    println(newListOfStrings)
    println(newListOfStrings2)

    val newListOfStrings3 = listOfStrings.filterNot {
        it.startsWith("G")
    }
    println(newListOfStrings3)

    val newListOfDifTypes = listOfDifferentTypes.filterIsInstance<String>()
    println(newListOfDifTypes)

}