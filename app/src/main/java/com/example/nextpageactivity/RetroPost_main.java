package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetroPost_main extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    private Button btnSendPost;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_retrofit);

        btnSendPost=findViewById(R.id.btnSendPost);
        btnSendPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnSendPostRequestClicked();
            }
        });
    }
    private void btnSendPostRequestClicked()
    {
        ApiInterface apiInterface=RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<User> call=apiInterface.getUserInformation("Shreya Saha", "Android developer");
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.e(TAG, "onResponse: " +response.code());
                Log.e(TAG, "onResponse: name: "+response.body().getName());
                Log.e(TAG, "onResponse: job: "+response.body().getJob());
                Log.e(TAG, "onResponse: id: "+response.body().getId());
                Log.e(TAG, "onResponse: createdAt: "+response.body().getCreatedAt());

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e(TAG, "onFailure:" +t.getMessage());

            }
        });

    }

}
