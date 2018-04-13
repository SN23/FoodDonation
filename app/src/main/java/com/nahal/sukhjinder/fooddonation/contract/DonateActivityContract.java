package com.nahal.sukhjinder.fooddonation.contract;

import android.view.View;

public interface DonateActivityContract {

    interface MVPView {

        void showAddDonationScreen();

    }

    interface Presenter {

        void addDonationButtonClick(View view);

    }
}
