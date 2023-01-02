package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.scottyab.aescrypt.AESCrypt;

import java.security.GeneralSecurityException;

public class Encryption extends Activity {

    EditText et_key, et_msg;
    Button bt_encrypt, bt_decrypt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt);
        et_key = findViewById(R.id.et_key);
        et_msg = findViewById(R.id.et_msg);
        bt_encrypt = findViewById(R.id.bt_encrypt);
        bt_decrypt=findViewById(R.id.bt_decrypt);
        bt_encrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String encrpyt = AESCrypt.encrypt(et_key.getText().toString(), et_msg.getText().toString());
                    et_msg.setText(encrpyt);
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
            }
        });
        bt_decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String decrypt = AESCrypt.decrypt(et_key.getText().toString(), et_msg.getText().toString());
                    et_msg.setText(decrypt);
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }

            }
        });

    }




}
