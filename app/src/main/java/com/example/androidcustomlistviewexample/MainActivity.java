package com.example.androidcustomlistviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.androidcustomlistviewexample.Model.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Person> persons= new ArrayList<>();
        persons.add(new Person("Javier","Funny and friendly guy"));
        persons.add(new Person("Seniorglez","Best coder EU"));
        persons.add(new Person("Carla","CUZ I'M NOT"));

        CustomArrayAdapter<Person> customArrayAdapter = new CustomArrayAdapter<>(this,R.layout.list_distribution,persons);

        ((ListView)findViewById(R.id.list)).setAdapter(customArrayAdapter);

        ((Spinner)findViewById(R.id.spinner)).setAdapter(customArrayAdapter);

    }

}
