package com.nahal.sukhjinder.fooddonation.presenter;

import android.view.View;

import com.nahal.sukhjinder.fooddonation.contract.DonateActivityContract;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class DonatePresenterTest {

    @Mock
    private DonateActivityContract.MVPView mView;
    @Mock
    private View view;

    private DonatePresenter mPresenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mPresenter = new DonatePresenter(mView);
    }

    @Test
    public void addDonationButtonClick() {
        mPresenter.addDonationButtonClick(view);
        verify(mView).showAddDonationScreen();
    }
}