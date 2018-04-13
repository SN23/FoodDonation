package com.nahal.sukhjinder.fooddonation.presenter;

import android.view.View;

import com.nahal.sukhjinder.fooddonation.contract.DonateActivityContract;

public class DonatePresenter implements DonateActivityContract.Presenter {

    private DonateActivityContract.MVPView mView;

    public DonatePresenter(DonateActivityContract.MVPView mView) {
        this.mView = mView;
    }

    @Override
    public void addDonationButtonClick(View view) {
        mView.showAddDonationScreen();
    }

}
