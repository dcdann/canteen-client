package org.acm.nitsurat.digitalcanteen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class NorthIndianF extends Fragment {

    private RecyclerView recyclerView;

    String[] NI_Items = {"Samosa", "Kachori", "Chole Bhature", "Poha"};
    String[] Price = {"10", "15", "20", "10"};
    int[] Icons = {R.drawable.favorite,R.drawable.favorite,R.drawable.favorite,R.drawable.favorite};


    public NorthIndianF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_food_items, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);

        StaggeredGridLayoutManager staggeredGridLayoutManagerVertical = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManagerVertical);

        ItemsAdapter myDataAdapter = new ItemsAdapter(getActivity(),NI_Items,Price,Icons);

        recyclerView.setAdapter(myDataAdapter);



        return rootView;

    }

}
