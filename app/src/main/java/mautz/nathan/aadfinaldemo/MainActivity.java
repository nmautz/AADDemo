package mautz.nathan.aadfinaldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.widget.TextView;

import mautz.nathan.aadfinaldemo.placeholder.Fragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Fragment fragment = new InfoPanelFragment();
        Fragment fragment2 = new Fragment2();


        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, fragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, fragment2).commit();


        Fragment frag = getSupportFragmentManager().getFragments().get(0);
       // getSupportFragmentManager().beginTransaction().remove(frag);



    }
}