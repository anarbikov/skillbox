open class Stack <T> {
    val stack = mutableListOf<T>()

    fun push(item:T) = stack.add(item)
    fun pop ():T? {
        return if (isEmpty()) null
        else stack.removeLast()
    }
    fun isEmpty ():Boolean {
        return stack.isEmpty()
    }












}