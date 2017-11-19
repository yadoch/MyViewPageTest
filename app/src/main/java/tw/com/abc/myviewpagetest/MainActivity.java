package tw.com.abc.myviewpagetest;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String TAG="geoff";
    private Page1 page1;
    private Page2 page2;
    private Page3 page3;
    private Page4 page4;
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        page1 = new Page1();
        page2 = new Page2();
        page3 = new Page3();
        page4 = new Page4();

        fmgr = getSupportFragmentManager();
        tran = fmgr.beginTransaction();
        tran.add(R.id.container, page1);

        tran.commit();
    }

    public void gotoPage1(View view) {
        Log.i(TAG, "gotoPage1: ");
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, page1);
        tran.commit();
    }
    public void gotoPage2(View view) {
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, page2);
        tran.commit();
    }
    public void gotoPage3(View view) {
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, page3);
        tran.commit();
    }
    public void gotoPage4(View view) {
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, page4);
        tran.commit();
    }
}
