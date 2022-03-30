package com.example.challangepraktikum.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challangepraktikum.models.Contact;
import com.example.challangepraktikum.databinding.CardContactBinding;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private final Context context;
    private final ArrayList<Contact> contactList;

    public ContactAdapter(Context context, ArrayList<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        private final CardContactBinding cardContactBinding;

        public ContactViewHolder(
                @NonNull CardContactBinding cardContactBinding
        ) {
            super(cardContactBinding.getRoot());
            this.cardContactBinding = cardContactBinding;
        }

        public void bindView(Context context, Contact contact) {
            cardContactBinding.profileCircleImageView.setImageResource(
                    contact.getProfile()
            );
            cardContactBinding.nameTextView.setText(contact.getName());
            cardContactBinding.emailTextView.setText(contact.getEmail());
            cardContactBinding.callButton.setOnClickListener(view -> {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(
                        Intent.EXTRA_EMAIL,
                        new String[]{contact.getEmail()}
                );
                intent.setType("message/rfc822");
                context.startActivity(intent);
            });
        }
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType
    ) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        CardContactBinding cardContactBinding = CardContactBinding.inflate(
                layoutInflater,
                parent,
                false
        );

        return new ContactViewHolder(cardContactBinding);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ContactViewHolder holder,
            int position
    ) {
        holder.bindView(context, contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
