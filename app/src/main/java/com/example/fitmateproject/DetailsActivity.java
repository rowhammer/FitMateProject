package com.example.fitmateproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DetailsActivity extends AppCompatActivity {

    private EditText name;
    private EditText age;
    private EditText height;
    private EditText weight;
    private EditText blood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button submitBtn = findViewById(R.id.sumbitBtn);
        name = findViewById(R.id.nameEdit);
        age = findViewById(R.id.ageEdit);
        height = findViewById(R.id.heightEdit);
        weight = findViewById(R.id.weightEdit);
        blood = findViewById(R.id.bloodEdit);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String uName = name.getText().toString().trim();
                final String uAge = age.getText().toString().trim();
                final String uHeight = height.getText().toString().trim();
                final String uWeight = weight.getText().toString().trim();
                final String uBlood = blood.getText().toString().trim();
                DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("data").push();
                Map<String, Object> map = new HashMap<>();
                map.put("id", Objects.requireNonNull(databaseReference.getKey()));
                map.put("real_name", uName);
                map.put("age", uAge);
                map.put("height", uHeight);
                map.put("weight", uWeight);
                map.put("ideal_weight", uBlood);
                databaseReference.setValue(map);
                Toast.makeText(DetailsActivity.this, "Data updated!", Toast.LENGTH_LONG).show();
                onBackPressed();
            }
        });
    }
}
