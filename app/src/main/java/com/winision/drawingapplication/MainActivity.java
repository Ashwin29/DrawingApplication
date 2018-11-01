package com.winision.drawingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private DrawingView drawingView;

    private ImageButton currentColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawingView = findViewById(R.id.drawing);
        LinearLayout paintLayout = findViewById(R.id.paint_colors);
        currentColor = (ImageButton) paintLayout.getChildAt(0);
        currentColor.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
    }

    public void paintClicked(View view) {
        if(view != currentColor) {
            ImageButton imaView = (ImageButton) view;
            String color = view.getTag().toString();
            drawingView.setColor(color);
            imaView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
            currentColor.setImageDrawable(getResources().getDrawable(R.drawable.paint));
            currentColor = (ImageButton) view;
        }
    }

}
