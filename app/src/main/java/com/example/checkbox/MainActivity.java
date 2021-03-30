package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza,burger,cofee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza=findViewById(R.id.pizza);
        burger=findViewById(R.id.burger);
        cofee=findViewById(R.id.cofee);
    }

    public void openCheckedActivity(View view) {
        int total=0;
        if(pizza.isChecked()){
            total +=100;
            Toast.makeText(this,"Pizza is checked for Rs 100",Toast.LENGTH_SHORT).show();
        }
        if(burger.isChecked()){
            total +=120;
            Toast.makeText(this,"Burger is checked for Rs 120",Toast.LENGTH_SHORT).show();
        }
        if(cofee.isChecked()){
            total +=80;
            Toast.makeText(this,"Cofee is checked for Rs 80 ",Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this,"Your final payment is " +total,Toast.LENGTH_SHORT).show();

    }
}