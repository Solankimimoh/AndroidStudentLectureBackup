package sukem.com.seekbardatetimepickermenumaninagar;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName(); //MainActivity
    private CheckBox danceCb;
    private CheckBox sportCb;
    private SeekBar colorSK;

    //    Date n Time Picker Dialog
    private EditText dateEd;
    private EditText timeEd;
    private Button dateBtn;
    private Button timeBtn;
    private int mYear;
    private int mMonth;
    private int mDay;
    private int mHour;
    private int mMinuts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        danceCb = findViewById(R.id.activity_main_dance_cb);
        sportCb = findViewById(R.id.activity_main_sport_cb);
        colorSK = findViewById(R.id.activity_main_color_sk);

        danceCb.setOnCheckedChangeListener(this);
        sportCb.setOnCheckedChangeListener(this);

        colorSK.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d(TAG, "onProgressChanged: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d(TAG, "onStartTrackingTouch: ");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d(TAG, "onStopTrackingTouch: ");
            }

        });

//        Date n Time Picker Init
        dateEd = findViewById(R.id.activity_main_date_ed);
        dateBtn = findViewById(R.id.activity_main_date_btn);
        timeEd = findViewById(R.id.activity_main_time_ed);
        timeBtn = findViewById(R.id.activity_main_time_btn);

        dateBtn.setOnClickListener(this);
        timeBtn.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.activity_main_dance_cb:
                Toast.makeText(this, "" + buttonView.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_main_sport_cb:
                Toast.makeText(this, "" + buttonView.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_date_btn:
                openDatePicker();
                break;
            case R.id.activity_main_time_btn:
                openTimePicker();
                break;
        }
    }

    private void openTimePicker() {

        Calendar calendar = Calendar.getInstance();

        mHour = calendar.get(Calendar.HOUR);
        mMinuts = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                timeEd.setText(hourOfDay + ":" + minute);
            }
        }, mHour, mMinuts, true);
        timePickerDialog.show();
    }

    private void openDatePicker() {
        Calendar calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dateEd.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }
        }, mYear, mMonth, mDay);
        datePickerDialog.show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_setting:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_about:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_contact:
                Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            default:
                }
        return super.onOptionsItemSelected(item);
    }
}
