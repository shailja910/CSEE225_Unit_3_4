package com.example.a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class P19ImageFragmnetMain extends AppCompatActivity implements P19I {
Button b1,b2;
Bitmap bp,bp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p19_image_fragmnet_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
       bp1 = savedInstanceState.getParcelable("K1");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                P19ImageFragmnet1 obj=new P19ImageFragmnet1();
               //fragmentTransaction.replace(R.id.content,obj);
               fragmentTransaction.add(R.id.fl1,obj);
                fragmentTransaction.commit();
        }});

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }});
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        P19ImageFragmnet2 obj=new P19ImageFragmnet2();
        fragmentTransaction.add(R.id.fl1,obj);
        obj.read(bp1);
        fragmentTransaction.commit();

    }

    public void communicate(Bitmap b) {
        bp=b;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("k1", bp);
    }
}