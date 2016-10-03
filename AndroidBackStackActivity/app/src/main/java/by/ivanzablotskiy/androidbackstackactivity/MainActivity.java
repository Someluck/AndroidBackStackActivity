package by.ivanzablotskiy.androidbackstackactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean LAUNCHED=false;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        launchMode(savedInstanceState);
        Toast.makeText(this, "Main activity launched", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
       outState.putBoolean("LAUNCHED",true);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LAUNCHED=savedInstanceState.getBoolean("LAUNCHED");
    }

    public void launchMode(Bundle savedInstanceState) {
        if (savedInstanceState!=null){
        if (LAUNCHED){
            Intent intent = new Intent(this,StartActivity.class);
            startActivity(intent);
        }
        }
        else {
            Intent intent = new Intent(this, FirstActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        }
    }

