package com.example.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class P20StaticFragment1 extends androidx.fragment.app.Fragment {
        android.view.View v;
        ButtonListenerInterface listen;

        @Override
        public void onCreate(android.os.Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container,
                                              android.os.Bundle savedInstanceState) {
            v = inflater.inflate(R.layout.activity_p20_static_fragment1, container, false);
            jumpTo(container);
            return v;
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            try {
                listen = (ButtonListenerInterface) getActivity();

            } catch (ClassCastException e) {
                throw new ClassCastException(context.toString() + " must implement onButtonPressed");
            }
        }

        void jumpTo(ViewGroup root) {
            Button but = v.findViewById(R.id.send);
            Toast.makeText(getContext(),"init",Toast.LENGTH_LONG).show();
            but.setOnClickListener(new android.view.View.OnClickListener() {
                @Override
                public void onClick(android.view.View v) {
                    listen.onButtonPressed("Button has been clicked ");
                }
            });
        }
    }
