package by.ivanzablotskiy.androidbackstackactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ivanz on 03.10.2016.
 */

public class FirstActivity extends AppCompatActivity {
    private final String ACTIVITY_NAME = "1";

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toast.makeText(this, "FIrst activity launched", Toast.LENGTH_SHORT).show();

        textView = ((TextView) findViewById(R.id.textView));
        textView.setText(ACTIVITY_NAME);
    }

    public void buttonOnClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
