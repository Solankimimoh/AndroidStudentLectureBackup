package sukem.com.clickcodeoptdiploma;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button plusBtn;
    private Button minusBtn;
    private TextView nameTv;
    private float textSize;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        //    comp init
        plusBtn = findViewById(R.id.activity_main_plus_btn);
        minusBtn = findViewById(R.id.activity_main_minus_btn);
        nameTv = findViewById(R.id.activity_main_name_tv);

        textSize = nameTv.getTextSize();
        nameTv.setTextSize(textSize);

        //        listener init
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Log.e("TAG", v.getId() + "");

        switch (v.getId()) {
            case R.id.activity_main_plus_btn:
                increaseTextSize();
                break;

            case R.id.activity_main_minus_btn:
                decreaseTextSize();
                break;
        }

    }



    private void increaseTextSize() {
        textSize++;
        nameTv.setTextSize(textSize);

    }

    private void decreaseTextSize() {
        textSize--;
        nameTv.setTextSize(textSize);
    }
}
