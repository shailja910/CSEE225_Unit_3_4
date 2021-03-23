package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class P28ValidationsOnViews extends AppCompatActivity {
    EditText NameEditText,editTextPhoneNumber,wordEditText;
    TextView textViewName,textViewAge,textViewword;
    Button RegistrationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p28_validations_on_views);
        RegistrationButton=(Button)findViewById(R.id.button);
        NameEditText=(EditText)findViewById(R.id.editText1);
        wordEditText=(EditText)findViewById(R.id.editText2);
        RegistrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Name=NameEditText.getText().toString();
                final String word=wordEditText.getText().toString();
                if(Name.length()==0)
                {
                    NameEditText.requestFocus();
                    NameEditText.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!Name.matches("[a-zA-Z ]+") )
                {
                    NameEditText.requestFocus();
                    NameEditText.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }
                else if((word.length()==0) || word.length()>10)
                {
                    wordEditText.requestFocus();
                    wordEditText.setError("FIELD CANNOT BE EMPTY and only 10 digits only");
                }
                else
                {
                    Toast.makeText(P28ValidationsOnViews.this,"Validation Successful",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}