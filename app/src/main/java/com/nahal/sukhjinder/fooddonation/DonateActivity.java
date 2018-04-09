package com.nahal.sukhjinder.fooddonation;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.nahal.sukhjinder.fooddonation.databinding.DonateBinding;

/**
 * Created by Sukhjinder on 3/18/18.
 */

public class DonateActivity extends AppCompatActivity {

    DonateBinding donateBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        donateBinding = DataBindingUtil.setContentView(DonateActivity.this, R.layout.donate);
        donateBinding.addDonationActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Added Donation", Toast.LENGTH_SHORT).show();

            }
        });

        getSupportActionBar().setTitle("Donate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}



