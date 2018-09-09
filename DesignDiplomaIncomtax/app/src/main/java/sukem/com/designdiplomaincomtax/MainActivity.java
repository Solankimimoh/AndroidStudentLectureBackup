package sukem.com.designdiplomaincomtax;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RadioGroup genderRadioGroup;
    private SeekBar colorSk;
    private EditText btn;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.activity_main_email_ed);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerForContextMenu(v);
            }
        });

        floatingActionButton = findViewById(R.id.floatingActionButton);
        registerForContextMenu(floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        genderRadioGroup = findViewById(R.id.activity_main_gender_rg);

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                final RadioButton genderRb = findViewById(checkedId);
                Toast.makeText(MainActivity.this, "" + genderRb.getText(), Toast.LENGTH_SHORT).show();

//                switch (checkedId) {
//                    case R.id.activity_main_male_rb:
//                        break;
//                    case R.id.activity_main_female_rb:
//                        break;
//                }

            }
        });

        colorSk = findViewById(R.id.activity_main_color_sk);
        colorSk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.e(TAG, "onProgressChanged:" + progress);
                if (progress > 75) {
                    Toast.makeText(MainActivity.this, "Volume Slow Please", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e(TAG, "onStartTrackingTouch: ");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.e(TAG, "onStopTrackingTouch: ");
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.test, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.test, menu);
        return true;
    }
}
