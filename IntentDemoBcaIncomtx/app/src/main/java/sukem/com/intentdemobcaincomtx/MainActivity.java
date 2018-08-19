package sukem.com.intentdemobcaincomtx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button gotoActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        gotoActivityBtn = findViewById(R.id.activity_main_goto_btn);


        gotoActivityBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_goto_btn:
                gotoHomeActivity();
                break;
        }
    }

    private void gotoHomeActivity() {

        final Intent gotoHomeActivity = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(gotoHomeActivity);
    }
}
