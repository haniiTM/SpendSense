package info.javaway.spend_sense.platform

import android.content.res.Resources
import android.os.Build
import androidx.annotation.RequiresApi

actual class DeviceInfo actual constructor() {

    private val screenInfo = Resources.getSystem().displayMetrics

    actual val osName = "Android"
    actual val osVersion = Build.VERSION.SDK_INT.toString()

    actual val model = Build.MODEL.toString()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    actual val cpu = Build.SUPPORTED_ABIS.first().toString()

    actual val screenWidth = screenInfo.widthPixels
    actual val screenHeight = screenInfo.heightPixels
    actual val screenDensity = screenInfo.density.toInt()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
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