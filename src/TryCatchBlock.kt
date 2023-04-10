/*SYNTAX:--
try{
    block of code to monitor for exception
    the code you think can raise an exception
    }
    catch(e1:ExceptionType1){
      exception handler for ExceptionType1
    }
    catch(e2:ExceptionType2){
      exception handler for ExceptionType2
    }
    optional
    finally{
    block of code to be executed after try block ends
    }
 */
fun main(){
    val d= arrayOf(3,4,5,6,7)

    try{
        d[4] = 7
        println("i run and changed the value")
    }catch (e:ArrayIndexOutOfBoundsException){
        println("i run and caught the exception")
    }
        println(d[2])

    println()
    nullvalue()
}


//NULL EXCEPTION
fun nullvalue(){
    var nullValue: String? =null
    println(nullValue?.length)

    val nullList = listOf(1,2,3,null,4,5,null,6)
    val nullArrayList = arrayListOf("this",null,"is","a",null,"element")
    println("the list without the null values is  ${nullList.filterNotNull()}")
    println("the array list without the null values is ${nullArrayList.filterNotNull()}")
}