fun main() {
    doTask1()
}

fun doTask1(){
    val a = readLine()?.toIntOrNull()
    if(a != null) {
        if (a % 2 == 1) {
            println("Not even")
        } else {
            println("Even")
        }
    }
}