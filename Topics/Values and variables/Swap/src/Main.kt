fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val c = a
    a = b // Write only exchange actions here. Do not touch the lines above
    b = c

    // Do not touch the lines below
    print("$a $b")
}
