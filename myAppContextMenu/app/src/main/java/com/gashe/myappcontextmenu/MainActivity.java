package com.gashe.myappcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ocultar menu
        //getSupportActionBar().hide();

        EditText tv = (EditText)findViewById(R.id.myEditText);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(Menu.NONE, 1, 1, "Popup");
        menu.add(Menu.NONE, 2, 1, "Popup 2");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case 1:
                Log.d(getClass().getCanonicalName(), "ITEM 1");
                break;
            case 2:
                Log.d(getClass().getCanonicalName(), "ITEM 2");
                break;
        }

        return super.onContextItemSelected(item);


    }
}
