package com.example.jjuarez.englishmetricconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double millimeterMultiple = 25.4;
    double centimeterMultiple = 10;
    double meterMultiple = 15;

    double inputNum;
    double convertedNum;

    int groupChoice = 1;
    String groupChoiceString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputOne = (EditText) findViewById(R.id.txtInput);
        final Spinner group = (Spinner) findViewById(R.id.txtGroup);
        Button convert = (Button) findViewById(R.id.btnConvert);

        convert.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v) {
                inputNum = Integer.parseInt(inputOne.getText().toString());
                groupChoiceString = group.getSelectedItem().toString();
                //groupChoice = Integer.parseInt(group.getSelectedItem().toString());

                convertedNum = millimeterMultiple * inputNum;

                DecimalFormat decimal = new DecimalFormat("###,###.##");
                result.setText(inputNum + " inches is " + decimal.format(convertedNum) + " " + groupChoiceString);
                }

        });
    }
}
