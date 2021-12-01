package mautz.nathan.aadfinaldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import mautz.nathan.aadfinaldemo.placeholder.Fragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button frag1 = findViewById(R.id.fragOneButton);
        Button frag2 = findViewById(R.id.fragTwoButton);



        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment frag = getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);

                getSupportFragmentManager().beginTransaction().remove(frag).commitNow();
                Fragment fragment = new InfoPanelFragment();


                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, fragment).commit();



            }
        });

        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment frag = getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);

                getSupportFragmentManager().beginTransaction().remove(frag).commitNow();
                Fragment fragment = new Fragment2();


                getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, fragment).commit();

            }
        });



        Fragment fragment = new InfoPanelFragment();
        Fragment fragment2 = new Fragment2();


        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, fragment).commitNow();


        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);

        getSupportFragmentManager().beginTransaction().remove(frag).commitNow();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, fragment2).commit();




    }
}