package com.example.a;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class P21DynamicFrag2 extends Fragment {
    TextView txtData;
    String msg;
    View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    v = inflater.inflate(R.layout.activity_p21_dynamic_fragment_f2, container, false);
        txtData = v.findViewById(R.id.textView1);
        txtData.setText(msg);
        return  v;
    }
    public void displayReceivedData(String message)
    {
        msg= message;
    }
}
