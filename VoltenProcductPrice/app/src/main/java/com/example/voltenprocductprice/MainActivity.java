package com.example.voltenprocductprice;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    List<Combo> lst_Combo;
    List<Single> Lst_Single;
    private ImageSlider imageSlider;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        //Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbars);
        setSupportActionBar(toolbar);
        // Navigation View
        navigationView();
        //Auto Slider Image
        slider_image();
        // Single Set
        single_Set();
        //Combo Set
        combo_Set();
        // BottomNavigationView
        bottomNavigationView();
    }


    //function

    private void single_Set() {
        Lst_Single = new ArrayList<>();
        Lst_Single.add(new Single("COMBO A", "", "150 USD", R.drawable.combo_a));
        Lst_Single.add(new Single("COMBO B", "", "150 USD", R.drawable.combo_b));
        Lst_Single.add(new Single("COMBO C", "", "165 USD", R.drawable.combo_c));
        Lst_Single.add(new Single("COMBO D", "", "165 USD", R.drawable.combo_d));
        Lst_Single.add(new Single("COMBO E", "", "165 USD", R.drawable.combo_e));
        Lst_Single.add(new Single("COMBO F", "", "160 USD", R.drawable.combo_f));
        Lst_Single.add(new Single("COMBO G", "", "150 USD", R.drawable.combo_g));
        Lst_Single.add(new Single("COMBO H", "", "150 USD", R.drawable.combo_h));
        Lst_Single.add(new Single("COMBO I", "", "160 USD", R.drawable.combo_i));
        Lst_Single.add(new Single("COMBO K", "", "165 USD", R.drawable.combo_k));
        Lst_Single.add(new Single("COMBO L", "", "165 USD", R.drawable.combo_l));
        Lst_Single.add(new Single("COMBO M", "", "165 USD", R.drawable.combo_m));
        Lst_Single.add(new Single("COMBO N", "", "165 USD", R.drawable.combo_n));
        Lst_Single.add(new Single("COMBO P", "", "165 USD", R.drawable.combo_p));
        Lst_Single.add(new Single("COMBO Q", "", "165 USD", R.drawable.combo_q));
        //Adapter Combo Set
        RecyclerView myViews = (RecyclerView) findViewById(R.id.recycler_View_2);
        Single_Adapter mtAdapter2 = new Single_Adapter(this, Lst_Single);
        myViews.setLayoutManager(new GridLayoutManager(this, 3));
        myViews.setAdapter(mtAdapter2);
    }

    private void combo_Set() {
        lst_Combo = new ArrayList<>();
        lst_Combo.add(new Combo("VR4 Capsule", "145 USD", "15665165", R.drawable.vr4_set));
        lst_Combo.add(new Combo("Vcafe", "165 USD", "", R.drawable.vcafe_set));
        lst_Combo.add(new Combo("DR4 Liquid", "150 USD", "", R.drawable.dr4_set));
        lst_Combo.add(new Combo("V20", "150 USD", "", R.drawable.v20_set));
        lst_Combo.add(new Combo("Black Tea", "165 USD", "", R.drawable.black_tea_set));
        lst_Combo.add(new Combo("Vtameen", "165 USD", "", R.drawable.vtameen_set));
        lst_Combo.add(new Combo("Vsweet", "165 USD", "", R.drawable.vsweet_set));
        lst_Combo.add(new Combo("E.V.R", "270 USD", "", R.drawable.evr_set));
        lst_Combo.add(new Combo("No Set", "", "", R.drawable.background_color));

        //Combo Adapter
        RecyclerView myview = (RecyclerView) findViewById(R.id.recycler_View);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lst_Combo);
        myview.setLayoutManager(new GridLayoutManager(this, 3));
        myview.setAdapter(myAdapter);
    }

    private void slider_image() {
        imageSlider = (ImageSlider) findViewById(R.id.image_autoSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slider_promotion, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_promotion, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider_promotion, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }

    private void navigationView() {
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.navigation);
        navigationView.setItemIconTintList(null);
    }

    private void bottomNavigationView(){
        ChipNavigationBar buttomNV;
        buttomNV=findViewById(R.id.bottom_Navigation);
        buttomNV.setItemSelected(R.id.bottom_Navigation,true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
        buttomNV.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment=null;
                switch (i){
                    case R.id.nvhome:
                        fragment=new HomeFragment();
                        break;
                    case R.id.nvRetail:
                        fragment=new Retial_set();
                        break;
                    case R.id.nvSingle:
                        fragment=new Single_Set();
                        break;
                    case R.id.nvCombo:
                        fragment=new Combo_Set();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}