package com.example.jorge.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void giveTip(View view) {
        EditText amountEdit = (EditText) findViewById(R.id.howmuchView);
        String amountString = amountEdit.getText().toString();
        double amountPaid = Integer.parseInt(amountString);
//        Toast.makeText(this, amountString, Toast.LENGTH_SHORT).show();

        CheckBox tenBox = (CheckBox) findViewById(R.id.tenBox);
        CheckBox fifteenBox = (CheckBox) findViewById(R.id.fifteenBox);
        CheckBox twentyBox = (CheckBox) findViewById(R.id.twentyBox);

        double amountToTip;
        EditText tipEdit = (EditText) findViewById(R.id.tipLocation);

        if(tenBox.isChecked()){
            amountToTip = amountPaid*0.10;
            tipEdit.setText(String.valueOf(amountToTip));
        } else if (fifteenBox.isChecked()){
            amountToTip = amountPaid*0.15;
            tipEdit.setText(String.valueOf(amountToTip));
        } else if (twentyBox.isChecked()){
            amountToTip = amountPaid*0.20;
            tipEdit.setText(String.valueOf(amountToTip));
        } else {
            Toast.makeText(this,"You didn't pick a checkbox", Toast.LENGTH_SHORT).show();
        }
    }
}
