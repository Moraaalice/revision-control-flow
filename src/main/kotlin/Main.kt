fun main(){
    ages(15)
    ages(21)
    ages(78)
    //
    numbers(10)
    //
    digits(10)
    digits(5)
    //
    password("password123")
    password("password12345")
    //
    days("Monday")
    days("Tuesday")
    days("Friday")

}
fun ages(age:Int){
    if (age in  0..17){
        println("you are not old enough to vote")
    }
    else if (age in 18..65){
        println("you are legible to vote")
    }
    else
        println("you are senior citizen")
}
fun numbers(number:Int){
    for (num in 1..10){
        println(num)
    }
}
fun digits(digit:Int){
    if (digit %2==0){
        println("even")
    }
    else
        println("odd")
}
fun password(password1:String){
    val password2 = password1
    if (password1==password2){
        println("Access granted")

    }
    else
        println("Access denied")
}
fun days(day:String){
    when(day){
        "Monday"-> println("Monday blues")
        "Friday"-> println("TGIG!")
        else-> println("just any other day")
    }
}