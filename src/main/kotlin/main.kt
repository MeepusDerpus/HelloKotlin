fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}

fun main() {
    buildAquarium()

    val x = 1 // means x is final
    var y = 2 //y can be reassigned
    var z: Int = 3
    val S: String = "X is $x" //just like php
    var S1 = "X + Y is ${x + y}"
    println(S + "\n" + S1)

    if (y in 1..100)
    {
        println("Y $y is within 1 and 100")
    }

    //switch statement
    print("Enter a Number:\n")
    val i: Int = readLine()?.toInt() ?: 0 //returns 0 if null
    //val i = readLine()!!.toInt();
    println(i)

    when(i)
    {
        0 -> println("$i is 0 or null")
        in 1..50 -> println("$i is between 1 and 50")
        else -> println("$i is Above 50 or less than 0")
    }
    //Kotlin Arrays are fixed size
    val school1 = arrayOf("shark", "salmon", "minnow")
    var school2 = arrayOf("shark", "salmon", "minnow")
    val school3 = listOf("shark", "salmon", "minnow")
    val school4 = mutableListOf("shark", "salmon", "minnow")

    for (element in school1)
    {
        println(element)
    }
    for (i in 3..8 step 2) print(i)

}
