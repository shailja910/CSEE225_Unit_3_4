package com.example.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public class P20StaticFragment2 extends androidx.fragment.app.Fragment {
    android.widget.TextView textView;
    android.view.View view;
    @Override
    public void onCreate(android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container,
                                          android.os.Bundle savedInstanceState) {
        // Inflate the layout for this fragment        init(container);

        view = inflater.inflate(R.layout.activity_p20_static_fragment2, container, false);
        return view;
    }
    public void onFragmentInteraction(String uri) {
        android.util.Log.d("shailja",uri);
        textView = view.findViewById(R.id.tv1);
        textView.setText(uri);
    }
}

