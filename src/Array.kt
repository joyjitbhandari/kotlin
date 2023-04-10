import java.lang.ProcessBuilder.Redirect.to
import java.util.*

/*
Array syntax:--
var nameOfArray = arrayOf<type>(elements)
val nameOfArray = arrayOf<type>(elements)
 */
//EXAMPLE:-
fun main(){
    // var array elements we can change or replace latter.
    var characterArray = arrayOf('i','n','t','e','r')

    //val array elements cant modify latter.
    val charArray = arrayOf('a','b','c','d')

    val i=1

    val otherArray = arrayOf('l','m','n','o','p')
    characterArray = otherArray //here we replace the character array elements with otherArray elements.

   // Declaring array data types
    val newArray = arrayOf("hello",'h',12,12.4,true)


    //Array functions like index, size etc
    val stringArray = arrayOf("Hello","Kotlin","Programs")
    //stringArray: Hello  kotlin  Programs
    //index:        0       1        3

    println(stringArray.get(0))// get() function is use for find array elements using index number.
    // the other method to fetch array element using index is
    println(stringArray[1])
    println(stringArray[2])

    //  changing the array elements using index.
    stringArray[1]="My new String"
    println(stringArray[1])

    //finding the array size
    println(stringArray.size)

    //printing all array elements at once.
    println(stringArray.contentToString()) // contentToString is converting array elements to string.

}