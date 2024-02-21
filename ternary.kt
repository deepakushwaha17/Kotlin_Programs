//Program to find greatest among two number using ifternary.
/* Kotlin does not support ternary operator ? : ;
to use ternary in kotlin we have to write in this way "if(condition)<true stmnt> else <false stmnt>" */
fun main()
{
    var n1 = 35
    var n2 = 47
    var c = if(n1>n2) n1 else n2
    println("Greatest number among $n1 and $n2 is $c")

}