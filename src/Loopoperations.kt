/*Here is three types of loops
        1= For loop
        2= While loop
        3= Do-while loop
 */
fun main(){
    val a = arrayOf('a','b','c','d')

    for (element in a) println("$element")
    println()
    incrementBy2()
    println()
    reverseOrder()
}

//Q1. printing odd numbers.
fun incrementBy2(){
    //using for loop
    for (i in 1..10 step 2){
        println(i)
    }
    println()
    //using while loop
    var i = 1
    while (i<= 10) {
        println(i)
        i += 2
    }

    println()
    //using do_while loop
    var k = 1
    do{
        println(k)
        k+=2
    }while (k<=10)
}


//Q2. print 10 numbers in reverse manner like 10 to 1.
fun reverseOrder(){
    //using for loop
    for (i in 10 downTo 1) println(i)

    println()
    //using while loop
    var i =10
    while (i>0){
        println(i)
        i--
    }

    println()
    //using do_while loop
    var k =10
    do{
        println(k)
        k--
    }while (k>0)


}