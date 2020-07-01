package com.example.navig.ui.tech;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.navig.R;

public class TechFragment extends Fragment {

    private TechViewModel techViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        techViewModel =
//                ViewModelProviders.of(this).get(TechViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tech, container, false);
//        final TextView textView = root.findViewById(R.id.text_tech);
//        techViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
