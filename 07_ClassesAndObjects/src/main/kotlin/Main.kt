import kotlin.random.Random

fun main(args: Array<String>) {
    val goodTv = TV (brand = "Philips", model = "A1", screenSize = 32)
    println("Бренд: ${goodTv.brand}, Модель: ${goodTv.model}, Диагональ экрана: ${goodTv.screenSize}, " +
            "Количество каналов: ${goodTv.channelsNumber}, Константы громкости для всех экземпляров " +
            "мин: ${TV.minVolume}, макс: ${TV.maxVolume}, Список каналов:")
    Thread.sleep(3000)
    goodTv.channelList()
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    println("Значение поля вкл/выкл: ${goodTv.onOff}")
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    println("Значение поля вкл/выкл: ${goodTv.onOff}")
    Thread.sleep(3000)
    println("Переключаем канал на ${goodTv.channelsNumber} при выключенном телевизоре:")
    Thread.sleep(3000)
    goodTv.switchChannelByNumber(goodTv.channelsNumber)
    Thread.sleep(3000)
    println("Проверяем, что будет, если прибавить громкость при выключенном телевизоре:")
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    goodTv.upVolume()
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    println("Прибавляем громкость до максимума и выше, а также выведем в консоль значение поля Громкость:")
    Thread.sleep(3000)
    for (i in 1 until TV.maxVolume+1) {
        goodTv.upVolume()
        println("Значение поля громкость: ${goodTv.volume}")
        Thread.sleep(1000)
    }
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    goodTv.downVolume()
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    println("Убавляем громкость до минимума и ниже, а также выведем в консоль значение поля Громкость:")
    Thread.sleep(3000)
    for (i in 1..TV.maxVolume+1) {
        goodTv.downVolume()
        println("Значение поля громкость: ${goodTv.volume}")
        Thread.sleep(1000)
    }
    println("Теперь переключаем каналы кнопкой вверх при выключенном телевизоре:")
    Thread.sleep(3000)
    println("Значение поля текущий канал: ${goodTv.currentChannel}")
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    for (i in 1 until goodTv.channelsNumber+1) {
        goodTv.channelUp()
        println("Значение поля текущий канал: ${goodTv.currentChannel}")
        Thread.sleep(1000)
    }
    println("Теперь переключаем каналы кнопкой вниз при выключенном телевизоре:")
    Thread.sleep(3000)
    println("Значение поля текущий канал: ${goodTv.currentChannel}")
    Thread.sleep(3000)
    goodTv.turningOnOff()
    Thread.sleep(3000)
    for (i in 1 until goodTv.channelsNumber+1) {
        goodTv.channelDown()
        println("Значение поля текущий канал: ${goodTv.currentChannel}")
        Thread.sleep(1000)
    }











    val strongTv = TV (brand = "小米", model = "米四", screenSize = 40)
    println("Бренд: ${strongTv.brand}, Модель: ${strongTv.model}, Диагональ экрана: ${strongTv.screenSize}, " +
            "Количество каналов: ${strongTv.channelsNumber}, Константы громкости для всех экземпляров " +
            "мин: ${TV.minVolume}, макс: ${TV.maxVolume}, Список каналов:")
    Thread.sleep(3000)
    strongTv.channelList()
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    println("Значение поля вкл/выкл: ${strongTv.onOff}")
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    println("Значение поля вкл/выкл: ${strongTv.onOff}")
    Thread.sleep(3000)
    println("Переключаем канал на ${strongTv.channelsNumber} при выключенном телевизоре:")
    Thread.sleep(3000)
    strongTv.switchChannelByNumber(strongTv.channelsNumber)
    Thread.sleep(3000)
    println("Проверяем, что будет, если прибавить громкость при выключенном телевизоре:")
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    strongTv.upVolume()
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    println("Прибавляем громкость до максимума и выше, а также выведем в консоль значение поля Громкость:")
    Thread.sleep(3000)
    for (i in 1 until TV.maxVolume+1) {
        strongTv.upVolume()
        println("Значение поля громкость: ${strongTv.volume}")
        Thread.sleep(1000)
    }
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    strongTv.downVolume()
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    println("Убавляем громкость до минимума и ниже, а также выведем в консоль значение поля Громкость:")
    Thread.sleep(3000)
    for (i in 1..TV.maxVolume+1) {
        strongTv.downVolume()
        println("Значение поля громкость: ${strongTv.volume}")
        Thread.sleep(1000)
    }
    println("Теперь переключаем каналы кнопкой вверх при выключенном телевизоре:")
    Thread.sleep(3000)
    println("Значение поля текущий канал: ${strongTv.currentChannel}")
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    for (i in 1 until strongTv.channelsNumber+1) {
        strongTv.channelUp()
        println("Значение поля текущий канал: ${strongTv.currentChannel}")
        Thread.sleep(1000)
    }
    println("Теперь переключаем каналы кнопкой вниз при выключенном телевизоре:")
    Thread.sleep(3000)
    println("Значение поля текущий канал: ${strongTv.currentChannel}")
    Thread.sleep(3000)
    strongTv.turningOnOff()
    Thread.sleep(3000)
    for (i in 1 until strongTv.channelsNumber+1) {
        strongTv.channelDown()
        println("Значение поля текущий канал: ${strongTv.currentChannel}")
        Thread.sleep(1000)
    }





    val slowTv = TV (brand = "Vitek", model = "Slow3", screenSize = 19)
    println("Бренд: ${slowTv.brand}, Модель: ${slowTv.model}, Диагональ экрана: ${slowTv.screenSize}, " +
            "Количество каналов: ${slowTv.channelsNumber}, Константы громкости для всех экземпляров " +
            "мин: ${TV.minVolume}, макс: ${TV.maxVolume}, Список каналов:")
    Thread.sleep(3000)
    slowTv.channelList()
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    println("Значение поля вкл/выкл: ${slowTv.onOff}")
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    println("Значение поля вкл/выкл: ${slowTv.onOff}")
    Thread.sleep(3000)
    println("Переключаем канал на ${slowTv.channelsNumber} при выключенном телевизоре:")
    Thread.sleep(3000)
    slowTv.switchChannelByNumber(slowTv.channelsNumber)
    Thread.sleep(3000)
    println("Проверяем, что будет, если прибавить громкость при выключенном телевизоре:")
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    slowTv.upVolume()
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    println("Прибавляем громкость до максимума и выше, а также выведем в консоль значение поля Громкость:")
    Thread.sleep(3000)
    for (i in 1 until TV.maxVolume+1) {
        slowTv.upVolume()
        println("Значение поля громкость: ${slowTv.volume}")
        Thread.sleep(1000)
    }
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    slowTv.downVolume()
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    println("Убавляем громкость до минимума и ниже, а также выведем в консоль значение поля Громкость:")
    Thread.sleep(3000)
    for (i in 1..TV.maxVolume+1) {
        slowTv.downVolume()
        println("Значение поля громкость: ${slowTv.volume}")
        Thread.sleep(1000)
    }
    println("Теперь переключаем каналы кнопкой вверх при выключенном телевизоре:")
    Thread.sleep(3000)
    println("Значение поля текущий канал: ${slowTv.currentChannel}")
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    for (i in 1 until slowTv.channelsNumber+1) {
        slowTv.channelUp()
        println("Значение поля текущий канал: ${slowTv.currentChannel}")
        Thread.sleep(1000)
    }
    println("Теперь переключаем каналы кнопкой вниз при выключенном телевизоре:")
    Thread.sleep(3000)
    println("Значение поля текущий канал: ${slowTv.currentChannel}")
    Thread.sleep(3000)
    slowTv.turningOnOff()
    Thread.sleep(3000)
    for (i in 1 until slowTv.channelsNumber+1) {
        slowTv.channelDown()
        println("Значение поля текущий канал: ${slowTv.currentChannel}")
        Thread.sleep(1000)
    }







}