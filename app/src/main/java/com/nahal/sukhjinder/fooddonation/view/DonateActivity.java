package com.nahal.sukhjinder.fooddonation.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.nahal.sukhjinder.fooddonation.R;
import com.nahal.sukhjinder.fooddonation.contract.DonateActivityContract;
import com.nahal.sukhjinder.fooddonation.databinding.DonateBinding;
import com.nahal.sukhjinder.fooddonation.model.Donation;
import com.nahal.sukhjinder.fooddonation.presenter.DonatePresenter;

/**
 * Created by Sukhjinder on 3/18/18.
 */

public class DonateActivity extends AppCompatActivity implements DonateActivityContract.MVPView {

    private DonatePresenter donatePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DonateBinding donateBinding = DataBindingUtil.setContentView(this, R.layout.donate);
        donatePresenter = new DonatePresenter(this);
        donateBinding.setPresenter(donatePresenter);

        getSupportActionBar().setTitle("Donate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent donationIntent = getIntent();
        Donation donation = donationIntent.getParcelableExtra("Donation");

    }

    @Override
    public void showAddDonationScreen() {
        Intent addDonationIntent = new Intent(this, AddDonationActivity.class);
        startActivity(addDonationIntent);
    }
}



