package com.fatihcetiner.kotlinadvancedfunctions

fun main() {

    val myNumList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val allCheck = myNumList.all { it > 5 }
    println(allCheck)

    val anyCheck = myNumList.any { it > 5 }
    println(anyCheck)

    val totalCount = myNumList.count { it > 5 }
    println(totalCount)

    val findNum = myNumList.find { it > 5 }
    println(findNum)

    val findLastNum = myNumList.findLast { it > 5 }
    println(findLastNum)

    // Predicate

    val myPredicate = { num: Int -> num > 5 }
    val allCheckWithPredicate = myNumList.all(myPredicate)
    println(allCheckWithPredicate)


}