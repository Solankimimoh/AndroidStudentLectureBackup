package sukem.com.menudialogdatetimeincomtaxbca;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText dateEd;
    private EditText timeEd;

    private Button dateBtn;
    private Button timeBtn;
    private Button openDialogBtn;

    private int mYear;
    private int mMonth;
    private int mDay;
    private int mHour;
    private int mMinute;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {

        dateEd = findViewById(R.id.activity_main_date_ed);
        dateBtn = findViewById(R.id.activity_main_date_btn);
        timeEd = findViewById(R.id.activity_main_time_ed);
        timeBtn = findViewById(R.id.activity_main_time_btn);
        openDialogBtn = findViewById(R.id.activity_main_dialog);

        dateBtn.setOnClickListener(this);
        timeBtn.setOnClickListener(this);
        openDialogBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_date_btn:
                Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
                openDatePickerDialog();
                break;
            case R.id.activity_main_time_btn:
                openTimePickerDialog();
                break;
            case R.id.activity_main_dialog:
                openDialog();
                break;
        }
    }

    private void openDialog() {
        dialog = new AppCompatDialog(MainActivity.this, R.style.Theme_AppCompat_Dialog_MinWidth);

        dialog.setContentView(R.layout.dialog_layout);
        dialog.setTitle("Custome Dialog");
        dialog.setCancelable(false);
        dialog.show();
    }

    private void openTimePickerDialog() {

        Calendar calendar = Calendar.getInstance();
        mHour = calendar.get(Calendar.HOUR);
        mMinute = calendar.get(Calendar.MINUTE);

        timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                timeEd.setText("" + hourOfDay + " : " + minute);
            }
        }, mHour, mMinute, false);
        timePickerDialog.show();

    }

    private void openDatePickerDialog() {

        Calendar calendar = Calendar.getInstance();
        mYear = calendar.get(Calendar.YEAR);
        mMonth = calendar.get(Calendar.MONTH);
        mDay = calendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                dateEd.setText("" + dayOfMonth + "/" + (month + 1) + "/" + year);

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
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_about:
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
