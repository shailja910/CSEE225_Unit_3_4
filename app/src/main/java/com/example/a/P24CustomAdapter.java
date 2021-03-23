package com.example.a;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;



public class P24CustomAdapter extends ArrayAdapter {
    Button b;
    ImageView img;
    TextView tv1,tv2;

    ArrayList<P24Student> al=new ArrayList<>();
    int res;
    Context ct;
    public P24CustomAdapter(@NonNull Context context, int res, ArrayList<P24Student> al) {
        super(context, res,al);
        ct=context;
        this.al=al;
        this.res=res;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(ct);
        View v=inflater.inflate(R.layout.activity_p24_custom_layout,null,false);
        b=v.findViewById(R.id.buttonDelete);
        tv1=v.findViewById(R.id.title);
        tv2=v.findViewById(R.id.subtitle);
        img=v.findViewById(R.id.icon);
        img.setImageResource(al.get(position).getImg());
        tv1.setText(al.get(position).getMainTitle());
        tv2.setText(al.get(position).getSubTitle());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callAlert(position);
                Toast.makeText(getContext(),"u have selected"+position,Toast.LENGTH_LONG).show();
            }
        });
        return v;

    };
    void callAlert(final int p)
    {
        AlertDialog.Builder b=new AlertDialog.Builder(ct);
        b.setTitle("Are u sure u want to delete the item from the list");
        b.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                al.remove(p);
                notifyDataSetChanged();
            }
        });
        b.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog ad=b.create();
        ad.show();
    }
}

