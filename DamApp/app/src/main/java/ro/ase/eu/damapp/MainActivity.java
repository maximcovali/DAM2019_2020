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



    //suprascriem metoda super apeleazaa clasa de baza
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        //folosesc inflaters petnru ca am o metoda deja createa (menu)
        //inflater ataseaza o parte de java la o parte de xml
        getMenuInflater().inflate(R.menu.app_main_menu, menu);

        return true;
    }
}
