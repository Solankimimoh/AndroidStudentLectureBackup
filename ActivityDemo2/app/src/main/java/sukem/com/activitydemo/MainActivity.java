package sukem.com.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e("MAINACTIVITY LIFE", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MAINACTIVITY LIFE", "onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MAINACTIVITY LIFE", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MAINACTIVITY LIFE", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MAINACTIVITY LIFE", "onStop");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MAINACTIVITY LIFE", "onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MAINACTIVITY LIFE", "onRestart");

    }

}
