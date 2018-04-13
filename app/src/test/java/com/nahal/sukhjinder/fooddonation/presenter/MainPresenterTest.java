package com.nahal.sukhjinder.fooddonation.presenter;

import android.view.View;

import com.nahal.sukhjinder.fooddonation.contract.MainActivityContract;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    @Mock
    private MainActivityContract.MVPView mView;
    @Mock
    private View view;
    private MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void donateButtonClick() {
        mPresenter.donateButtonClick(view);
        verify(mView).showDonateScreen();
    }

    @Test
    public void pickupButtonClick() {
        mPresenter.pickupButtonClick(view);
        verify(mView).showPickupScreen();
    }
}