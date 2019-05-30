
fun bar(b: ()-> Unit) { b() }

class C() {
    public var f: Int

    init {
        var i = 10
        bar {
            i = 20
        }
        f = i + 1
    }
}

fun box(): String {
    val c = C()
    if (c.f != 21) return "fail"
    return "OK"
}
