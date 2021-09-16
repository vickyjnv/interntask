package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.recyclerview.HelperClass.adapteritem;
import com.example.recyclerview.HelperClass.itemHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements adapteritem.ListItemClickListener {

    RecyclerView items;
    RecyclerView items1;
    RecyclerView items2;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Hooks
        items = findViewById(R.id.my_recycler);
        items1 = findViewById(R.id.my_recycler1);
        items2 = findViewById(R.id.my_recycler2);

        items1();
        items2();
        items3();

    }

    private void items1() {
        items.setHasFixedSize(true);
        items.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<itemHelper> itemLocations = new ArrayList<>();
        itemLocations.add(new itemHelper(R.drawable.burger,"burger","2","$5"));
        itemLocations.add(new itemHelper(R.drawable.jam,"jam","3","$5"));
        itemLocations.add(new itemHelper(R.drawable.burger,"burger","3","$5"));
        itemLocations.add(new itemHelper(R.drawable.jam,"jam","3","$5"));
        itemLocations.add(new itemHelper(R.drawable.burger,"Burger","3","$5"));


        adapter = new adapteritem(itemLocations,this);
        items.setAdapter(adapter);

    }

    private void items2() {
        

        items1.setHasFixedSize(true);
        items1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<itemHelper> itemLocations = new ArrayList<>();
        itemLocations.add(new itemHelper(R.drawable.jam,"jam","3","$5"));
        itemLocations.add(new itemHelper(R.drawable.banana,"banana","4","$5"));
        itemLocations.add(new itemHelper(R.drawable.jam,"jam","4","$5"));
        itemLocations.add(new itemHelper(R.drawable.banana,"banana","4","$5"));
        itemLocations.add(new itemHelper(R.drawable.jam,"jam","4","$5"));


        adapter = new adapteritem(itemLocations,this);
        items1.setAdapter(adapter);

    }

    private void items3() {


        items2.setHasFixedSize(true);
        items2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<itemHelper> itemLocations = new ArrayList<>();
        itemLocations.add(new itemHelper(R.drawable.cucumber,"cucumber","2","$5"));
        itemLocations.add(new itemHelper(R.drawable.apple,"apple","3","$5"));
        itemLocations.add(new itemHelper(R.drawable.cucumber,"cucumber","3","$5"));
        itemLocations.add(new itemHelper(R.drawable.apple,"apple","4","$5"));
        itemLocations.add(new itemHelper(R.drawable.apple,"apple","$5","$5"));
        adapter = new adapteritem(itemLocations,this);
        items2.setAdapter(adapter);

    }
    @Override
    public void onphoneListClick(int clickedItemIndex) {
    }
}