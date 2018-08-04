
package sukem.com.activitylifecycledemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class HelloActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);
        Log.e("MAINACTIVITY","onCreate");
        Toast.makeText(HelloActivtiy.this, "Message", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MAINACTIVITY","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MAINACTIVITY","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MAINACTIVITY","onPause");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MAINACTIVITY","onStop");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MAINACTIVITY","onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MAINACTIVITY","onRestart");


    }


}
