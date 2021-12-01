package mautz.nathan.aadfinaldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentContainerView fragmentContainerView = findViewById(R.id.fragment_container_view);
        TextView infoTextView = fragmentContainerView.findViewById(R.id.infoTextView);
        infoTextView.setText("Yoods");


    }
}