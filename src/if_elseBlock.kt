/*Syntax:--
    if(condition){
    some operation
    }
    else{
    some operation
    }
 */
fun main(){
    val a = 10
    val b = 0

    if (b==0){
        println("Division is not possible")
    }
    else{
        println(a/b)
    }

    compare()

    maxValue()

    nestedIfElse()
}

fun compare(){
    val a =10
    val b = 11

    if (a>b){
        println("a is greater than b")
    }
    else{
        println("b is greater")
    }
}

fun maxValue(){
    val a = 10
    val b =11

    val maxvalue: Int = if(a>b){ a }else{ b }
    println(maxvalue)
}

/*NESTED if/if-else LADDER
syntax:--
    if(Condition){
    operation
    }else if(New Condition){
    operation
    }else{
    operation
    }
 */
//EXAMPLE:--

fun nestedIfElse(){
    val a =10
    val b = 20
    val c = 30

    val maxvalue : Int = if(a>b && a>c){
        a
    }else if(b>a && b>c){
        b
    }else{
        c
    }
    println("$maxvalue is greater")
}

