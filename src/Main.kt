fun main() {
    var num1 = 50
    var num2 = 30
    var sum = num1 + num2
    println(sum)

    var num3 = 34
    var num4 = 234
    var remainder = num3 % num4
    println(remainder)

    var a = 4
    var b = 5
    a = a - b
    println(a)

    var d = 58
    var e = 6
    var product = d * e
    println(product)

    var g = 78
    var h = 56
    var division = g / h
    println(division)

    addition(78,34)
    sentence("Kibaki was the second president of Kenya")
    word("hello")
    extractString("leaders")

    sum(45,56)
    power(9,3)
}

//write a function that takes two intergers as a parameter and returns the sum
fun addition(num5:Int,num9:Int):Int{
    var addition=num5+num9
    return addition
}
//Write a Kotlin function that changes the value of Kibaki to ruto in this sentence
//“Kibaki was the second president of Kenya”
fun sentence(word:String):String{
    return word.replace("Kibaki","Ruto")
}
  //Write a function that takes in a String and returns its length
fun word(text:String):Int {
      return text.length
  }
//Create a Kotlin function that extracts a substring from a given string starting from index 2 to index 5 using the slice function and returns it.
fun extractString(name:String){
    var slice=name.slice(2..5)
    println(slice)



reverseString("leaders")
inputString("racecar")
vowels("principal")



var text = "my name is Adal"
println(text.length)
println(text.toUpperCase())
println(text.toLowerCase())

var txt1= "i love kotlin"
var txt2= "i love kotlin"
println(txt1.compareTo(txt2))

var txt = "please clean your class"
println(txt.indexOf("your"))






}
fun reverseString(word:String){
    var newWord= word.reversed()
    println(newWord)
}
fun inputString(word:String){
    val newInputString=word.reversed()
    if(word==word.reversed()){
        println("palidrome string.")
    }
    else{
        println("Not a palidrome string.")
    }
}
fun vowels(word:String){
    var number = 0
    var vowels = listOf<Char>('a','e','i','o','u')
    for(x in word){
        if(x in vowels) {
            number++
        }
    }
    println(number)
}
fun cities (cities:Array<String>) {
    cities.forEach { city ->
        println(city.capitalize())
    }
}
//Write a Kotlin function named sum that takes two integers as parameters and returns their sum. Print the result.
    fun sum(num3:Int,num4:Int):Int{
        var sum=num3 +num4
        return sum
    }
fun names(name1:String,name2:String,name3:String,name4:String){
    var nameArray = arrayOf(name1,name2,name3,name4)
    println(nameArray.contentToString())}

//Write a Kotlin function named power that takes two parameters, base and exponent, and returns the result of raising
// the base to the power of the exponent. Print the result.
fun power(base:Int,exponent:Int){
    var result=base*exponent
    println(result)
}










