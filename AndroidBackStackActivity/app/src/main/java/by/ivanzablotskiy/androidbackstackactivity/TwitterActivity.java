package by.ivanzablotskiy.androidbackstackactivity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TwitterActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter_layout);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabSpec spec1 = tabHost.newTabSpec("Tab1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("", getResources().getDrawable(R.drawable.ic_bar_home));

        TabSpec spec2 = tabHost.newTabSpec("Tab2");
        spec2.setContent(R.id.tab1);
        spec2.setIndicator("", getResources().getDrawable(R.drawable.ic_bar_messages));

        TabSpec spec3 = tabHost.newTabSpec("Tab3");
        spec3.setContent(R.id.tab1);
        spec3.setIndicator("", getResources().getDrawable(R.drawable.ic_bar_notifications));

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
    }
}
