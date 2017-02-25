package com.example.asus.okhttp;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView  = (ImageView) findViewById(R.id.image);

    }
    public void bt_show(View view) {
        OkHttpUtils.get().url("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488012911419&di=69417bf84434f2f8c4e34f7b32e79030&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg")
                .build().execute(new BitmapCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(Bitmap bitmap) {
                    imageView.setImageBitmap(bitmap);
            }
        });

    }
}
