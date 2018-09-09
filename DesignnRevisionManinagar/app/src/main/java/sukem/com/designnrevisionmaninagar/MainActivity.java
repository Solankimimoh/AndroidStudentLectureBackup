package sukem.com.designnrevisionmaninagar;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup genderRadioGroup;
    private FloatingActionButton floatingActionButton;
    private EditText nameEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genderRadioGroup = findViewById(R.id.activity_main_gender_rg);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        nameEd = findViewById(R.id.activity_main_email_ed);

        genderRadioGroup.setOnCheckedChangeListener(this);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                intent.putExtra("KEY_NAME", nameEd.getText().toString().trim());
                startActivity(intent);
            }
        });

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton gender = findViewById(checkedId);

//        switch (checkedId)
//        {
//            case R.id.activity_main_male_rb:
//                break;
//            case R.id.activity_main_female_rb:
//                break;
//        }

        Toast.makeText(this, "" + gender.getText(), Toast.LENGTH_SHORT).show();
    }
}
