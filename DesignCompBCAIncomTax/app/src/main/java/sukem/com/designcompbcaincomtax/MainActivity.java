package sukem.com.designcompbcaincomtax;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();
    private FloatingActionButton floatingActionButton;
    private RadioGroup genderRadioGroup;

    private CheckBox danceCb;
    private CheckBox sportCb;
    private SeekBar colorSk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floatingActionButton2);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HELLO", Toast.LENGTH_SHORT).show();
            }
        });


        genderRadioGroup = findViewById(R.id.activity_main_gender_rg);

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(group.getCheckedRadioButtonId());
                radioButton.getText();
                Toast.makeText(MainActivity.this, "" + radioButton.getText(), Toast.LENGTH_SHORT).show();
//                switch (group.getCheckedRadioButtonId())
//                {
//                    case R.id.activity_main_female_rb:
//                        Toast.makeText(MainActivity.this, "FEMALE", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.activity_main_male_rb:
//                        Toast.makeText(MainActivity.this, "MALE", Toast.LENGTH_SHORT).show();
//                        break;
//                }
            }
        });


        danceCb = findViewById(R.id.activity_main_dance_cb);
        danceCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "" + buttonView.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        colorSk = findViewById(R.id.activity_main_color_sk);
        colorSk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.e(TAG, "onProgressChanged: "+progress);
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
