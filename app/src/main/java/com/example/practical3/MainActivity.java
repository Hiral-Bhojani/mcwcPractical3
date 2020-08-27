package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.text);

        WifiManager wifiMgr =(WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo =wifiMgr.getConnectionInfo();
        textView.setText(""+wifiInfo.getLinkSpeed());
    }
    @Override
    protected void onStop(){super.onStop();}
    @Override
    protected void onResume(){super.onResume();}
}