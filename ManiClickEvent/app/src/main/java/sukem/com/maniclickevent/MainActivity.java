package sukem.com.maniclickevent;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//    private Button redBtn;
//    private Button greenBtn;
//    private Button blueBtn;
//    private RelativeLayout activityMainRl;


    private EditText nameEd;
    private TextView nameTv;
    private Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTv = findViewById(R.id.activity_main_name_tv);
        nameEd = findViewById(R.id.activity_main_name_ed);
        loginBtn = findViewById(R.id.activity_main_login_btn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, nameEd.getText().toString(), Toast.LENGTH_SHORT).show();
                nameTv.setText(nameEd.getText().toString());
            }
        });

//
//        redBtn = findViewById(R.id.activity_main_red_btn);
//        greenBtn = findViewById(R.id.activity_main_green_btn);
//        blueBtn = findViewById(R.id.activity_main_blue_btn);
//        activityMainRl = findViewById(R.id.activity_main_rl);
//
//
//        redBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activityMainRl.setBackgroundColor(Color.RED);
//            }
//        });
//
//
//        greenBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activityMainRl.setBackgroundColor(Color.GREEN);
//            }
//        });
//
//
//        blueBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activityMainRl.setBackgroundColor(Color.BLUE);
//            }
//        });
//

//        emailTv = findViewById(R.id.activity_main_email_tv);
//
//        activityMainRl.setBackgroundColor(Color.RED);


//        String name = nameTv.getText().toString();
//        String email = emailTv.getText().toString();
//
//
//        Toast.makeText(MainActivity.this, name + "  ---  " + email, Toast.LENGTH_LONG).show();

//        nameTv.setText("THIS IS MESSAGE FROM ANDROID");
//        nameTv.setTextSize(25);
//        nameTv.setTextColor(Color.WHITE);
//        nameTv.setBackgroundColor(Color.BLACK);
//

    }

}
