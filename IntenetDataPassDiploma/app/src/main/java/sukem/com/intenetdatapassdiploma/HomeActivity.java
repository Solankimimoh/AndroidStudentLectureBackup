package sukem.com.intenetdatapassdiploma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView emailTv;
    private TextView pwdTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();

        final Intent getData = getIntent();

        final String email = getData.getStringExtra("KEY_EMAIL");
        final String password = getData.getStringExtra("KEY_PWD");

        emailTv.setText(email);
        pwdTv.setText(password);


    }

    private void initView() {
        emailTv = findViewById(R.id.activity_home_email_tv);
        pwdTv = findViewById(R.id.activity_home_pwd_tv);
    }
}
