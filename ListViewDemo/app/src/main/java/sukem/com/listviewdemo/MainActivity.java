package sukem.com.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView userListView;
    private ArrayList<String> userStringArrayList;
    private ArrayAdapter<String> stringArrayAdapter;
    private EditText headerNameEd;
    private Button headerNameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

//        for (int i = 0; i < 20; i++) {
//            userStringArrayList.add("User " + i);
//        }

        stringArrayAdapter = new ArrayAdapter<>(MainActivity.this, R.layout.row_item, R.id.row_item_name_tv, userStringArrayList);

        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup myHeader = (ViewGroup) layoutInflater.inflate(R.layout.header_layout, userListView, false);

        headerNameEd = myHeader.findViewById(R.id.header_layout_name_ed);
        headerNameBtn = myHeader.findViewById(R.id.header_layout_name_btn);

        userListView.addHeaderView(myHeader);


        headerNameBtn.setOnClickListener(this);

        userListView.setAdapter(stringArrayAdapter);

    }

    private void initView() {

        userListView = findViewById(R.id.activity_main_user_lv);
        userStringArrayList = new ArrayList<>();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.header_layout_name_btn:
                addItem();
                break;
        }
    }

    private void addItem() {
        final String name = headerNameEd.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter Name", Toast.LENGTH_SHORT).show();
        } else {
            userStringArrayList.add(name);
            stringArrayAdapter.notifyDataSetChanged();
        }
    }
}
