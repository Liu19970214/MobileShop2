package com.huatec.edu.mobileshop;

//import android.app.FragmentTransaction;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.NavigableMap;

import com.huatec.edu.mobileshop.R;
import com.huatec.edu.mobileshop.NavigationFragment;


public class MainActivity extends BaseActivity {
    private  NavigationFragment navigationFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationFragment=new NavigationFragment();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
               fragmentTransaction.add(R.id.main_frame,navigationFragment).commit();

    }
}