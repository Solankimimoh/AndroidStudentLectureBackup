package sukem.com.intenetdatapassdiploma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginBtn;
    private EditText emailEd;
    private EditText passwordEd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        emailEd = findViewById(R.id.activity_main_email_ed);
        passwordEd = findViewById(R.id.activity_main_pwd_ed);
        loginBtn = findViewById(R.id.activity_main_login_btn);


        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.activity_main_login_btn:
                authUser();
                break;
        }
    }

    private void authUser() {

        final String email = emailEd.getText().toString().trim();
        final String password = passwordEd.getText().toString().trim();


        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Enter Details", Toast.LENGTH_SHORT).show();
        } else {
            final Intent gotoHomeActivity = new Intent(MainActivity.this, HomeActivity.class);
            gotoHomeActivity.putExtra("KEY_EMAIL", email);
            gotoHomeActivity.putExtra("KEY_PWD", password);
            startActivity(gotoHomeActivity);
        }
    }
}
