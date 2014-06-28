package com.home.android.playback;

import android.app.Activity;
import android.content.Context;
import android.speech.tts.TextToSpeech.OnInitListener;

public class SecondActivity extends Activity{
	
	Context mContext = getApplicationContext();
	
	SecondActivity(Context mContext){
		setContext(mContext);
	}

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context mContext) {
        this.mContext = mContext;
    }

	

}
