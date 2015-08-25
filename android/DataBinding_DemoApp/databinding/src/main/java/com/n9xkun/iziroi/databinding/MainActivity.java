package com.n9xkun.iziroi.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //tạo menu, viết kiểu không data binding
    ListView lstMenu = (ListView) findViewById(R.id.lstMenu);

    String[] menus = getResources().getStringArray(R.array.menuitems);
    ArrayAdapter<String> menuAdapter = new ArrayAdapter<>(this, R.layout.layout_item_menu, R.id.txtMenu, menus);

    lstMenu.setAdapter(menuAdapter);
    lstMenu.setOnItemClickListener(this);
  }


  @Override
  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    TextView txtMenu = (TextView) view.findViewById(R.id.txtMenu);
    String menuName = txtMenu.getText().toString();

    String packageName = getApplicationContext().getPackageName();
    try {
      Class<?> myClass = Class.forName(packageName + "." + menuName + "Activity");
      Intent i = new Intent(this, myClass);
      startActivity(i);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
