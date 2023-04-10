fun main() {
    //var variables are mutable , that is the data stored in them can change.
    var wholenumber = 17
    var fractionalNumber = 2.5
    var sentence = "a new sentence"//we assign a string using double coat(")
    var condition = false
    var character = 's'//we assign a character using single coat(')
    var floatingNumber = 34.5f // floating numbers are assign using small (f)


    //val variables ae immutable, that is the data stored in them cannot change.
    val number = 2344
    val decimal = 4.6
    val name = "Internshala"
    val conditions = true
    val char = 'I'
    val floatNumber = 56.30f
    //here we can change the variable values
    //and remember we cant change the value type.
    wholenumber = wholenumber + 40
    sentence = "another sentence"

    //output of var variables
    println(wholenumber)
    println(fractionalNumber)
    println(sentence)
    println(condition)
    println(character)
    println(floatingNumber)

    //output of val variables
    println(number)
    println(decimal)
    println(name)
    println(conditions)
    println(char)
    println(floatNumber)

/* There is another method to declare a variable datatype
var identifier:Datatype = initialisation
val identifier:Datatype = initialisation
 */
var a: Int =5
val b: Double=5.4

}