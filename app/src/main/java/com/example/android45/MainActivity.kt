package com.example.android45

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.android45.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var provinces: Array<String>
    private val countries = arrayOf(
        "Romania",
        "United States",
        "Finland",
        "Botswana",
        "Japan",
        "Germany"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        provinces = resources.getStringArray(R.array.provinces)

        with(binding) {
            val adapterCountry = ArrayAdapter(
                this@MainActivity,
                android.R.layout.simple_spinner_dropdown_item,
                countries
            )
            adapterCountry.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            Country.adapter = adapterCountry

            val adapterProvinces = ArrayAdapter(
                this@MainActivity,
                android.R.layout.simple_spinner_dropdown_item,
                provinces
            )

            adapterProvinces.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            provinces.adapter = adapterProvinces
        }
    }

}