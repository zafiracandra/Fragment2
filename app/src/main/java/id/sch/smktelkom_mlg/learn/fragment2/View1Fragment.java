package id.sch.smktelkom_mlg.learn.fragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class View1Fragment extends Fragment {
    private static final String ARG_IMAGE = "image";
    private static final String ARG_TEXT = "text";

    private int mImage;
    private String mText;

    private ImageView ivImage;
    private TextView tvText;

    public View1Fragment() {
        // Required empty public constructor
    }

    public static View1Fragment newInstance(int image, String text) {
        View1Fragment fragment = new View1Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_IMAGE, image);
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImage = getArguments().getInt(ARG_IMAGE);
            mText = getArguments().getString(ARG_TEXT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view1, container, false);
        ivImage = (ImageView) view.findViewById(R.id.imageView);
        tvText = (TextView) view.findViewById(R.id.textView);

        ivImage.setImageResource(mImage);
        tvText.setText(mText);

        return view;
    }

}
