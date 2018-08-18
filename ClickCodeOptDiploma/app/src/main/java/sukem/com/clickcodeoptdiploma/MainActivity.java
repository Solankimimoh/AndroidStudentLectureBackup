package sukem.com.clickcodeoptdiploma;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
        , View.OnLongClickListener {


    private Button plusBtn;
    private Button minusBtn;
    private TextView nameTv;
    private float textSize;
    private EditText nameEd;

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
        nameEd = findViewById(R.id.activity_main_name_ed);

        textSize = nameTv.getTextSize();
        nameTv.setTextSize(textSize);


        //        listener init
        plusBtn.setOnClickListener(this);
        minusBtn.setOnClickListener(this);
        minusBtn.setOnLongClickListener(this);
        final String greeting = getString(R.string.greeting);
        nameTv.setText(R.string.greeting);


    }

    private void replaceString() {
        final String greeting = getString(R.string.greeting);
        nameTv.setText(R.string.greeting);


        nameTv.setText(greeting.replace("yash", nameEd.getText().toString()));


    }


    @Override
    public void onClick(View v) {

        Log.e("TAG", v.getId() + "");

        switch (v.getId()) {
            case R.id.activity_main_plus_btn:
                replaceString();
//                increaseTextSize();
                break;

            case R.id.activity_main_minus_btn:
                decreaseTextSize();
                break;
        }

    }


    private void increaseTextSize() {

        Random random = new Random();
        int color = Color.argb(random.nextInt(256), random.nextInt(256), random.nextInt(256), random.nextInt(256));
        nameTv.setTextColor(color);

        textSize++;
        nameTv.setTextSize(textSize);


    }

    private void decreaseTextSize() {
        textSize--;
        nameTv.setTextSize(textSize);
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
        return true;
    }
}
