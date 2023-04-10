fun main(){
    val s = "Welcome To Internshala"// here declared a string

    println(s)


    val stringLength = s.length // here finding the string length
    println(stringLength)// here printing the string length

    val stringIndex = s.get(12)// here finding particular string index
    println("The character at index is:")
    println(stringIndex)

    //String templates
    val i =10
    println("the i value is $i")//string templates define by ($) symbol

    //the subSequence() is use for print given range index means print substring.
    println(s.subSequence(0,7))
    

}