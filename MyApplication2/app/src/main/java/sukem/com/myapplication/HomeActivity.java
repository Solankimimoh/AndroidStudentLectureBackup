package sukem.com.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("ShowToast")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        Toast.makeText(HomeActivity.this,"onCreateMethod",Toast.LENGTH_LONG);
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MAINACTIVITY","OnResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MAINACTIVITY","OnPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MAINACTIVITY","OnStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MAINACTIVITY","OnRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MAINACTIVITY","OnDestroy");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MAINACTIVITY","Onstart");

    }

}

