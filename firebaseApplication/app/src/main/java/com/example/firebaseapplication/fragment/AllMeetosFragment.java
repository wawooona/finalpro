package com.example.firebaseapplication.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.firebaseapplication.MeetoAdapter;
import com.example.firebaseapplication.R;
import com.example.firebaseapplication.SecondActivity;
import com.example.firebaseapplication.classes.MeetoNote;
import com.example.firebaseapplication.classes.emotion;

import java.util.ArrayList;

//i will add recyclerview T.T
public class AllMeetosFragment extends Fragment {

    public AllMeetosFragment() {
        // Required empty public constructor


    }
// وايد ملفات قاعدة أضيع :(
// المهم انه بالفراقمنت اي شي تبين ينحفظ تحطينه داخل الonCreateView لأن جذي
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        //هني قاعدة نعرف الview *قاعدة اسمع قصة سورة البقرة*
       View view = inflater.inflate(R.layout.fragment_all_meetos, container, false);

        ArrayList<MeetoNote>  MeetoNoteArrayList = new ArrayList<>();


        //مفروض ما أدخل داتا مني ويكون الموضوع بالفاير بيز بس شنسوي

        MeetoNote note1 = new MeetoNote("hi, life is note easy but, it's not hard","Fri Jan 20 14:26:19 IST 2017","happy");
        MeetoNote note2 = new MeetoNote("saaaaad baaaaad laaaalaaaal","Fri Jan 20 14:26:19 IST 2017","sad");
        MeetoNote note3 = new MeetoNote("gl;sdkgfsdl;fksd;f","Fri Jan 20 14:26:19 IST 2017","normal");

        //now i should add the note in the list wooow خوش غلطة
        MeetoNoteArrayList.add(note1);
        MeetoNoteArrayList.add(note2);
        MeetoNoteArrayList.add(note3);

        // يطلع لي null ليش :( ؟!
        // null cause coping the code make the android studio stupid :) !!! المهم ما علينا

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        final RelativeLayout relativeLayout = view.findViewById(R.id.rl);
        //  هني قاعدين نعرف حق الرلتف فيو Manager لانه مشغول والManager اهو اللي *امبي مادري القصة تبجي مادري شكوT.T ليش ابو اسرائيل كلاب ما يحترمون سيدنا موسى* المهم المانجر اهو راح ينادي ال view بعدين ينادي الContext ليش ؟ لان احنا مو بآكتفتي *امبي القصة مو وقتيT.T*
        RecyclerView.LayoutManager lm = new LinearLayoutManager(view.getContext());
        //بعدين نناديهم المهم حفظ الموضوع
        recyclerView.setLayoutManager(lm);


        //بعدين نعرف متغر من نوع  MeetoAdapter ونزد الArrayList والview
        MeetoAdapter ma = new MeetoAdapter(MeetoNoteArrayList, view.getContext(),relativeLayout);

        //هني أنا قاعدة أضبط الحجم ما الرسايكل فيو بس احس اني قاعدة ادز البيانات
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(ma);

        return view ;


    }
}