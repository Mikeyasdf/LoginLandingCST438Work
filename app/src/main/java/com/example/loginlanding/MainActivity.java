package com.example.loginlanding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.example.loginlanding.databinding.ActivityMainBinding;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Listener {

    private void toastMaker(String val){
        Toast t = Toast.makeText(this.getApplicationContext(), val, Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER_VERTICAL,0,0);
        t.show();
    }

    private LVM loginViewModel;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        binding.setClickListener((MainActivity) this);


        loginViewModel = ViewModelProviders.of(MainActivity.this).get(LVM.class);

        loginViewModel.getGetAllData().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(@Nullable List<User> data) {

                try {
//                    binding.UsernameEntry.setText((Objects.requireNonNull(data).get(0).getUsername()));
//                    binding.PasswordEntry.setText((Objects.requireNonNull(data.get(0).getPassword())));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }

//    public void mainActivity2(View view) {
//        Intent intent = new Intent(this, MainActivity2.class);
//        startActivity(intent);
//    }

    @Override
    public void onClick(View view) {

        String struser = binding.txtUsername.getText().toString().trim();
        String strpassword = binding.txtPassword.getText().toString().trim();

        User user = new User();

        if (TextUtils.isEmpty(struser)) {
            binding.txtUsername.setError("Please Enter Your Username");
        }
        else if (TextUtils.isEmpty(strpassword)) {
            binding.txtPassword.setError("Please Enter Your Password");
        }
        else {

            if(struser.equals("din_djarin") && strpassword.equals("baby_yoda_ftw")) {
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
            }else if(!strpassword.equals("baby_yoda_ftw")){
                toastMaker("Incorrect password");
                binding.txtPassword.setError("Please Enter Your Password");
            }else{
                toastMaker("Incorrect password and the password field is highlighted");
                binding.txtPassword.setError("Please Enter Your Password");
            }
        }

    }
}