package com.example.osmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.osmtest.databinding.ActivityMainBinding
import org.osmdroid.config.Configuration
import org.osmdroid.library.BuildConfig
import org.osmdroid.tileprovider.tilesource.TileSourceFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Configuration.getInstance().userAgentValue = "BuildConfig.APPLICATION_ID";
        Configuration.getInstance().osmdroidBasePath = filesDir

        binding.test.setTileSource(TileSourceFactory.MAPNIK)
    }
}