package com.example.practical211;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context.getApplicationContext(),
                "Recieved an broadcast : "+intent.getAction(),
                Toast.LENGTH_LONG).show();
    }
}
