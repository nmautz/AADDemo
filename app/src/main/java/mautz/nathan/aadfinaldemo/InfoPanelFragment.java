package mautz.nathan.aadfinaldemo;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfoPanelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfoPanelFragment extends Fragment {


    private TextView mTextView;

    public InfoPanelFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InfoPanelFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InfoPanelFragment newInstance(String param1, String param2) {
        InfoPanelFragment fragment = new InfoPanelFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public void setText(String text)
    {
        mTextView.setText(text);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info_panel, container, false);
        mTextView = view.findViewById(R.id.infoTextView);
        return view;
    }
}