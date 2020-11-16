package com.ant0x00.diyplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;

import static android.os.Environment.DIRECTORY_DCIM;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private String LOGTAG = "learn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadImageByImageView();
    }

    private void loadImageByImageView(){
        imageView = findViewById(R.id.imageView);
        Log.d(LOGTAG, Environment.getExternalStoragePublicDirectory(DIRECTORY_DCIM).getPath() + "/Screenshots"+File.separator + "11.jpg");
        Bitmap bitmap = BitmapFactory.decodeFile(Environment.getExternalStoragePublicDirectory(DIRECTORY_DCIM).getPath()
                +"/Screenshots"
                + File.separator + "11.jpg");
        imageView.setImageBitmap(bitmap);
    }
}