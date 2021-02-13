package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtInputNumber;
    private Button btnConvert;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtInputNumber=findViewById(R.id.input_value);
        btnConvert = findViewById(R.id.btn_convert);
        txtResult = findViewById(R.id.result);
        txtResult.setVisibility(View.GONE);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtInputNumber != null && edtInputNumber.getText() != null && edtInputNumber.getText().length()>0){
                    String number = edtInputNumber.getText().toString();
                    // c = 5/9 * (f - 32)
                    Double result =((0.5555555555555) * (Double.valueOf(number) - 32));
                    txtResult.setText(String.valueOf(result));
                    txtResult.setVisibility(view.VISIBLE);
                    Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}