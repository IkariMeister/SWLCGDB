package es.elvalledeljedi.swlcgdb.firebase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.elvalledeljedi.swlcgdb.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.message) TextView mTextMessage;
    @BindView(R.id.navigation) BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);
//        mOnNavigationItemSelectedListener
//                = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.navigation_home:
//                        mTextMessage.setText(R.string.title_home);
//                        return true;
//                    case R.id.navigation_dashboard:
//                        mTextMessage.setText(R.string.title_dashboard);
//                        return true;
//                    case R.id.navigation_notifications:
//                        mTextMessage.setText(R.string.title_notifications);
//                        return true;
//                }
//                return false;
//            }
//
//        };
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
