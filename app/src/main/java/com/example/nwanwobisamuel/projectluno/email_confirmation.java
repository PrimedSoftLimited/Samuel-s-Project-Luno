package com.example.nwanwobisamuel.projectluno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class email_confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_confirmation);

        configureConfirmedEmail();
    }

    private void configureConfirmedEmail(){
        Button confirmedEmail = (Button) findViewById(R.id.btn8);
        confirmedEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(email_confirmation.this, welcome.class));
            }
        });
    }
}
