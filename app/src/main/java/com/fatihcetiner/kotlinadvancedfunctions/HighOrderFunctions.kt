package com.fatihcetiner.kotlinadvancedfunctions

fun main() {

    val myNumList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Filter

    /*
    val smallNumberList = myNumList.filter { num -> num < 6 }

    for(num in smallNumberList){
        println(num)
    }

     */

    val smallNumberList = myNumList.filter { it < 6 }

    for (num in smallNumberList) {
        println(num)
    }

    // Map

    /*
    val mySquaredList = myNumList.map { num -> num * num }
    for (num in mySquaredList){
        println(num)
    }

     */

    val mySquaredList = myNumList.map { it * it }
    for (num in mySquaredList) {
        println(num)
    }

    // Map And Filter

    val filterAndMapCombined = myNumList.filter { it < 6 }.map { it * it }
    for (num in filterAndMapCombined) {
        println(num)
    }

    // **********************

    val musicians = listOf<Musician>(
        Musician("James", 60, "Guitar"),
        Musician("Lars", 55, "Drum"),
        Musician("Kirk", 50, "Guitar")
    )

    val musicianInstrument = musicians.filter { it.age < 60 }.map { it.instrument }
    for (instrument in musicianInstrument) {
        println(instrument)
    }

}


data class Musician(
    val name: String,
    val age: Int,
    val instrument: String
)