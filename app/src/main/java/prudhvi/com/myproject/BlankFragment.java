package prudhvi.com.myproject;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    ViewPager viewPager;
    DotsIndicator dot1;
    SpringDotsIndicator dot2;
    WormDotsIndicator dot3;
    ViewAdapter viewAdapter;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        initviews(view);
        viewPager.setAdapter(viewAdapter);
        dot1.setViewPager(viewPager);
        dot2.setViewPager(viewPager);
        dot3.setViewPager(viewPager);
        return view;
    }
    private void initviews(View v) {
        viewPager=v.findViewById(R.id.viewpager);
        dot1=v.findViewById(R.id.Dot1);
        dot2=v.findViewById(R.id.Dot2);
        dot3=v.findViewById(R.id.Dot3);
    }
}
