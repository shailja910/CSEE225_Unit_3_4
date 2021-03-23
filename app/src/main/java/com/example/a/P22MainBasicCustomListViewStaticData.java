package com.example.a;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class P22MainBasicCustomListViewStaticData extends AppCompatActivity {
    String[] Food={"Milk","Poha","Bread","Boiled Egg","cornflakes"};
    String[] Quantity={"One Cup","One Bowl","2 slices","2 Eggs","One Medium Bowl"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p22_main_basic_custom_list_view_static_data);
        ListView listView=(ListView)findViewById(R.id.list1);
        CustomAdapter1 customAdapter=new CustomAdapter1();
        listView.setAdapter(customAdapter);
    }


    class CustomAdapter1 extends BaseAdapter
    {

        @Override
        public int getCount() {
            return Food.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.activity_p22_my_layout,null);
            TextView textViewfood=(TextView)view.findViewById(R.id.tv1);
            TextView textViewquantity=(TextView)view.findViewById(R.id.tv2);
            textViewfood.setText(Food[i]);//bind the data with array
            textViewquantity.setText(Quantity[i]);
            return view;
        }
    }}
