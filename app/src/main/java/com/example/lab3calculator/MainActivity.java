package com.example.lab3calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.view.Menu;
public class MainActivity extends AppCompatActivity {

    TextView resultText;
    private enum Operator {none, add, sub, mul, div, eq, clear, dot}
    private double value1=0, value2 = 0;

    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void btn00Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "1");
    }

    public void btn01Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "1");
    }

    public void btn02Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "2");
    }

    public void btn03Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "3");
    }

    public void btn04Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "4");
    }

    public void btn05Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "5");
    }

    public void btn06Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "6");
    }

    public void btn07Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "7");
    }

    public void btn08Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "8");
    }

    public void btn09Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultText);
        eText.setText(eText.getText() + "9");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        EditText eText = (EditText) findViewById(R.id.resultText);
        value1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.sub;
        EditText eText = (EditText) findViewById(R.id.resultText);
        value1 = Double.parseDouble(eText.getText().toString());
        eText.setText("-");
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.mul;
        EditText eText = (EditText) findViewById(R.id.resultText);
        value1 = Double.parseDouble(eText.getText().toString());
        eText.setText("X");
    }

    public void btnDivideClick(View view) {
        optr = Operator.div;
        EditText eText = (EditText) findViewById(R.id.resultText);
        value1 = Double.parseDouble(eText.getText().toString());
        eText.setText("/");
    }

    public void btnClearClick(View view) {
        optr = Operator.clear;
        EditText eText = (EditText) findViewById(R.id.resultText);
        value1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDotClick(View view) {
        optr = Operator.dot;
        EditText eText = findViewById(R.id.resultText);
        value1 = Double.parseDouble(eText.getText().toString());
        eText.setText(".");
    }

    public void btnResultClick(View view) {
        if (optr != Operator.none) {
            EditText eText = findViewById(R.id.resultText);
            //data1 = Double.parseDouble(eText.getText().toString());
            value2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = value1 + value2;
            } else if (optr == Operator.sub) {
                result = value1 - value2;
            } else if (optr == Operator.mul) {
                result = value1 * value2;
            } else if (optr == Operator.div) {
                result = value1 / value2;}
            optr = Operator.none;
            value1 = result;
            if ((result - (int) result) != 0)
                eText.setText(String.valueOf(result));
            else
                eText.setText(String.valueOf((int) result));
        }
    }


}