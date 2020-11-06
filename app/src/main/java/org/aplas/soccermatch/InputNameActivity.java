package org.aplas.soccermatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputNameActivity extends AppCompatActivity {

    private EditText etInputName;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name);

        etInputName = findViewById(R.id.et_input_name);
        btnStart = findViewById(R.id.btn_start);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InputNameActivity.this, MainActivity.class));

                Toast.makeText(
                        InputNameActivity.this,
                        String.format("Selamat Bermain %s", etInputName.getText().toString()),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
