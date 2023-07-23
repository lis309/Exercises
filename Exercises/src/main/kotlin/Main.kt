//Operators

fun main() {
    /*
    //Calculate the area of triangle
    println("Calculate the area of triangle")

    println("Enter base: ")
    val base:Int = readln().toInt()

    println("Enter height: ")
    val height:Int = readln().toInt()

    val area = (base * height) / 2
    println("The area of the triangle is: $area")

    //Enter two numbers by keyboard and add them
    println("Enter two numbers by keyboard and add them")

    println("Enter number one: ")
    val number1: Int  = readln().toInt()

    println("Enter number two: ")
    val number2:Int = readln().toInt()

    val result = number1 + number2
    println("The sum of the two numbers is: $result")

    //Enter a number and display the number squared
    println("Enter a number and display the number squared")

    println("Enter number: ")
    val number:Int = readln().toInt()

    val square = number * number
    println("The square of number is: $square")

    //Write an algorithm that converts from euros to dollars
    println("Algorithm that converts from euros to dollars")

    println("Enter amount euros: ")
    val euro:Double = readln().toDouble()

    val dollar = euro * 1.12
    println("$euro euros equals $dollar dollars")

    //Write an algorithm that asks for the side of a square and returns the value of the area and the
    //perimeter
    println("Algorithm that asks for the side of a square and returns the value of the area and the\n" +
            "perimeter")

    println("Enter the side of the square: ")
    val side:Int = readln().toInt()

    val perimeter = 4 * side
    val areaSquare = side * side

    println("The perimeter of the square is $perimeter \n The area of the square is $areaSquare")

    //Write an algorithm that determines the area and volume of a cylinder
    println("Algorithm that determines the area and volume of a cylinder")

    println("Enter radio: ")
    val radioCylinder: Int = readln().toInt()
    println("Enter height: ")
    val heightCylinder: Int  = readln().toInt()

    val pi= 3.1416

    val volume = pi * (radioCylinder*radioCylinder) * height

    println("The volume of the cylinder is: $volume")

    val areaCylinder = 2 * pi * radioCylinder*(radioCylinder+heightCylinder)
    println("The area of the cylinder is: $areaCylinder")

    //Write an algorithm that reads the radius of a circle and writes its length and
    //the area (pi*r)^2 of the inscribed circle

    println("Algorithm that reads the radius of a circle and writes its length and\n" +
            "the area")
    val radioCircle: Int = readln().toInt()
    println("Enter radio of the circle: ")

    val lengthCircle = 2 * pi * radioCircle
    val areaCircle =  pi * (radioCircle * radioCircle)

    println("The length of the circle is $lengthCircle \n The area of the circle is $areaCircle")

    //Calculate the average of three (3) numbers entered by keyboard.
    println("Average of three numbers entered by keyboard.")

    println("Enter the number one: ")
    val num1: Int = readln().toInt()
    println("Enter the number two: ")
    val num2: Int = readln().toInt()
    println("Enter the number three: ")
    val num3: Int = readln().toInt()

    val average = (num1+num2+num3) / 3
    println("The average of the three numbers is: $average")

    //Conditionals

    //Write an algorithm to find out if the number entered on the keyboardis positive or negative.
    println("Algorithm to find out if the number entered on the keyboardis positive or negative")

    println("Enter a number: ")
    val num: Int = readln().toInt()

    if (num > 0) {
        println("The number $num is positive")
    }else if (num < 0){
        println("The number $num is negative")
    }

    //Write an algorithm that receives two numbers by keyboard and says which is the largest and
    //which is the minor.

    println("Algorithm that receives two numbers by keyboard and says which is the largest and which is the minor")

    println("Enter a number: ")
    val number_1: Int = readln().toInt()

    println("Enter a number: ")
    val number_2: Int = readln().toInt()

    if (number_1 > number_2) {
        println("The largest number is $number_1 \n The number minor is $number_2")
    }else if (number_1 < number_2){
        println("The largest number is $number_2 \n The number minor is $number_1")
    }

    //Write a program that reads three positive integers and calculates and prints in
    //display the smallest and largest of them.

    println("Program that reads three positive integers and calculates and prints in display the smallest and largest of them.")

    var digit1 = 0
    var digit2 = 0
    var digit3 = 0
    println("Enter the number one: ")
    var variable = readln().toInt()

    if(variable > 0){
        digit1 = variable
    }

    println("Enter the number two: ")
    variable = readln().toInt()

    if(variable > 0) {
        digit2 = variable
    }

    println("Enter the number three: ")
    variable = readln().toInt()

    if(variable > 0){
        digit3 = variable
    }

    if((digit1 > digit2) && (digit2 > digit3)){
        println("The largest number is $digit1 \n The number minor is $digit3")
    }

    else if((digit1 > digit3) && (digit3 > digit2)){
        println("The largest number is $digit1 \n The number minor is $digit2")
    }

    else if((digit2 > digit1) && (digit1 > digit3)){
        println("The largest number is $digit2 \n The number minor is $digit3")
    }

    else if((digit2 > digit3) && (digit3 > digit1)){
        println("The largest number is $digit2 \n The number minor is $digit1")
    }

    else if((digit3 > digit1) && (digit1 > digit2)){
        println("The largest number is $digit3 \n The number minor is $digit2")
    }

    else{
        println("The largest number is $digit3 \n The number minor is $digit1")
    }

    //Given two numbers A and B, add them if A is less than B or else subtract them

    println("Given two numbers A and B, add them if A is less than B or else subtract them")

    println("Enter the number a: ")
    val a: Int = readln().toInt()

    println("Enter the number b: ")
    val b: Int = readln().toInt()

    if(a < b){
        val sum = a + b
        println("a + b = $sum")
    }else{
        val subtraction = a - b
        println("a - b = $subtraction")
    }

    //Given two numbers A and B, find the quotient between A and B. Remember that division by zero
    //is not defined, in this case a legend should appear announcing that the division is not
    //possible.


    println("Enter the number c: ")
    val c: Int = readln().toInt()

    println("Enter the number d: ")
    val d: Int = readln().toInt()

    if(c == 0 || d == 0){
        println("Division by zero is not allowed")
    }else{
        val division = c / d
        println("c / d = $division")
    }

    //Given two numbers A and B, add them if at least one of them is negative, otherwise
    //multiply them.

    println("Enter the number f: ")
    val f: Int = readln().toInt()

    println("Enter the number g: ")
    val g: Int = readln().toInt()

    if(f < 0 || g < 0){
        val sum1 = f + g
        println("f + g = $sum1")
    }else{
        val multiplication = f * g
        println("f x g = $multiplication")
    }

    //Write an algorithm that determines if a year is a leap year or not.

    println("Is the year leap year or not?")

    println("Enter a year: ")
    val year: Int = readln().toInt()

    if(year % 4 == 0){
        if(year % 100 == 0){
            if(year % 400 == 0){
                println("The year $year is a leap-year")
            }
        }else{
            println("The year $year is a leap-year")
        }
    }else{
        println("The year $year is not a leap year")
    }

    //Cycles

    //Print all the multiples of 3 that are between 1 and 100

    println("Multiples of 3")

    for (i in 1..100){
        if(i % 3 == 0){
            println("$i is a multiple of 3")
        }
    }

    //Print odd numbers between 0 and 100.

    println("Odd numbers")

    for (i in 1..100) {
        if(i % 2 == 1){
            println("$i is an odd number")
        }
    }

    //Print the even numbers from 1 to 100.

    println("Even numbers")

    for (i in 1..100) {
        if(i % 2 == 0){
            println("$i is an even number")
        }
    }

    //Write a program that prints on the screen the squares
    //of the numbers from 1 to 30.
    println("Square numbers")

    for (i in 1..30) {
        val square = i * i
        println("$i ^ 2 = $square")
    }

    //Write a program that adds the squares of the first hundred natural numbers,
    //displaying the result on the screen.

    println("Sum of square numbers")

    var sum = 0

    for (i in 1..100) {
        sum += (i * i)
    }

    println("The sum of the squares of the first 100 natural numbers is $sum")

    //Given two natural numbers, the first less than the second, generate and display all
    //numbers between them in ascending sequence

    println("Numbers included")

    var h = 0
    var i = 0
    println("Enter a number: ")
    h = readln().toInt()


    while(h >= i && i == 0){
        println("Enter a number: ")
        i = readln().toInt()
    }

    while(i <= h){
        println("$i")
        i += 1
    }*/

    //Add all the numbers that are typed on the keyboard as long as it is not zero.

    println("Sum of numbers")

    var sum2 = 0
    var num_1 = 0
    var cont = 1
    println("Enter the number of numbers you want to enter: ")
    val num_2: Int = readln().toInt()

    while(cont <= num_2){
        println("Enter a number: ")
        num_1 = readln().toInt()
        sum2 += num_1
        cont++
    }

    println("The sum of all the numbers you entered is $sum2")

}







