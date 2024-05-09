package org.example
fun main() {
    for4()
}
fun karlik (joker: Int, medniy_bik: Int) {
    val vent: Int = joker + medniy_bik
    println (vent) //процедура (в неё значения вкидываются и она сама всё высчитывает и выводит)
}
fun kirill (gay: Int, ksgo: Int):Int{
    val gameplay = gay * ksgo
    val global = gameplay / gay
    return global //фунцкия (в неё значения вкидываются, а результаты возвращаются в main)
}
fun kalgovna (num11: Int, num22: Int, znak: Char): Float {
    val num1: Float = num11.toFloat()
    val num2: Float = num22.toFloat()
    when (znak){
        '+' -> return num1 + num2
        '-' -> return num1 - num2
        '*' -> return num1 * num2
        '/' -> return num1 / num2
        else -> return 0.0f
    }
}
fun kal(){
    val jokerok: Array <String> = arrayOf("американскй психпат", "Sigma")
    val pashalko: ArrayList <Int> = arrayListOf()
    pashalko.add(1488)
    val ventilator: MutableList <Any?> = mutableListOf()
    ventilator.add("卐卐卐")
    ventilator.add("medniy_bik")
    ventilator.add(true)
    ventilator.add(1488)
    val kniga_pashalkov: Map <String, Int> = mapOf("medniy_bik" to 1488, "roma" to 228)

}
fun plastika_penisa(){
    var maksim_penis: Int = 2
    while (maksim_penis != 201){
        maksim_penis++
        println(maksim_penis)
    }
}
fun naduvali(){
    var count_pashalok: Int = 0
    do {
        count_pashalok++
        println(count_pashalok)
    }while (
        count_pashalok != 1488
    )
}
fun fork(){
    val karlik: Array <String> = arrayOf("ksgo", "fortnight", "SVO")
    for (a in karlik){
        if (a == "SVO")
            println ("minion")
    }
}
fun for4(){
    val seven_days_without_anime: List <String> = listOf("medniy bik", "ventilator", "pnevma")
    val pashalko: ArrayList <String> = arrayListOf()
    seven_days_without_anime.forEach{
        if (it == "medniy bik" || it == "ventilator")
            pashalko.add (it)
    }
    println (seven_days_without_anime)
    println (pashalko)
}
