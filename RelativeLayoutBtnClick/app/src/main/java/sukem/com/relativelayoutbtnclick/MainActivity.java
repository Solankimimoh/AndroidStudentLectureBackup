package sukem.com.relativelayoutbtnclick;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button clickBtn;
    private EditText nameEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickBtn = findViewById(R.id.activity_main_name_btn);
        nameEd = findViewById(R.id.activity_main_name_ed);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickBtn.setText("NEW CLICK BTN");
                clickBtn.setBackgroundColor(Color.GREEN);
                Toast.makeText(MainActivity.this,
                        ""+nameEd.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}

