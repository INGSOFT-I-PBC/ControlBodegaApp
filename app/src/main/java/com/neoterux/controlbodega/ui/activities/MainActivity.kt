package com.neoterux.controlbodega.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.snackbar.BaseTransientBottomBar.Duration
import com.neoterux.controlbodega.R
import com.neoterux.controlbodega.databinding.ActivityMainBinding
import com.neoterux.controlbodega.extensions.logd
import com.neoterux.controlbodega.extensions.logi
import com.neoterux.controlbodega.ui.fragments.DashboardFragment
import com.neoterux.controlbodega.ui.fragments.TomaFisicaFragment
import com.neoterux.controlbodega.ui.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var actionBarToggle: ActionBarDrawerToggle

    private val viewModel by viewModels<MainActivityViewModel>()
    private val appBar
        get() = binding.appbar.root
    private val drawerLayout
        get() = binding.root

    private lateinit var navHost: NavHostFragment

    private lateinit var navController: NavController

    private var backPressCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            setSupportActionBar(appbar.root)
            supportActionBar?.let {
                it.setDisplayHomeAsUpEnabled(true)
                it.setDisplayShowHomeEnabled(true)
                it.setDisplayShowTitleEnabled(false)
            }
            actionBarToggle = ActionBarDrawerToggle(this@MainActivity, root, appbar.root,
                R.string.drawer_open, R.string.drawer_close)
            actionBarToggle.isDrawerIndicatorEnabled = false
            actionBarToggle.syncState()
        }
        binding.root.addDrawerListener(actionBarToggle)
        actionBarToggle.setToolbarNavigationClickListener {
            with(binding.root){
                if (isDrawerVisible(GravityCompat.START))
                    closeDrawer(GravityCompat.START)
                else
                    openDrawer(GravityCompat.START)

            }
        }
        navHost = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        navController = navHost.navController
        onBackPressedDispatcher.addCallback(object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                backPressCount++
                this@MainActivity.handleOnBackPressed()
            }
        })
        binding.mainNavView.setNavigationItemSelectedListener{ this.onOptionsItemSelected(it) }
    }

    override fun onResume() {
        backPressCount = 0
        super.onResume()
    }

    fun handleOnBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
            return
        }
        if (backPressCount >= 3)
            finish()
        else
            Toast.makeText(
                this,
                String.format(getString(R.string.back_message), 3 - backPressCount),
                Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId){
        R.id.nav_dashboard -> navigateThrough(R.id.dashboardFragment)
        R.id.nav_physical_inventory -> navigateThrough(R.id.tomaFisicaFragment)
        R.id.nav_logout -> logout()
        else -> super.onOptionsItemSelected(item)
    }.also {
        logi("Navigation to menu: ${item.title}")
    }

    private fun navigateThrough(to: Int): Boolean {
        navController.navigate(to)
        return true
    }

    private fun logout(): Boolean {
        navController.navigate(R.id.loginActivity)
        finish()
        return true
    }


    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
    }
}