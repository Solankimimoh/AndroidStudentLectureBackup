package sukem.com.clickeventdemomaninagar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameTv;
    private Button clickBtn;
    private EditText nameEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //comp init
        nameTv = findViewById(R.id.activity_main_name_tv);
        clickBtn = findViewById(R.id.activity_main_click_btn);
        nameEd = findViewById(R.id.activity_main_name_ed);

        //listener init
        nameTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTv.setTextColor(Color.RED);
                nameTv.setTextSize(40);
            }
        });


        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEd.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Fill the Email", Toast.LENGTH_SHORT).show();
                } else {
                    nameTv.setText(nameEd.getText().toString());
                }

            }
        });
    }

}


