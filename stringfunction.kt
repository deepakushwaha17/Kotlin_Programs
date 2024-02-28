//Program to use the different string functions.
fun main()
{
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    //toUpperCase function
    println(txt1.toUpperCase())
    //toLowecase function
    println(txt1.toLowerCase())
    //toCompare function
    println(txt1.compareTo(txt2))
    //toindexOf function
    println(txt1.indexOf("World"))
    //Concatenation function
    println(txt1+" "+txt2)
    println(txt1.plus(txt2))
    println("$txt1 $txt2")

}