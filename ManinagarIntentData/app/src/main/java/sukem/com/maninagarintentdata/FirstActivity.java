package sukem.com.maninagarintentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText personNameEd;
    private EditText personPasswordEd;
    private Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initView();

    }

    private void initView() {

        personNameEd = findViewById(R.id.activity_first_username_ed);
        personPasswordEd = findViewById(R.id.activity_first_password_ed);
        submitBtn = findViewById(R.id.activity_first_submit_btn);

        submitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.activity_first_submit_btn:
                userLogin();
                break;

        }

    }

    private void userLogin() {
        final String username = personNameEd.getText().toString().trim();
        final String userpassword = personPasswordEd.getText().toString().trim();

        if (username.isEmpty() || userpassword.isEmpty()) {
            Toast.makeText(this, "Please fill the details", Toast.LENGTH_SHORT).show();
        } else {
            if (userpassword.length() < 6) {
                Toast.makeText(this, "Require 6 letter passowrd", Toast.LENGTH_SHORT).show();
            } else {
                final Intent gotoSecondActivity = new Intent(FirstActivity.this, SecondActivity.class);
                gotoSecondActivity.putExtra("KEY_USERNAME", username);
                gotoSecondActivity.putExtra("KEY_USERPASSWORD", userpassword);
                startActivity(gotoSecondActivity);
            }
        }
    }



}
