package tw.com.abc.myviewpagetest;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




/**
 * A simple {@link Fragment} subclass.
 */
public class Page1 extends Fragment {
    private MainActivity activity;
    private Resources res;
    private  String TAG ="geoff";
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity = (MainActivity) context;
       // activity.mesg.setText("Hello Geoff!!");
        activity.mesg.setText("From Page1");
        res = context.getResources();
        Log.i(TAG, "onAttach: Page1");
    }

    public Page1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.page1, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: Page1");
    }
}
