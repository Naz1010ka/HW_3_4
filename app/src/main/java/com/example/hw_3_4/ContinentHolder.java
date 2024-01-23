package com.example.hw_3_4;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_4.databinding.ItemContinentsBinding;

public class ContinentHolder extends RecyclerView.ViewHolder {
    private ItemContinentsBinding binding;

    public ContinentHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Continent continent){
        binding.tvContinent.setText(continent.getName());
    }
}