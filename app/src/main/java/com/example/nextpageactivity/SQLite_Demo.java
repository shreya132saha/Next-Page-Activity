package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SQLite_Demo extends AppCompatActivity {
    EditText country, city, state;
    Button insert, update, delete, view;
    DBHelper DB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlite_demo);
        country = findViewById(R.id.country);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        insert = findViewById(R.id.btnInsert);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);
        DB = new DBHelper(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = country.getText().toString();
                String contactTXT = city.getText().toString();
                String dobTXT = state.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(nameTXT, contactTXT, dobTXT);
                if(checkinsertdata==true)
                    Toast.makeText(SQLite_Demo.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SQLite_Demo.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = country.getText().toString();
                String contactTXT = city.getText().toString();
                String dobTXT = state.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(nameTXT, contactTXT, dobTXT);
                if(checkupdatedata==true)
                    Toast.makeText(SQLite_Demo.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SQLite_Demo.this, "New Entry Not Updated", Toast.LENGTH_SHORT).show();
            }        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = country.getText().toString();
                Boolean checkudeletedata = DB.deletedata(nameTXT);
                if(checkudeletedata==true)
                    Toast.makeText(SQLite_Demo.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SQLite_Demo.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if(res.getCount()==0){
                    Toast.makeText(SQLite_Demo.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Country :"+res.getString(0)+"\n");
                    buffer.append("City :"+res.getString(1)+"\n");
                    buffer.append("State :"+res.getString(2)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(SQLite_Demo.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }        });
    }}