package sukem.com.intentdemomaninagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button gotoSecondActivityBtn;
    private TextView firstActivityTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {


        firstActivityTv = findViewById(R.id.activity_main_first_tv);
        gotoSecondActivityBtn = findViewById(R.id.activity_main_secondactivity_btn);


        gotoSecondActivityBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.activity_main_secondactivity_btn:
                gotoSecondActivity();
                break;
        }
    }

    private void gotoSecondActivity() {

        Intent gotoSecondActivity = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(gotoSecondActivity);

    }


}
