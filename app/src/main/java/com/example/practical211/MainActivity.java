package com.example.practical211;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    MyBroadcastReceiver myBroadcastReceiver = new MyBroadcastReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter1 = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        IntentFilter filter2 = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
        IntentFilter filter3 = new IntentFilter(Intent.ACTION_BATTERY_LOW);
        IntentFilter filter4 = new IntentFilter(Intent.ACTION_BATTERY_OKAY);
        IntentFilter filter5 = new IntentFilter(Intent.ACTION_REBOOT);
        IntentFilter filter6 = new IntentFilter(Intent.ACTION_BOOT_COMPLETED);

        registerReceiver(myBroadcastReceiver, filter1);
        registerReceiver(myBroadcastReceiver, filter2);
        registerReceiver(myBroadcastReceiver, filter3);
        registerReceiver(myBroadcastReceiver, filter4);
        registerReceiver(myBroadcastReceiver, filter5);
        registerReceiver(myBroadcastReceiver, filter6);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myBroadcastReceiver);
    }
}