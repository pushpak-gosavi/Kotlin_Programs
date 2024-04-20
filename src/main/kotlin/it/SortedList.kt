package it

import java.util.*

fun main(){
    val a:Int by lazy{
        50
    }
    println(a.inc()) // increment the val of a +1 and output is 51
    println(a+1)// increment the val a+1 and output is 52

    val listofPerson = listOf<PersonList>(
        PersonList(firstName = "Jhon", lastName = "Smith"),
        PersonList(firstName = "Jams", lastName = "Fedry"),
        PersonList(firstName = "daven", lastName = "Vera"),
        PersonList(firstName = "aman", lastName = "Gupta"),
        PersonList(firstName = "Aaan", lastName = "Gosavi"))

    val newSortedName = listofPerson.sortedBy {
        it.firstName.lowercase()
    }
    println(listofPerson)
    println(newSortedName)
}

data class PersonList(val firstName:String, val lastName:String)