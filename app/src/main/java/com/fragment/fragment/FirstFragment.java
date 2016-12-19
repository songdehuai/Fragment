package com.fragment.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fragment.MainActivity;
import com.fragment.R;

/**
 * Created by songdehuai on 2016/12/19.
 */

public class FirstFragment extends Fragment {


    public FirstFragment(int imageRes) {
        this.imageRes = imageRes;
    }

    ImageView image;
    int imageRes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_first, null);
        init(view);
        return view;
    }


    void init(View view) {
        image = (ImageView) view.findViewById(R.id.fragment_first_iamge);
        image.setImageResource(imageRes);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });

    }

}
