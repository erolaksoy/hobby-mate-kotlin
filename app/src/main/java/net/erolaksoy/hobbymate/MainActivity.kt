package net.erolaksoy.hobbymate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import net.erolaksoy.hobbymate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(this.layoutInflater) }
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.bottom_sheet_behavior,
            R.string.app_name
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.toolbar.menuIcon.setOnClickListener { binding.drawerLayout.open() }
    }
}