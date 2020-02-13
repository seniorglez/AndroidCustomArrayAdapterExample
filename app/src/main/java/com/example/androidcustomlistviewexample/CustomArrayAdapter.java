package com.example.androidcustomlistviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.androidcustomlistviewexample.Model.Person;

import java.util.ArrayList;

public class CustomArrayAdapter<T> extends ArrayAdapter {

    public CustomArrayAdapter(Context context, int resource, ArrayList<Person> data) {
        super(context, resource,data);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=((MainActivity)getContext()).getLayoutInflater();
        View view=inflater.inflate(R.layout.list_distribution, null);

        Person p=(Person)getItem(position);
        ((TextView)view.findViewById(R.id.descriptionView)).setText(p.getDescription());
        ((TextView)view.findViewById(R.id.nameView)).setText(String.valueOf(p.getName()));

        return view;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }
}
