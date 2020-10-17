package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListMusic extends AppCompatActivity {
    private ListView listView_casi;




    String[] name={
            "Adele","Ariana Grande","Justin Bebier","Juson Derulo","Red Velvet",
    };
    String[] song={
            "Hello","Side to Side","Baby","Marry","Psyco",
    };
    Integer[] imgid={
            R.drawable.adele,R.drawable.ariana,R.drawable.justin,R.drawable.juson,R.drawable.rev,
    };


    Button bttAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_ca_si);
        Customer adapter=new Customer(this,name,song,imgid);
        listView_casi=(ListView) findViewById(R.id.list_casi);
        listView_casi.setAdapter(adapter);


        bttAcc=(Button)findViewById(R.id.btAcc);
        bttAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }
    public void openProfile(){
        Intent it=new Intent(ListMusic.this,Profile.class);
        startActivity(it);
    }

}