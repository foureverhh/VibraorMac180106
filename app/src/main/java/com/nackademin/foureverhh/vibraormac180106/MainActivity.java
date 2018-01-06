package com.nackademin.foureverhh.vibraormac180106;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txv = (TextView)findViewById(R.id.txv_starter);
        txv.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if(event.getAction()==MotionEvent.ACTION_DOWN)
        {
            vb.vibrate(5000);
        }else if(event.getAction()==MotionEvent.ACTION_UP)
        {
            vb.cancel();
        }
        return true;
    }
}
