package sukem.com.maninagarintentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView userNameTv;
    private TextView userPasswordTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initView();
        final Intent getData = getIntent();

        final String username = getData.getStringExtra("KEY_USERNAME");
        final String userpassword = getData.getStringExtra("KEY_USERPASSWORD");


        userNameTv.setText(username);
        userPasswordTv.setText(userpassword);

    }

    private void initView() {
        userNameTv = findViewById(R.id.activity_second_username_tv);
        userPasswordTv = findViewById(R.id.activity_second_userpassword_tv);

    }
}
