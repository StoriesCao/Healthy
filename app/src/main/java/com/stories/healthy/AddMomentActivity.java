package com.stories.healthy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Charlottecao on 9/27/17.
 */

public class AddMomentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_moment);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.add_moment_activity_open, R.anim.add_moment_activity_close);
    }
}
