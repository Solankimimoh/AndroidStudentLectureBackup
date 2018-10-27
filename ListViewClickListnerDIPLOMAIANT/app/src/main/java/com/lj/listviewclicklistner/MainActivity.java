package com.lj.listviewclicklistner;

import android.app.Dialog;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<String> personArrayList;
    private ArrayAdapter<String> customArrayAdapter;
    private ListView personListView;
    private Spinner personSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setupData();

        customArrayAdapter = new ArrayAdapter<>(MainActivity.this,
                R.layout.row_layout,
                R.id.nametv,
                personArrayList);

        personListView.setAdapter(customArrayAdapter);


        personListView.setOnItemClickListener(this);

    }

    private void setupData() {
        for (int i = 0; i < 3; i++) {
            personArrayList.add("Name " + i);
        }
    }

    private void initView() {

        personListView = findViewById(R.id.userlist);
//        personSpinner = findViewById(R.id.personspinner);
        personArrayList = new ArrayList<>();


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "" + personArrayList.get(position)
                , Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_add:
                addItem();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void addItem() {

        final Dialog dialog = new AppCompatDialog(MainActivity.this, R.style.Theme_AppCompat_Light_Dialog_MinWidth);

        dialog.setContentView(R.layout.add_item_view);
        dialog.setTitle("Add Item");
        dialog.show();
        final EditText nameEd = dialog.findViewById(R.id.add_item_ed);
        final Button nameBtn = dialog.findViewById(R.id.add_item_btn);


        nameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = nameEd.getText().toString().trim();
                personArrayList.add(name);
                customArrayAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


    }
}
