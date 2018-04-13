package com.nahal.sukhjinder.fooddonation.presenter;

import android.view.View;

import com.nahal.sukhjinder.fooddonation.contract.MainActivityContract;

public class MainPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.MVPView mView;

    public MainPresenter(MainActivityContract.MVPView view) {
        mView = view;
    }

    @Override
    public void donateButtonClick(View view) {
        mView.showDonateScreen();
    }

    @Override
    public void pickupButtonClick(View view) {
        mView.showPickupScreen();
    }
}
