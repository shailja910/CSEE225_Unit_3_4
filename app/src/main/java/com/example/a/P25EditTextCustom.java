package com.example.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;
public class P25EditTextCustom extends AppCompatEditText {
    private String sethint;
    private boolean setcolor;
    Drawable darkButton, lightButton;

    public P25EditTextCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tarry1 = context.obtainStyledAttributes(attrs, R.styleable.EditTextCustom);
        try {
            sethint = tarry1.getString(R.styleable.EditTextCustom_setHint);
                  if (sethint == null)
                     setHint("enter ur message");
                  else
                      setHint("now you can reenter");

            setcolor = tarry1.getBoolean(R.styleable.EditTextCustom_setColor1, false);
                 if (setcolor == true)
                    setTextColor(Color.RED);
              }
        finally {
            tarry1.recycle();
            init();
        }
    }

    void init() {
        darkButton = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_clear_black_24dp, null);
        lightButton = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_clear_black_22dp, null);

        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                showButton();
                show();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    void show() {
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                boolean isclicked = false;

                float clearButtonStart = getWidth() - getPaddingEnd()
                        - darkButton.getIntrinsicWidth();
                if (motionEvent.getX() > clearButtonStart) {
                    isclicked = true;
                }
                //else
                //   Toast.makeText(getContext(), "hello", Toast.LENGTH_SHORT).show();

                if (isclicked) {
                    switch (motionEvent.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            getText().clear();
                            break;
                        case MotionEvent.ACTION_UP:
                            hideButton();
                            break;
                    }
                }
                return true;
            }

        });
    }


    public void showButton() {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, darkButton, null);
    }

    public void hideButton() {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, lightButton, null);
    }
}