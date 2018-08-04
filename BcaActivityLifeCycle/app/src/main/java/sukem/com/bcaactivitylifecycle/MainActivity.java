package sukem.com.bcaactivitylifecycle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String str = "THIS IS MY MESSAGE";
//
//        Toast.makeText(MainActivity.this,
//                str,
//                Toast.LENGTH_LONG).
//                show();
//
//

        Log.e("LIFECYCLE","onCreate");



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LIFECYCLE","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LIFECYCLE","onResume");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LIFECYCLE","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LIFECYCLE","onStop");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LIFECYCLE","onDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("LIFECYCLE","onRestart");
    }


}
