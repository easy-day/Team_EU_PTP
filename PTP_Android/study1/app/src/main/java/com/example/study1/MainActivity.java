package com.example.study1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {



            @Override
            protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Button testBtn = findViewById(R.id.button2);
                TableLayout inputForm = findViewById(R.id.tableLayout2);
                final joinPage_API joinApi = new joinPage_API();

                /** TableRow 객체화 **/
                final TableRow nameTable = findViewById(R.id.nameTableRow);
                final TableRow idTable = findViewById(R.id.idTableRow);
                final TableRow pwTable = findViewById(R.id.pwTableRow);
                final TableRow pwCheckTable = findViewById(R.id.pwCheckTableRow);
                final TableRow birthTable = findViewById(R.id.birthTableRow);
                final TableRow mailTable = findViewById(R.id.mailTableRow);
                /** ImageView 객체화 **/
                final ImageView nameImgChecked = findViewById(R.id.nameCheckedImg);
                final ImageView idImgeChecked = findViewById(R.id.idCheckedImg);
                final ImageView pwImgeChecked = findViewById(R.id.pwCheckedImg);
                final ImageView pwCheckedImgeChecked = findViewById(R.id.pwCChecked);
                final ImageView birthImgeChecked = findViewById(R.id.birthCheckedImg);
                final ImageView mailImgeChecked = findViewById(R.id.mailCheckedImg);


                /** EditText 객체화 **/
                final EditText nameText = findViewById(R.id.nameText);
                final EditText idText = findViewById(R.id.idText);
                final EditText pwText = findViewById(R.id.pwText);
                final EditText pwCheckText = findViewById(R.id.pwCheckText);
                final EditText birthText = findViewById(R.id.birthText);
                final EditText mailText = findViewById(R.id.mailText);

                inputForm.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(joinApi.textNullCheck(MainActivity.this,nameText)) {
                            nameTable.setVisibility(View.GONE);
                            idTable.setVisibility(View.VISIBLE);
                            nameImgChecked.setVisibility(View.VISIBLE);
                        }
                        return false;
                    }
                });

                joinApi.checkedImgToggle(idImgeChecked);



    }
}
