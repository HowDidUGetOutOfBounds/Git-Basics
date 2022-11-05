fun main() {
    val a = readLine()?.toIntOrNull()
    if(a != null) {
        if (a % 2 == 1) {
            println("Not even")
        } else {
            println("Even")
        }
    }
}