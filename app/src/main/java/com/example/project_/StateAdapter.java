package com.example.project_;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {
    // Класс для создания активити с разным наполнением
    Context context;
    LayoutInflater inflater;
    ArrayList<State> states;

    public StateAdapter(@NonNull Context context, int resource, @NonNull List<State> objects) {
        super(context, resource, objects);
        this.context = context;

    }

    public View getView(int l, View parent, ViewGroup viewGroup){
        View view = new View(context);


        return view;
    }
}
