package sukem.com.designdiplomaincomtax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RadioGroup genderRadioGroup;
    private SeekBar colorSk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
                Log.e(TAG, "onProgressChanged:"+progress);
                if(progress>75)
                {
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
}
