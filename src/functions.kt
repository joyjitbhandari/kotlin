/*
function with arguments
syntax:-
    fun functionName(ard1:Type1,
    arg2:Type2...):ReturnType{
    lines of code
    return result
    }
 */
//EXAMPLE:--
fun main(){
    newFunction()//Initializing the calling function.
    addition(10,20)// this is argument passing function.
    println(multiplication(20))//Here we can print the return value directly.
    println(division(20,2))
}

//This function has no argument passing and no return values is returned.
fun newFunction() {
    println("I am a new function")
}

//In this function a b argument us passing.
fun addition(a:Int,b:Int) {
    println(a+b)
}

fun multiplication(a:Int):Int {
    return a * 2
}

//This division function in inline in nice shortly manner.
fun division(a:Int,b:Int) = a/b
