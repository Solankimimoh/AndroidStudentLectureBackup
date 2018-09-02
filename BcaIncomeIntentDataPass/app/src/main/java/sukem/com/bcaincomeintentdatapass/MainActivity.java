package sukem.com.bcaincomeintentdatapass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userNameEd;
    private EditText userPasswordEd;
    private Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

//        component init
        userNameEd = findViewById(R.id.activity_main_username_ed);
        userPasswordEd = findViewById(R.id.activity_main_password_ed);
        submitBtn = findViewById(R.id.activity_main_submit_btn);

//        listener init
        submitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.activity_main_submit_btn:
                loginUser();
                break;
        }
    }

    private void loginUser() {

        final String userName = userNameEd.getText().toString().trim();
        final String userPassword = userPasswordEd.getText().toString().trim();


        if (userName.isEmpty() || userPassword.isEmpty()) {
            Toast.makeText(this, "Please Fill the details", Toast.LENGTH_SHORT).show();
        } else {
            final Intent gotoSecondActivity = new Intent(MainActivity.this, SecondActivity.class);
            gotoSecondActivity.putExtra("KEY_USERNAME", userName);
            gotoSecondActivity.putExtra("KEY_PASSWORD", userPassword);
            startActivity(gotoSecondActivity);

        }


    }
}
