package by.ivanzablotskiy.androidbackstackactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String IS_FIRST_TIME_LAUNCH = "IS_FIRST_TIME_LAUNCH";
    private SharedPreferences sharedPreferences;
    private String APP_PREFERENCES = "MySettings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        launchMode();
        Toast.makeText(this, "Main activity launched", Toast.LENGTH_SHORT).show();

    }
    
    public void launchMode() {
        if (sharedPreferences.contains(IS_FIRST_TIME_LAUNCH)) {
            if (sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH, false)) {
                Intent intent = new Intent(this, StartActivity.class);
                startActivity(intent);
            } else {
                Intent intent = new Intent(this, FirstActivity.class);
                startActivity(intent);
            }
        } else {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        }
    }
}


