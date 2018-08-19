package sukem.com.intentdemodiplomaincometx;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView sampleTv;
    private RelativeLayout homeLayoutRl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();
    }

    private void initView() {
        sampleTv = findViewById(R.id.activity_home_sample_tv);
        homeLayoutRl = findViewById(R.id.activity_home_rl);

        sampleTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.activity_home_sample_tv:
                changeTextColor();
                break;
        }
    }

    private void changeTextColor() {

        Random random = new Random();
        int color = Color.argb(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(256));
        int bgColor = Color.argb(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(256));
        sampleTv.setTextColor(color);
        homeLayoutRl.setBackgroundColor(bgColor);

//        int color = Color.argb(128, 255, 165, 210);

    }
}
