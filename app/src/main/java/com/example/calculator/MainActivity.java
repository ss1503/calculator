package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton$InspectionCompanion;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText edt;
    public Button plusBtn, minusBtn, mulBtn, divBtn, creditBtn, clearBtn, answerBtn;

    public double finalAnswer = 0;
    public double num = 0, num2 = 0;
    public String op = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.answerEtxt);
        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);
        clearBtn = findViewById(R.id.clearBtn);
        answerBtn = findViewById(R.id.equalBtn);

        creditBtn = findViewById(R.id.creditBtn);
    }


    public void plus(View view) {
        if(op.equals("=") && edt.getText().toString().trim().length() > 0)
        {
            Toast.makeText(this, "ignored the number put another with the same opertion", Toast.LENGTH_SHORT).show();
        }

        try{
            String st = edt.getText().toString();

            if(op.equals(" "))
            {
                num = Double.parseDouble(st);
            }
            else
            {
                num2 = Double.parseDouble(st);
                calc();
                finalAnswer = num;
            }
            op = "+";
            edt.setHint(num + "+");

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        edt.getText().clear();
    }

    public void minus(View view) {
        if(op.equals("=") && edt.getText().toString().trim().length() > 0)
        {
            Toast.makeText(this, "ignored the number put another with the same opertion", Toast.LENGTH_LONG).show();
        }

        try{
            String str = edt.getText().toString();

            if(op.equals(" "))
            {
                num = Double.parseDouble(str);
            }
            else
            {
                num2 = Double.parseDouble(str);
                calc();
                finalAnswer = num;
            }
            op = "-";
            edt.setHint(num + "-");

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        edt.getText().clear();
    }

    public void mul(View view) {
        if(op.equals("=") && edt.getText().toString().trim().length() > 0)
        {
            Toast.makeText(this, "ignored the number put another with the same opertion", Toast.LENGTH_LONG).show();
        }

        try {
            String st = edt.getText().toString();

            if(op.equals(" "))
            {
                num = Double.parseDouble(st);
            }
            else
            {
                num2 = Double.parseDouble(st);
                calc();
                finalAnswer = num;
            }
            op = "*";
            edt.setHint(num + "*");

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        edt.getText().clear();
    }

    public void div(View view) {
        if(op.equals("=") && edt.getText().toString().trim().length() > 0)
        {
            Toast.makeText(this, "ignored the number put another with the same opertion", Toast.LENGTH_LONG).show();
        }

        try {
            String st = edt.getText().toString();

            if(op.equals(" "))
            {
                num = Double.parseDouble(st);
            }
            else
            {
                num2 = Double.parseDouble(st);
                calc();
                finalAnswer = num;
            }

            op = "/";
            edt.setHint(num + "/");
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        edt.getText().clear();

    }

    public void equal(View view) {

        try {
            String st = edt.getText().toString();


            num2 = Double.parseDouble(st);

            calc();
            finalAnswer = num;

            edt.getText().clear();
            edt.setHint(" " + finalAnswer);

        }
        catch (Exception e)
        {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        op = "=";
    }

    public void clear(View view) {
        num = 0;
        op = " ";
        edt.getText().clear();
        edt.setHint("Insert here");
    }

    public void credits(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("answer", finalAnswer);
        startActivity(si);
    }

    public void calc()
    {
        if(op.equals("+"))
        {
            num = num + num2;
        }
        else if(op.equals("-"))
        {
            num = num - num2;
        }
        else if(op.equals("*"))
        {
            num = num * num2;
        }
        else if(op.equals("/"))
        {
            num = num / num2;
        }
    }
}