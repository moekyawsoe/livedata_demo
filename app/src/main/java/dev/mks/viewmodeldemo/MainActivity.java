package dev.mks.viewmodeldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_ShowNum = findViewById(R.id.txt_showNum);

        MyRandomNumberGenerator generator = new MyRandomNumberGenerator();

        MyRandomNumberGenerator viewModel = ViewModelProviders.of(this).get(MyRandomNumberGenerator.class);
        String ramData = viewModel.getNumber();

        txt_ShowNum.setText(ramData);

    }
}