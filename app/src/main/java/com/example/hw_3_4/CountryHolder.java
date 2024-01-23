package com.example.hw_3_4;

import androidx.recyclerview.widget.RecyclerView;


import com.example.hw_3_4.databinding.ItemCountryBinding;

public class CountryHolder extends RecyclerView.ViewHolder {

    private ItemCountryBinding binding;


    public CountryHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Country country){
        binding.tvNameOfCountry.setText(country.getCountryName());
    }
}
