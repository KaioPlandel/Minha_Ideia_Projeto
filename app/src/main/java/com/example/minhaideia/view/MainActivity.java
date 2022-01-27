package com.example.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.minhaideia.R;
import com.example.minhaideia.core.AppUtil;

public class MainActivity extends AppCompatActivity {


    private TextView editNome,editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editEmail = findViewById(R.id.editEmail);

        Log.i(AppUtil.TAG, "Tela princípal iniciada");

        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("nome");
        String email = bundle.getString("email");

        editNome.setText("Bem vindo..." + nome);
        editEmail.setText(email);
    }
}