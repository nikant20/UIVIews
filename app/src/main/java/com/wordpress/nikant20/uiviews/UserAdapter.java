package com.wordpress.nikant20.uiviews;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikant on 7/12/2017.
 */



public class UserAdapter extends ArrayAdapter<User> {

    Context context;
    int resource;
    ArrayList<User> userList;

    public UserAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<User> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource=resource;
        userList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        view = LayoutInflater.from(context).inflate(resource,parent,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textViewName = (TextView) view.findViewById(R.id.textViewName);
        TextView textViewPhone = (TextView) view.findViewById(R.id.textViewPhone);

        User user = userList.get(position);
        imageView.setBackgroundResource(user.getIcon());
        textViewName.setText(user.getName());
        textViewPhone.setText(user.getPhone());



        return view;
    }
}
