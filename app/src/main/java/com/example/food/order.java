package com.example.food;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class order extends Fragment {

    public static order newInstance() {

        Bundle args = new Bundle();
        order fragment = new order();
        fragment.setArguments(args);
        return fragment;

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=(inflater.inflate(R.layout.order,container,false));
        return view;
    }
}

