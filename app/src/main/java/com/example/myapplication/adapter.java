package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends ArrayAdapter<User> {
    private Context context;
    private int resource;
    private ArrayList<User> users;

    public adapter(Context context, int resource, ArrayList<User> users) {
        super(context, resource, users);
        this.context = context;
        this.resource = resource;
        this.users = users;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, resource, null);
        TextView tvName = view.findViewById(R.id.txtName);
        TextView tvEmail = view.findViewById(R.id.txtEmail);
        TextView tvAddress = view.findViewById(R.id.txtAddress);
        TextView tvPhone = view.findViewById(R.id.txtPhone);
        User user = users.get(position);
        tvName.setText(user.getName());
        tvEmail.setText(user.getEmail());
        tvAddress.setText(user.getAddress());
        tvPhone.setText(user.getPhone());
        return view;
    }
}
