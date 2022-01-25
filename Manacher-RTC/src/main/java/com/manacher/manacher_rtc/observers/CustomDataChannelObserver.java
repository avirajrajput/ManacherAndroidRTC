package com.manacher.manacher_rtc.observers;

import android.util.Log;

import org.webrtc.DataChannel;

public class CustomDataChannelObserver  implements DataChannel.Observer {

    public CustomDataChannelObserver(){
    }

    @Override
    public void onBufferedAmountChange(long l) {

    }

    @Override
    public void onStateChange() {

    }

    @Override
    public void onMessage(DataChannel.Buffer buffer) {
        Log.d("Data", "Some Data has been received");
    }
}
