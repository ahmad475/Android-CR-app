package com.example.ahmed.cr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr);
    }

    CRModel m = new CRModel();

    public void north(View view){
        int count= this.m.n();
        String displaycount= this.m.getstring();
        ((TextView) findViewById(R.id.textView)).setText(displaycount);
        ((TextView) findViewById(R.id.textView2)).setText("("+m.getintx()+","+m.getinty()+")");


        if(m.canGoNorth()==false) {
            ((Button) findViewById(R.id.button)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button)).setBackgroundColor(Color.GREEN);}
        if(m.canGoSouth()==false) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button2)).setBackgroundColor(Color.GREEN);}




    }
    public void south(View view){
        int count= this.m.s();
        String displaycount= this.m.getstring();
        ((TextView) findViewById(R.id.textView)).setText(displaycount);
        ((TextView) findViewById(R.id.textView2)).setText("("+m.getintx()+","+m.getinty()+")");


        if(m.canGoNorth()==false) {
            ((Button) findViewById(R.id.button)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button)).setBackgroundColor(Color.GREEN);}
        if(m.canGoSouth()==false) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button2)).setBackgroundColor(Color.GREEN);}



    }
    public void east(View view){
        int count= this.m.e();
        String displaycount= this.m.getstring();
        ((TextView) findViewById(R.id.textView)).setText(displaycount);
        ((TextView) findViewById(R.id.textView2)).setText("("+m.getintx()+","+m.getinty()+")");


        if(m.canGoWest()==false) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button4)).setBackgroundColor(Color.GREEN);}
        if(m.canGoEast()==false) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button3)).setBackgroundColor(Color.GREEN);}
    }
    public void west(View view){
        int count= this.m.w();
        String displaycount= this.m.getstring();
        ((TextView) findViewById(R.id.textView)).setText(displaycount);
        ((TextView) findViewById(R.id.textView2)).setText("(" + m.getintx() + "," + m.getinty() + ")");


        if(m.canGoWest()==false) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button4)).setBackgroundColor(Color.GREEN);}
        if(m.canGoEast()==false) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(Color.RED);
        }else{((Button) findViewById(R.id.button3)).setBackgroundColor(Color.GREEN);}

    }

    }
