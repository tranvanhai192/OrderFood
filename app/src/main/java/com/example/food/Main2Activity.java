package com.example.food;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    BottomNavigationView navigationView;
    Contacts contacts;
    TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        navigationView=findViewById(R.id.nav);
        tvUser = findViewById(R.id.tvUser);
       Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        tvUser.setText("Welcome: " );


        //gragment
        getFragment(home.newInstance(contacts));

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_home:
                        getFragment(home.newInstance(contacts));
                    case R.id.menu_order:
                        getFragment(order.newInstance());
                }

                return false;
            }
        });


    }
    public void getFragment(Fragment fragment) {
        try {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "getFragment: " + e.getMessage());
        }
    }
}
