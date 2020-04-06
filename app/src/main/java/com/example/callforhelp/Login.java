package com.example.callforhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent;
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener;
import net.yslibrary.android.keyboardvisibilityevent.util.UIUtil;

public class Login extends AppCompatActivity {

    ImageView image1,image2,image3;
    EditText textUsername,textpassword;
    TextView Login,User,ForgetMessage,message,register;
    Button signin;
    Animation bganim;//Animition image object//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TEXT VIEW FIND//
        Login=findViewById(R.id.login_id);
        User=findViewById(R.id.login_userid_id);
        ForgetMessage=findViewById(R.id.login_fogot_password_id);
        message=findViewById(R.id.login_donot_msg_id);
        register=findViewById(R.id.login_Register_id);



        // EDIT TEXT FIND//
        textUsername=findViewById(R.id.login_user_id);
        textpassword=findViewById(R.id.login_pass_id);


        //BUTTON FIND//

        signin=findViewById(R.id.signin_id);


        //IMAGE FIND//
        image1=findViewById(R.id.call_id);
        image2=findViewById(R.id.start_id);
        image3=findViewById(R.id.call_id);


        //ANIMATION FIND//
        bganim= AnimationUtils.loadAnimation(this,R.anim.bganim);



        //ANIMATION WORK//
        image2.animate().translationY(-3000).setDuration(2000).setStartDelay(1000);

        //image1.animate().translationY(0).setDuration(1800).setStartDelay(500);
        //image3.animate().translationY(25).setDuration(3700).setStartDelay(500);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RegistrationActivity();

            }
        });


    }

    public void RegistrationActivity(){

        Intent intent = new Intent(this,registration.class);
        startActivity(intent);
        finish();

    }
}

