package com.example.aac

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class Server: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun connect(){
        Log.e("Server", "Законектился")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun disconnect(){
        Log.e("Server", "Расконектился")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun serverLog(source: LifecycleOwner, event: Lifecycle.Event){
        Log.e("ServerLog", "source ${source}, event $event")
    }
}
