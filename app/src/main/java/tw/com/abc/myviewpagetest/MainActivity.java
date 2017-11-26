package tw.com.abc.myviewpagetest;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String TAG="geoff";
    private Page1 page1;
    private Page2 page2;
    private Page3 page3;
    private Page4 page4;
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private ViewPager viewPager;
    private Fragment[] fragments;
    //private Resources res;
    TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.container);
        mesg = (TextView)findViewById(R.id.mesg);
        //res = getResources();

        page1 = new Page1();
        page2 = new Page2();
        page3 = new Page3();
        page4 = new Page4();
        fragments = new Fragment[]{page1,page2,page3,page4};


        fmgr = getSupportFragmentManager();
//        tran = fmgr.beginTransaction();
//        tran.add(R.id.container, page1);
//
//        tran.commit();
        viewPager.setAdapter(new  MyPagerAdapter(fmgr));
        viewPager.setCurrentItem(0);
    }

    public void gotoPage1(View view) {
        Log.i(TAG, "gotoPage1: ");
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page1);
//        tran.commit();

        //ViewPager 時改用此方法呼叫換頁功能
        viewPager.setCurrentItem(0);
    }
    public void gotoPage2(View view) {
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page2);
//        tran.commit();
        viewPager.setCurrentItem(1);
    }
    public void gotoPage3(View view) {
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page3);
//        tran.commit();
        viewPager.setCurrentItem(2);
    }
    public void gotoPage4(View view) {
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page4);
//        tran.commit();
        viewPager.setCurrentItem(3);
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {
        // 建構子重點:由ViewPager交給 Fragments 處理畫面
        public MyPagerAdapter(FragmentManager fmgr) {
            super(fmgr);
        }

        @Override
        public Fragment getItem(int position) {
            //      傳回被選取陣列
            return fragments[position];
            //return null;
        }

        @Override
        public int getCount() {
            //取得陣列長度
            return fragments.length;
            //return 0;
        }
    }
}
