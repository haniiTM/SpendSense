package info.javaway.spend_sense.platform

actual class DeviceInfo actual constructor() {

    actual val osName = System.getProperty("os.name").toString()
    actual val osVersion = System.getProperty("os.version").toString()

    actual val model = "Desktop"
    actual val cpu = System.getProperty("os.arch").toString()

    actual val screenWidth = 0
    actual val screenHeight = 0
    actual val screenDensity = 0

    actual fun getSummary(): String {
        return "osName: $osName \n" +
                "osVersion: $osVersion \n" +
                "model: $model \n" +
                "cpu: $cpu \n" +
                "screenWidth: $screenWidth \n" +
                "screenHeight: $screenHeight \n" +
                "screenDensity: $screenDensity"
    }

}