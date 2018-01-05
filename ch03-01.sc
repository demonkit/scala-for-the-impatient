import scala.util.Random

def gen(n: Int): Array[Int] = {
    val r = new Random()
    val a = new Array[Int](n)
    for (i <- a.indices) {
        a(i) = r.nextInt(n)
    }
    return a
}

val a = gen(10)
