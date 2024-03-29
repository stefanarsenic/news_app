package com.example.news_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.news_app.Fragments.CRUD.CRUDKorisnikFragment;
import com.example.news_app.Fragments.CRUD.CRUDVestiFragment;
import com.google.android.material.tabs.TabLayout;

public class AdminActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new CRUDKorisnikFragment())
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = new CRUDKorisnikFragment();

                switch (tab.getPosition()){
                    case 0:
                        fragment = new CRUDKorisnikFragment();
                        break;
                    case 1:
                        fragment = new CRUDVestiFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}