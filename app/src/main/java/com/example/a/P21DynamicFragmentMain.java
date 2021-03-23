package com.example.a;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class P21DynamicFragmentMain extends AppCompatActivity implements P21DynamicFrag1.I{
Button b1,b2;
    String sendData;
    String senddata2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p21_dynamic_fragment_main);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        if(savedInstanceState != null) {
            senddata2 = savedInstanceState.getString("K1");
        }// get the display mode
        int displaymode = getResources().getConfiguration().orientation;
        if (displaymode == 1) { // it portrait mode
            P21DynamicFrag1 f1= new P21DynamicFrag1();
            fragmentTransaction.replace(android.R.id.content, f1); }
        else {// its landscape
            P21DynamicFrag2 f2 = new P21DynamicFrag2();
            fragmentTransaction.replace(android.R.id.content, f2);
            if(senddata2!=null){}
            f2.displayReceivedData(senddata2); }
        fragmentTransaction.commit();}

    public void communicate(String msg)
    {
        sendData = msg;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("K1",sendData);
    }

}