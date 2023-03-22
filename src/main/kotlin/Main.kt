
fun main(){
    oddNumbers(100)
    serveDrinks(14)
    serveDrinks(5)
    serveDrinks(30)
   val count= checkLength(arrayOf("Angela","Joan","Wanjiru"))
    println(count)
    printsNum(99)
}
fun oddNumbers(nums:Int){
    for (num in 1..100)
        if (num%2!=0) {
            println(num)
        }
}

fun checkLength(names:Array<String>):Int{
    var add=0
    for (name in names) {
        if (name.length > 5){
        add++
        }
    }
    return add
}

fun serveDrinks(age:Int){
    when(age) {
        in 0..6 -> println("milk")
        in 7..14 -> println("Fanta-Orange")
        else -> println("Coca-cola")

    }
    }

fun printsNum(multiple:Int) {
    for (mul in 1..100) {
        when {
            mul % 3 == 0 && mul % 5 ==0 -> println("Fizz-Buzz")
            mul % 3 == 0 -> println("Fizz")
            mul % 5 == 0 -> println("Buzz")
        }
    }
}