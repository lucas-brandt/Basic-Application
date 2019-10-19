package com.lucasbrandt.basicapplication;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.database.Observable;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivityViewModel extends ViewModel {

    public ObservableField<String> locationResult = new ObservableField<>();
    public ObservableField<String> apiResult = new ObservableField<>();

    public MainActivityViewModel() {
    }

    public void setLocationResult(String loc) {
        locationResult.set(loc);
    }
}
