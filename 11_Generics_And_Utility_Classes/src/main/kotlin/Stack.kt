open class Stack <T> {
    internal val stack = mutableListOf<T>()

    internal fun push(item:T) = stack.add(item)
    internal fun pop ():T? {
        return if (isEmpty()) null
        else stack.removeLast()
    }
    internal fun isEmpty ():Boolean {
        return stack.isEmpty()
    }












}