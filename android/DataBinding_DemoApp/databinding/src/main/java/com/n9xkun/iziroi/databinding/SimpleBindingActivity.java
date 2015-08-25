package com.n9xkun.iziroi.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.n9xkun.iziroi.databinding.databinding.ActivitySimpleBindingBinding;
import com.n9xkun.iziroi.databinding.pojo.User;

public class SimpleBindingActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //lấy object thực hiện việc binding
    Object binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_binding);
    ActivitySimpleBindingBinding binder = (ActivitySimpleBindingBinding) binding;

    //tạo 1 hard entity và gắn vào binding
    User user = new User("Test User 1");
    binder.setUser(user);
  }
}
