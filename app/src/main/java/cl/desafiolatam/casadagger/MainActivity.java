package cl.desafiolatam.casadagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.desafiolatam.casadagger.model.Casa;
import cl.desafiolatam.casadagger.model.Habitaciones;
import cl.desafiolatam.casadagger.model.Puertas;
import cl.desafiolatam.casadagger.model.Ventanas;

public class MainActivity extends AppCompatActivity {
    private Casa casa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent component = DaggerAppComponent.create();
        casa = component.getCasa();
        casa.construir();

    }
}