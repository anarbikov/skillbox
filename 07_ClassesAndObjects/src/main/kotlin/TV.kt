import kotlin.random.Random
import kotlin.time.measureTimedValue

class TV (val brand:String, val model:String, val screenSize:Int,) {
    var onOff: Boolean = false
        private set

    val channelsNumber:Int = Random.nextInt(1,20)
    private val channelList = Channels.getRandomChannels(channelsNumber)

    fun turningOnOff() {
        onOff = !onOff
        if (onOff) println("Телевизор включен") else println ("Телевизор выключен")
        }

    var volume:Int = 0

    fun upVolume () {
        if (!onOff) {
            println("(Ничего не происходит...)")
            return
        }
        if (volume + 1 <= maxVolume) {
            volume += 1
            println("Громкость: $volume")
            }
        else {
            println("Громкость на максимуме: $maxVolume")
            volume = maxVolume
        }
        return
    }

    fun downVolume () {
        if (!onOff){
            println("(Ничего не происходит...)")
            return
        }
        if (volume-1< minVolume) {
            println("Громкость на минимуме: $minVolume")
            volume = 0
        }
        else {
            volume -= 1
            println ("Громкость: $volume")
        }
        return
    }

    var currentChannel = channelList[1]
    private set

    fun switchChannelByNumber (number:Int) = if (number in 1..channelsNumber) {
        turningOnOff()
        currentChannel = channelList[number]
        println ("Вы смотрите $currentChannel")
    }
    else {
        print("На вашем пульте всего $channelsNumber кнопок - выберите в этом диапазоне")
    }

    fun channelUp () {
        if (!onOff) {
            onOff = true
            println("Телевизор включен")
            println(currentChannel)
            return
        }
        if (channelList.entries.find { it.value == currentChannel }?.key in (1 until channelsNumber-1)) {
            currentChannel = channelList[(channelList.entries.find { it.value == currentChannel }?.key?.toInt())?.plus(1)]
            println(currentChannel)
        }
        else if (channelList.entries.find { it.value == currentChannel }?.key ==channelsNumber) {
            currentChannel = channelList[1]
            println(currentChannel)
        }
    }

    fun channelDown () {
        if (!onOff) {
            onOff = true
            println("Телевизор включен")
            println(currentChannel)
            return
        }
        if (channelList.entries.find { it.value == currentChannel }?.key in (2..channelsNumber)) {
            currentChannel = channelList[(channelList.entries.find { it.value == currentChannel }?.key?.toInt())?.minus(1)]
            println(currentChannel)
        }
        else if (channelList.entries.find { it.value == currentChannel }?.key ==1) {
            currentChannel = channelList[channelsNumber]
            println(currentChannel)
        }
    }

    fun channelList() {
        for (i in channelList.entries) {
            println("${i.key} - ${i.value}")
        }
    }






    companion object {
        const val maxVolume:Int = 10
        const val minVolume:Int = 0
    }
}