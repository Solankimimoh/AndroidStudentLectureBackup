package sukem.com.onclickoptmaninagar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView sampleTv;
    private Button increaseSizeBtn;
    private Button decreaseSizeBtn;
    private Button redBgBtn;
    private Button greenBgBtn;
    private Button blueBgBtn;
    private float textSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        //init compo
        sampleTv = findViewById(R.id.activity_main_sample_tv);
        increaseSizeBtn = findViewById(R.id.activity_main_increase_btn);
        decreaseSizeBtn = findViewById(R.id.activity_main_decrease_btn);
        redBgBtn = findViewById(R.id.activity_main_red_btn);
        greenBgBtn = findViewById(R.id.activity_main_green_btn);
        blueBgBtn = findViewById(R.id.activity_main_blue_btn);


        increaseSizeBtn.setOnClickListener(this);
        decreaseSizeBtn.setOnClickListener(this);


        textSize = sampleTv.getTextSize();
        sampleTv.setText(textSize + "");
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.activity_main_increase_btn:
                increaseSize();
                break;

            case R.id.activity_main_decrease_btn:
                decreaseSize();
                break;

            case R.id.activity_main_red_btn:

                break;

            case R.id.activity_main_green_btn:
                break;

            case R.id.activity_main_blue_btn:
                break;

        }


    }

    private void decreaseSize() {
        textSize--;
        sampleTv.setTextSize(textSize);
        sampleTv.setText(textSize + "");

    }

    private void increaseSize() {
        textSize++;
        sampleTv.setTextSize(textSize);
        sampleTv.setText(textSize + "");


        Random random = new Random();
        int color = Color.argb(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(256));
//        int color = Color.argb(, 128, 128, 128);
        sampleTv.setTextColor(color);


    }
}
