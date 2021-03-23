package com.example.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class P19ImageFragmnet2 extends Fragment {
    ImageView iv;
    View v;
    Bitmap b;
        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

            v=inflater.inflate(R.layout.fragment_p19_image_fragmnet2,container,false);
            iv=v.findViewById(R.id.iv1);
            iv.setImageBitmap(b);
        return v;
        }

    void read(Bitmap b)
    {
this.b=b;
    }
}