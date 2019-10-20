package ro.ase.eu.damapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    //adaugam meniul
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
         //aici adaug meniul prima data il creez in xml si apoi il adaug aici
        //aem obiectul aa menu, este instantiat si acum doar ii atasam resursa.
        //ma folosesc de o clasa intermediara numita menuInflater
        getMenuInflater().inflate(R.menu.app_main_menu, menu);
         return true;
    }
}
