package com.example.study1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class joinPage_API {

    /**EditText 널값인지 체크 하고 공백일 경우 공백 메시지를 날려주는 메서드 **/
    boolean textNullCheck(Activity activity, EditText text){
        if(text.getText().toString().length() == 0){
            Toast.makeText(activity.getApplicationContext(), "공백을 체워주세요", Toast.LENGTH_SHORT).show();
            return false;
        }else{
            String a = text.getText().toString();
            Toast.makeText(activity.getApplicationContext(),text.getText().toString()+"를 입력하셨습니다..",Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    /**CheckedImg View 상태를 바꿔주는 메서드**/

    void checkedImgToggle(final ImageView image){
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setVisibility(View.VISIBLE);
            }
        });
    }
    
}
