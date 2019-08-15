package com.data_binding.first.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.Handler;

import com.data_binding.first.data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final Person person = new Person("first name", "chennai", "india");
        binding.setPerson(person);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                person.setName("second name");
                binding.invalidateAll();
            }
        }, 3000);
    }
}
