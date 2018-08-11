package sukem.com.clickeventdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickEventBtn;
    private TextView nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickEventBtn = findViewById(R.id.activity_main_click_btn);
        nameTv = findViewById(R.id.activity_main_name_tv);

        clickEventBtn.setText("BTN NEW");
        clickEventBtn.setBackgroundColor(Color.RED);
        clickEventBtn.setTextSize(20);
        clickEventBtn.setTextColor(Color.WHITE);

        Toast.makeText(this, nameTv.getText().toString(), Toast.LENGTH_SHORT).show();


        clickEventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTv.setText(clickEventBtn.getText().toString());
                nameTv.setText("THIS IS SWAG");
                nameTv.setBackgroundColor(Color.GREEN);
                nameTv.setTextColor(Color.BLUE);
                Log.e("TAG", "ONCLICK CALL");
            }
        });

    }
}
