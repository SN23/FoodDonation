package com.nahal.sukhjinder.fooddonation.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nahal.sukhjinder.fooddonation.R;
import com.nahal.sukhjinder.fooddonation.contract.MainActivityContract;
import com.nahal.sukhjinder.fooddonation.databinding.ActivityMainBinding;
import com.nahal.sukhjinder.fooddonation.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.MVPView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainPresenter mainPresenter = new MainPresenter(this);
        mainBinding.setPresenter(mainPresenter);
    }

    @Override
    public void showDonateScreen() {
        Intent donateIntent = new Intent(this, DonateActivity.class);
        startActivity(donateIntent);
    }

    @Override
    public void showPickupScreen() {
        Intent pickupIntent = new Intent(this, PickupActivity.class);
        startActivity(pickupIntent);
    }

}
