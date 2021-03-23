package com.example.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class P23MyAdaptor extends BaseAdapter {
Context c;
int image[];
String fruit[];
LayoutInflater lv;
P23MyAdaptor(Context c, String fruit[], int image[])
{
    this.c=c;
this.image=image;
this.fruit=fruit;
lv=(LayoutInflater.from(c));
}
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =lv.inflate(R.layout.activity_p23_main_image_custom_listview, null);
        TextView f = (TextView)convertView.findViewById(R.id.tv1);
        ImageView i = (ImageView)convertView.findViewById(R.id.iv1);
        f.setText(fruit[position]);
        i.setImageResource(image[position]);
    return convertView;
    }
}
