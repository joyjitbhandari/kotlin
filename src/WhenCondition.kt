/*When condition :--
SYNTAX:--
when(condition){
case1->operation1
case2->operation2
case3->operation3
.
.
and so on ..
else -> if all above are not satisfied this is executed
}
 */
//EXAMPLE:--
fun main(){
    val num = 2

    when(num){
        0-> println("zero")
        1-> println("one")
        2-> println("two")
        3-> println("three")
        4-> println("four")
        5-> println("five")
        else -> println("None of above")
    }

    anotherExample()
}

fun anotherExample(){
    val num = 0
    when{
        num>0 -> println("positive")
        num<0 -> println("negative")
        else -> println("Zero")
    }
}

