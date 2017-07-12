package com.wordpress.nikant20.uiviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<User> userList;
    UserAdapter userAdapter;

    void initListView(){
        listView= (ListView) findViewById(R.id.listView);

        User user1 = new User(R.drawable.ic_homework,"Nikant","9803763824");
        User user2 = new User(R.drawable.ic_brush,"Priyanshu","9803763824");
        User user3 = new User(R.drawable.ic_certificate2,"Jivesh","9803763824");
        User user4 = new User(R.drawable.ic_crayon,"Amulya","9803763824");
        User user5 = new User(R.drawable.ic_elearning,"Prabhudeep","9803763824");

        userList = new ArrayList<User>();
        userList.add(user1);//0
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);//n-1

        userAdapter = new UserAdapter(this,R.layout.custom_list,userList);
        listView.setAdapter(userAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView();
    }
}
