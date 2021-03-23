package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
public class P24MainAddToCustomListviewOnRuntime extends AppCompatActivity {
    ListView lv;
    ArrayList<P24Student> al;
    Button addButton;
    EditText Gettitle;
    EditText Getsubtitle;
    P24CustomAdapter  ca;
    String title,subtitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p24_r_t_add_to_custom_listview_on_runtime);
        al=new ArrayList<>();
        lv = findViewById(R.id.list);
        addButton = findViewById(R.id.button1);
        Gettitle = findViewById(R.id.editText1);
        Getsubtitle=findViewById(R.id.editText2);
        ca=new P24CustomAdapter(this,R.layout.activity_p24_custom_layout,al);
    }
    public void doThis(View v)
    {
        title=Gettitle.getText().toString();
        Gettitle.setText("");
        subtitle=Getsubtitle.getText().toString();
        Getsubtitle.setText("");
        al.add(new P24Student(R.drawable.a,title,subtitle));
        lv.setAdapter(ca);
        ca.notifyDataSetChanged();

    }
}
