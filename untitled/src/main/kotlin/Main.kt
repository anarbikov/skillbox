fun main(args: Array<String>) {
    var a = mutableListOf<String>("1","2","3","4","5","6","7")
        a.removeAt(3)
    println(a)
    var b = mutableListOf<String>()
    b.addAll(a)
    b.removeAt(a.indexOf("9"))
    println(b)

    for(i in a){
        a.removeAt(a.binarySearch { i })

    }
    println(a)

}