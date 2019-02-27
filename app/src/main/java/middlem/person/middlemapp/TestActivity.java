package middlem.person.middlemapp;

import androidx.appcompat.app.AppCompatActivity;
import person.middlem.viewmodule.sample.BasicUISampleActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void toSystemModule(View view) {
        startActivity(new Intent(this, BasicUISampleActivity.class));
    }
}
