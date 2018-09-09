package sukem.com.designnrevisionmaninagar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameTv = findViewById(R.id.tv1);

        Intent intent= getIntent();

        nameTv.setText(intent.getStringExtra("KEY_NAME"));

    }
}
