package com.example.a;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class P23MainCustomListViewImages extends AppCompatActivity {
String fruit[]={"apple","mango","grapes"};
int image[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p23_image_custom_adapter);
    ListView lv1=findViewById(R.id.lv1);
    P23MyAdaptor obj=new P23MyAdaptor(P23MainCustomListViewImages.this,fruit,image);
    lv1.setAdapter(obj);
    }
}
