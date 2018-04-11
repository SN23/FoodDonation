package com.nahal.sukhjinder.fooddonation.contract;

import android.view.View;

public interface MainActivityContract {

    interface MVPView{
        void showDonateScreen();
        void showPickupScreen();
    }

    interface Presenter{
        void donateButtonClick(View view);
        void pickupButtonClick(View view);
    }
}
