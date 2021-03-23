package com.example.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import static android.app.Activity.RESULT_OK;

public class P19ImageFragmnet1 extends Fragment {
    Button fb1,fb2;
    Bitmap bitmap;
    ImageView iv1;
    View v;
    P19I i;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_p19_image_fragmnet1, container, false);

        fb1 = v.findViewById(R.id.click);
        fb2 = v.findViewById(R.id.send);
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 7);
            }
        });

        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i.communicate(bitmap);
            }
        });
        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        i=(P19I) getActivity();
    }

    @Override
    public void onActivityResult ( int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 7 && resultCode==RESULT_OK) {
            Bundle extras=data.getExtras();
             bitmap = (Bitmap) extras.get("data");
            iv1=v.findViewById(R.id.iv1);
            iv1.setImageBitmap(bitmap);

        }
    }
}