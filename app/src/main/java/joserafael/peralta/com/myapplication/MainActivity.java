package joserafael.peralta.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "4itf" , "OnCreate has executed..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf" , "OnCreate has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf" , "OnCreate has executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf" , "OnCreate has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf" , "OnCreate has executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf" , "OnCreate has executed..");
    }

    public void display(View v) {
        //Toast.makeText(this, "Button is clicked",Toast.LENGTH_LONG).show();
        Snackbar.make(v, "button is clicked", Snackbar.LENGTH_SHORT).show();
    }

    public void display2(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

    public void displayMap(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, choose = null;
        if(v.getId() == R.id.btnmap){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.610400, 120.991916"));
            startActivity(i);
        }
    }


}