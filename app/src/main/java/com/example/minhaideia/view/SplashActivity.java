package com.example.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import com.example.minhaideia.R;
import com.example.minhaideia.controller.ClienteController;
import com.example.minhaideia.core.AppUtil;
import com.example.minhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {
    private int tempoEspera = 1000 * 5;
    private TextView versaoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        versaoApp = findViewById(R.id.versaoApp);

        versaoApp.setText(AppUtil.versaoAplicativo());

        trocarTela();
    }

    private void trocarTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Cliente cliente = new Cliente("kaio", "kaio@gmail.com",
                        "99999999", 26, true);

                Log.i(AppUtil.TAG, "Tela Splash iniciada");
                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", cliente.getNome());
                bundle.putString("email", cliente.getEmail());
                trocarDeTela.putExtras(bundle);
                startActivity(trocarDeTela);
            }
        }, tempoEspera);


    }
}