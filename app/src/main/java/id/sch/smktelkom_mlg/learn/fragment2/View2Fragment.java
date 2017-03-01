package id.sch.smktelkom_mlg.learn.fragment2;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class View2Fragment extends Fragment {
    IListener mListener;

    public View2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_view2, container, false);
        view.findViewById(R.id.buttonPromo)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mListener.toPromoPage();
                    }
                });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof View2Fragment.IListener) {
            mListener = (View2Fragment.IListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement View2Fragment.IListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    interface IListener {
        void toPromoPage();
    }

}
