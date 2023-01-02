package com.example.nextpageactivity;

import android.os.Bundle;
import android.widget.EditText;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;

public class Shared_Preference extends AppCompatActivity {

    private EditText name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_preference);
        name = findViewById(R.id.edit1);
        age = findViewById(R.id.edit2);
    }


    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        String s1 = sh.getString("name", "");
        int a = sh.getInt("age", 0);


        name.setText(s1);
        age.setText(String.valueOf(a));
    }
    @Override
    protected void onPause() {
        super.onPause();


        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        myEdit.putString("name", name.getText().toString());
        myEdit.putInt("age", Integer.parseInt(age.getText().toString()));

        myEdit.apply();
    }
}