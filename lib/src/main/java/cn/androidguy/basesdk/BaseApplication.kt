package cn.androidguy.basesdk

import android.app.Application
import com.tencent.mmkv.MMKV

/**
 * DATE : 2022/2/18
 * @author : 景天
 */
open class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)
    }

}