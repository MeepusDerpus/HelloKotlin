fun buildAquarium() {
    val myAquarium = Aquarium();
    myAquarium.printSize();
}

fun main() {
   // buildAquarium();

    val x = 1; // means x is final
    var y = 2; //y can be reassigned
    var z: Int = 3;
    val S: String = "X is $x"; //just like php
    var S1 = "X + Y is ${x + y}";
    println(S + "\n" + S1);

    if (y in 1..100)
    {
        println("Y $y is within 1 and 100");
    }

    //switch statement
    println("Enter a Number:");
    val i: Int = readLine()?.toIntOrNull() ?: 0; //returns 0 if null


    when(i)
    {
        0 -> println("$i is 0 or null");
        in 1..50 -> println("$i is between 1 and 50");
        else -> println("Above 50 or less than 0");
    }
}