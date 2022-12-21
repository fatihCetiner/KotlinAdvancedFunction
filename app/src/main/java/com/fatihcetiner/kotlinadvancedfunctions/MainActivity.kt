package com.fatihcetiner.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var myInt: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (myInt != null) {
            val num = myInt!! + 1
        }

        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            it + 1
        } ?: 0


        // also -> şu da
        val fatih = Person("Fatih",23)
        val ergün = Person("Ergün",53)
        val gülay = Person("Gülay",49)

        val people = listOf<Person>(fatih,ergün,gülay)

        people.filter { it.age > 18 }.also {
            for (person in it){
                println(person.name)
            }
        }

        // apply
        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")

        val intentWithApply = Intent().apply {
            putExtra("","")
            putExtra("","")
        }

        // With
        Person("barley",4).apply {
            name = "Barley"
        }.also {
            println(it.name)
        }

        val newBarley = Person("bar",4).apply {
            name = "Barley"
        }
        println(newBarley.name)


        val anotherBarley = with(Person("arley",4)){
            name = "Barley"
        }
        println(anotherBarley)

        // ***************

        val withBarley = Person("arley",4)
         with(withBarley){
             name = "Barley"
             age = 5
         }

        println(withBarley.name)

    }
}

data class Person(
    var name: String,
    var age: Int
)