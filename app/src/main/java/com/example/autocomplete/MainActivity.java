package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------------CREACIÓN DEL AUTCOMPLETE----------------

        String[] datos = { "Los Angeles Lakers", "Chicago Bulls", "Golden State Warriors", "Boston Celtics", "Detroit Pistons", "Miami Heat", "New York Knicks", "Washington Wizards"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, datos);

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.AutoComplete1);

        // Se establece el Adapter
        textView.setAdapter(adapter);

        textView.addTextChangedListener(this);

        //---------------CREACIÓN DEL SPINNER----------------

        final Spinner spinner = (Spinner)findViewById(R.id.spinner1);

        List<String> lista_elementos = new ArrayList<String>();

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista_elementos);

        spinner.setAdapter(adapter2);


    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
