import java.util.Scanner

//Program to check entered year is leap year or not.
fun main()
{
    var sc = Scanner(System.`in`)
    print("Enter a year:")
    var year =sc.nextInt()
    if (year % 4 == 0 || year % 400 == 0)
        println("$year is leap year")
    else
        println("$year is not leap year")

}