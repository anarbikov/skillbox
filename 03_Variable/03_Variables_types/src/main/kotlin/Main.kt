fun main(args: Array<String>) {
    val firstName:String = "Anvyar"
    val lastName:String = "Narbikov"
    var height:Double = 1.72
    val weight:Float = 75f
    var isChild:Boolean = height<1.50 || weight<40

    var info:String = "first name: $firstName\nlast name: $lastName\nheight: $height\nweight: $weight\nchild or not: $isChild"
    println(info)
    height=1.40
    isChild = height<1.50 || weight<40
    info = "first name: $firstName\nlast name: $lastName\nheight: $height\nweight: $weight\nchild or not: $isChild"
    print(info)

}