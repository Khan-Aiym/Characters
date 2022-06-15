package com.geektech.characters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharacterAdapter  extends RecyclerView.Adapter <CharacterViewHolder> {
private ArrayList<String> characters;
public CharacterAdapter(ArrayList<String> characters) {this.characters=characters;
}
    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
holder.bind(characters.get(position));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}


