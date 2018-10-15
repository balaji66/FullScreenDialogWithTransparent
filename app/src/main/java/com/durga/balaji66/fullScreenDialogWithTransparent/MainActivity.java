package com.durga.balaji66.fullScreenDialogWithTransparent;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutToAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Dialog dialog = new Dialog(this, android.R.style.Theme_Light);
        //This is for removing dialog title.
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        Window window = dialog.getWindow();
//        assert window != null;
//        WindowManager.LayoutParams wlp = window.getAttributes();
//        wlp.gravity = Gravity.BOTTOM;
//        wlp.flags &= ~WindowManager.LayoutParams.FLAG_DIM_BEHIND;
//        window.setAttributes(wlp);
        dialog.setCancelable(false);
        @SuppressLint("InflateParams") View view = MainActivity.this.getLayoutInflater().inflate(R.layout.fragment_bottom, null);
        //This is for adding transparent to dialog for background then only you can see the background views.
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(view);
        dialog.show();

    }
}
