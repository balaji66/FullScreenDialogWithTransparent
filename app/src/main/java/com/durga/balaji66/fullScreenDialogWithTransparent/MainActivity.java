package com.durga.balaji66.fullScreenDialogWithTransparent;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayFullScreenDialog();
            }
        });
    }

    public void displayFullScreenDialog() {
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
        Button click = view.findViewById(R.id.button);
        //This is for closing the dialog.
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();

            }
        });

    }
}
