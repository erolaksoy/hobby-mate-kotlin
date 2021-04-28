package net.erolaksoy.hobbymate

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import net.erolaksoy.hobbymate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(this.layoutInflater) }
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        drawerLayout = binding.drawerLayout
        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.drawer_open_menu,
            R.string.drawer_close_menu
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.toolbar.menuIcon.setOnClickListener { binding.drawerLayout.open() }
        NavigationUI.setupWithNavController(binding.navigationView, navController)

        //supportActionBar
        // supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // supportActionBar?.setHomeButtonEnabled(true)
    }

    //region onOptionsItemSelected, onSupportNavigateUp function override examples
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return super.onOptionsItemSelected(item)
//        // TODO STEP 9.2 - Have Navigation UI Handle the item selection - make sure to delete
//        //  the old return statement above
//        // Have the NavigationUI look for an action or destination matching the menu
//       // item id and navigate there if found.
///       // Otherwise, bubble up to the parent.
//        return item.onNavDestinationSelected(findNavController(R.id.navHostFragment))
//                || super.onOptionsItemSelected(item)
//        // TODO END STEP 9.2
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//       // Allows NavigationUI to support proper up navigation or the drawer layout
//        // drawer menu, depending on the situation
//        return findNavController(R.id.navHostFragment).navigateUp(appBarConfiguration)
//  }
//endregion

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}