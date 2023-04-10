import java.awt.font.LineBreakMeasurer
fun main(){
    /* The Operators are
    Arithmetic Operator(+,-,*,/,%)
    Comparison Operator(==,!=,<,>,<=,>=)
    Assignment Operator(=,+=,-=,*=,/=,%=)
    Increment & Decrement Operator(++,--)
     */
    ArithmethicOperator()
    ComparisionOperator()
    AssignmentOperator()
    IncrementDecrementOperator()

}
fun ArithmethicOperator(){
    val number1 = 12.6
    val number2 = 3.5
    var result: Double

    result = number1+number2
    println(result)

    result = number1-number2
    println(result)

    result = number1*number2
    println(result)

    result = number1/number2
    println(result)

    result = number1%number2
    println(result)
}

fun ComparisionOperator(){
    val a=12.5
    val b=2.5
    var result: Boolean

    result= a==b
    println(result)

    result = a!=b
    println(result)

    result = a>b
    println(result)

    result = a<b
    println(result)

    result = a>=b
    println(result)

    result = a<=b
    println(result)

}

fun AssignmentOperator(){
    var number1= 12.5
    val number2 =2.5

    number1 += number2
    println(number1)

    var number3 = 12.5
    number3 -= number2
    println(number3)

    var number4 = 23.5
    number4 *= number2
    println(number4)

    var number5 = 12.0
    number5 /= number2
    println(number5)

    var number6 = 11.5
    number6 %= number2
    println(number6)
}

fun IncrementDecrementOperator(){
    var number1 = 10
    var number2 = 5

    number1++
    println(number1)

    number2--
    println(number2)
}