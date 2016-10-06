package by.ivanzablotskiy.androidbackstackactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ivanz on 03.10.2016.
 */

public class FifthActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private final String IS_FIRST_TIME_LAUNCH = "IS_FIRST_TIME_LAUNCH";

    private final String APP_PREFERENCES = "MySettings";

    private final String ACTIVITY_NAME = "5";
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toast.makeText(this, "FIfth activity launched", Toast.LENGTH_SHORT).show();
        textView = ((TextView) findViewById(R.id.textView));
        textView.setText(ACTIVITY_NAME);
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);

    }

    public void buttonOnClick(View view) {
        Intent intent = new Intent(this, StartActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, true);
        editor.apply();

    }
}
