package com.example.ex012;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton tgbtn;
    Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        tgbtn=(ToggleButton) findViewById(R.id.tgbtn);
        s=(Switch) findViewById(R.id.s);
    }

    public void check(View view) {
        if (s.isChecked()&&tgbtn.isChecked())
            setMyScreenColor(Color.GRAY);
        else
            setMyScreenColor(Color.GREEN);
        if (s.isChecked()&&(!tgbtn.isChecked()))
            setMyScreenColor(Color.MAGENTA);
        if ((tgbtn.isChecked()&&(!s.isChecked())))
            setMyScreenColor(Color.YELLOW);
    }
    public void setMyScreenColor(int color){
        View view=this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}
