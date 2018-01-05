val a = Array(1,2,3,4,5)
for (i <- a.indices by 2) {
    if (i+1 < a.length) {
        val t = a(i+1)
        a(i+1) = a(i)
        a(i) = t
    }
}
a.map(println(_))
