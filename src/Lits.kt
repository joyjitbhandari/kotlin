/* List are 3 types
  1. immutable list = (immutable lists have a fixed size and fixed values.
                       this can not change latter.
           SYNTAX:- var/val listName = listof<data_type>(list_of_items))
  2. mutable list = (Element can be added as well as altered  in mutable lists
                     mutable lists are define using the mutableListOf() keyword
            SYNTAX:- var/val listName = mutableListOf<data_type>(list_of_items))
   3. array list = (array list is ame as mutable list.
                     it can be define by arrayListOf() keyword.
            SYNTAX:- var/val listName = arrayListOf<dat_type>(list_of_items))
*/
//EXAMPLE:--
fun main(){
    //immutable list
    val listOfStrings = listOf("Box","Table","chair")
    println(listOfStrings)
    // fetch the data of list
    println(listOfStrings[1])

    println()
    //mutable list
    val listOfString2 = mutableListOf("Bed","chair","stool")
    println(listOfString2)
    listOfString2[1] = "Book"//here changing the value of element bed to book
    println(listOfString2)
    listOfString2.add("TV")//adding list element
    println(listOfString2)
    listOfString2.add(2,"Air cooler")//adding list element in index number 2
    println(listOfString2)
    listOfString2.removeAt(1)//removing list item which present in index 1
    println(listOfString2)

    //adding complete array in list
    val arr = arrayOf("Fan","Light","Mattress")
    listOfString2.addAll(arr)
    println(listOfString2)


    println()
    //array list
    val arrayList = arrayListOf("ram","sam","Joy")
    println(arrayList)
}