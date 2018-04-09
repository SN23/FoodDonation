package com.nahal.sukhjinder.fooddonation;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nahal.sukhjinder.fooddonation.databinding.PickupBinding;

/**
 * Created by Sukhjinder on 3/18/18.
 */

public class PickupActivity extends AppCompatActivity {

    PickupBinding pickupBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pickupBinding = DataBindingUtil.setContentView(PickupActivity.this, R.layout.pickup);

        getSupportActionBar().setTitle("Pickup");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
