package com.example.firebaseapplication.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firebaseapplication.R;
import com.example.firebaseapplication.classes.MeetoNote;
import com.example.firebaseapplication.classes.emotion;
import java.util.*;
// لا تبكي ياصغيري انظر الى الكود :")

public class TodayFragment extends Fragment {
    public TodayFragment() {
        Context context;
        // panic attack T.T HEEEELLLLLLLLLPPPPPPPPPPP

        // Required empty public constructor
    }

// أنا شنو كنت بسوي؟؟؟؟؟؟ ليش كل دقيقة أفهي ؟؟؟؟؟؟؟ خلاااااص ركزي T.T

    // المهم انه بالفراقمنت اي شي تبين ينحفظ تحطينه داخل الonCreateView لأن جذي

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //  كل ما تتوهقين سوي view ينقذج من المصايب
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        MeetoNote todaysmeet = new MeetoNote("","", "normal");

        // calender for the date

                Calendar calendar = Calendar.getInstance();

        // بعدها انعرف الأشياء اللي نبيها من كائنات بعد الفيو
        // ونحط واحنا نعرف view.findViewById(R.id
       final  EditText editText = view.findViewById(R.id.themeetofield);
       final ImageView happy = view.findViewById(R.id.happyimg);
       final ImageView normal = view.findViewById(R.id.normalimg);
       final ImageView sad = view.findViewById(R.id.sadimg);
       final ImageView sleepy = view.findViewById(R.id.sleepimg);
       //this edit view should take a value from the log in page and welcome the user
        //EditText textViewtday = view.findViewById(R.id.textViewtday);
        Button meetbutt = view.findViewById(R.id.meetbutton);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todaysmeet.setFeeling("happy");
                Toast.makeText(getContext(),"Happy" , Toast.LENGTH_LONG).show();
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todaysmeet.setFeeling("normal");
                Toast.makeText(getContext(),"Normal" , Toast.LENGTH_LONG).show();
            }
        });
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todaysmeet.setFeeling("sad");
                Toast.makeText(getContext(), "Sad", Toast.LENGTH_LONG).show();
            }
        });
        sleepy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todaysmeet.setFeeling("sleepy");
                Toast.makeText(getContext(),"Sleepy" , Toast.LENGTH_LONG).show();
            }
        });

       // editTextالحين لازم آخذ الداتا من ال
        meetbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().equals(null)){
                    Toast.makeText(getContext(),"PLEASE WRITE A MEETO", Toast.LENGTH_LONG).show();

                }
                   else {
                       todaysmeet.setNote(editText.getText().toString());
                       todaysmeet.setDate(calendar.getTime()+"");
                    Toast.makeText(getContext(),todaysmeet.getDate()+"" +todaysmeet.getNote()+"" , Toast.LENGTH_LONG).show();
                    System.out.print(todaysmeet);}



            }
        });

        // لازم بعد أعرف التاريخ وأناديه ولازم بعد أحط فنكشن if
        // done with the date

        return view ;
    }
}