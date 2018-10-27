package com.sukem.recyleviewiantbca;

import android.app.Person;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {

    private static final String TAG = MyCustomAdapter.class.getSimpleName();
    private ArrayList<PersonModel> personModelArrayList;

    public MyCustomAdapter(ArrayList<PersonModel> personModelArrayList) {
        this.personModelArrayList = personModelArrayList;
        Log.e(TAG, "MyCustomAdapter: ");
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTv;
        public TextView emailTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.e(TAG, "MyViewHolder: ");

            nameTv = itemView.findViewById(R.id.row_layout_name_tv);
            emailTv = itemView.findViewById(R.id.row_layout_email_tv);

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,
                parent,
                false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.e(TAG, "onBindViewHolder: "+position);
        PersonModel personModel = personModelArrayList.get(position);

        holder.nameTv.setText(personModel.getName());
        holder.emailTv.setText(personModel.getEmail());

    }

    @Override
    public int getItemCount() {
        Log.e(TAG, "getItemCount: "+personModelArrayList.size());
        return personModelArrayList.size();
    }
}
