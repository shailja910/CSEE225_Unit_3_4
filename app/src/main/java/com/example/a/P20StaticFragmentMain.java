package com.example.a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class P20StaticFragmentMain extends FragmentActivity implements ButtonListenerInterface {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p20_static_fragment_main_class);
    }


    @Override
    public void onButtonPressed(String msg) {
       P20StaticFragment2 Obj = (P20StaticFragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        Obj.onFragmentInteraction(msg);
    }
}