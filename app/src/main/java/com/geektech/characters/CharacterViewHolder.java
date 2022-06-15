package com.geektech.characters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder {
    private TextView fCharacter;
    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        fCharacter = itemView.findViewById(R.id.character);
    }

    public void bind(String character) {
        fCharacter.setText(character);
    }
}
