package com.example.food;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAapter extends RecyclerView.Adapter<ContactAapter.Viewhoder> {
    List<Contacts> contactList;
   IonClickContact IonclickContact;

    public ContactAapter(List<Contacts> contactList) {
        this.contactList = contactList;
    }

    public void setIonClickContact(IonClickContact ionClickContact) {
        this.IonclickContact = ionClickContact;
    }



    @NonNull
    @Override
    public ContactAapter.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.item_contact,parent,false);
        Viewhoder viewhoder=new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAapter.Viewhoder holder, int position) {
        int [] imgview={R.drawable.heniken_1,R.drawable.coca_5,R.drawable.hanoi_4,R.drawable.orange_2,R.drawable.pepsi_7,R.drawable.up_6,R.drawable.pizza_3};
        final Contacts contacts=contactList.get(position);
        holder.tvCost.setText(contacts.getCost());
        holder.tvName.setText(contacts.getName());

        if ((contacts.img<imgview.length)){
            holder.imageView.setImageResource(imgview[contacts.img]);;
        }else holder.imageView.setImageResource(R.drawable.ic_adjust);

        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IonclickContact.onClickname(contacts.getName());
            }
        });
        holder.tvCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IonclickContact.onClickCoast(contacts.getCost());
            }
        });
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }



    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName, tvCost;
        ImageView imageView;
        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvNameContact);
            tvCost = itemView.findViewById(R.id.tvCost);
            imageView = itemView.findViewById(R.id.imgview);
        }
    }
}

