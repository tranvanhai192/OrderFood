package com.example.food;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class home extends Fragment {
RecyclerView recyclerView;
ContactAapter aapter;
   Contacts contacts0, contact1, contact2, contact3;
    Contacts contact4, contact5, contact6, contact7;
    List<Contacts> contactsList;
    public static home newInstance(Contacts contacts) {

        Bundle args = new Bundle();
        args.putSerializable("contactput",contacts);
        home fragment = new home();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = (inflater.inflate(R.layout.home, container, false));
        recyclerView=view.findViewById(R.id.rvList);
        contactsList=new ArrayList<>();

       contacts0= new Contacts("Heniken", "18000", 0);
        contact1 = new Contacts("Cocacola", "15000", 1);
        contact2 = new Contacts("Ha Noi beer", "11000", 2);
        contact3 = new Contacts("Orange", "10000", 3);
        contact4 = new Contacts("Pepsi", "10000", 4);
        contact5 = new Contacts("Pizza", "120000", 5);
        contact6 = new Contacts("7-Up", "8000", 6);


       contactsList.add(contacts0);
        contactsList.add(contact1);
        contactsList.add(contact2);
        contactsList.add(contact3);
        contactsList.add(contact4);
        contactsList.add(contact5);
        contactsList.add(contact6);



        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        aapter= new ContactAapter(contactsList);
        recyclerView.setAdapter(aapter);
        recyclerView.setLayoutManager(layoutManager);





        return view;
    }

}

