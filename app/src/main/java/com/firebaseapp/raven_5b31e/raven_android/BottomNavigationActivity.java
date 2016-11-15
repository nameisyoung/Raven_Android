/*  Raven Android

    Author: Younggun Chung
    Created: Nov 14, 2016

    Note: TextFragment is related with this code.
    Reference: https://material.google.com/components/bottom-navigation.html#
                https://developer.android.com/reference/android/support/design/widget/BottomNavigationView.html
                https://developer.android.com/training/constraint-layout/index.html
                https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html
                http://tools.android.com/recent/constraintlayoutbeta3isnowavailable
                https://blog.stylingandroid.com/bottomnavigationview/
*/


package com.firebaseapp.raven_5b31e.raven_android;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class BottomNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragment = new TextFragment();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        @StringRes int text;
        switch (item.getItemId()) {
            case R.id.account:
                text = R.string.profile;
                break;
            case R.id.share:
                text = R.string.share;
                break;
            case R.id.nearby:
                text = R.string.nearby;
                break;
            default:
                return false;
        }
        switchFragmentText(text);
        return true;
    }

    private void switchFragmentText(@StringRes int text) {
        fragment.setText(text);
    }
}