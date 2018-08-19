package sukem.com.intentdemodiplomaincometx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userNameEd;
    private EditText userEmailEd;
    private EditText userMobileEd;
    private Button profileSubmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {

        userNameEd = findViewById(R.id.activity_main_username_ed);
        userEmailEd = findViewById(R.id.activity_main_email_ed);
        userMobileEd = findViewById(R.id.activity_main_mobile_ed);
        profileSubmitBtn = findViewById(R.id.activity_main_submit_btn);


        profileSubmitBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.activity_main_submit_btn:
                registerUser();
                break;
        }
    }

    private void registerUser() {

        final String userName = userNameEd.getText().toString().trim();
        final String userEmail = userEmailEd.getText().toString().trim();
        final String usermobile = userMobileEd.getText().toString().trim();

//        Toast.makeText(this, "" + userName + " | "
//                + userEmail + " | "
//                + usermobile, Toast.LENGTH_SHORT).show();

        Intent gotoHomeActivity = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(gotoHomeActivity);


    }


}
