package by.ivanzablotskiy.androidbackstackactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by ivanz on 03.10.2016.
 */

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toast.makeText(this, "Start launched", Toast.LENGTH_SHORT).show();
    }
}
