package com.app.changeapplogo

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.changeapplogo.databinding.ActivityMainBinding
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("UnspecifiedImmutableFlag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.firstLauncher.setOnClickListener {
            changeIcon(0)
        }
        binding.secondLauncher.setOnClickListener {
            changeIcon(1)
        }
        binding.thirdLauncher.setOnClickListener {
            changeIcon(2)
        }
        setContentView(binding.root)
    }

    private fun changeIcon(iconNumber: Int) {
        when (iconNumber) {
            0 -> {
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.OneLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP)
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.TwoLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.ThreeLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)

            }

            1 -> {
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.TwoLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP)
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.OneLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.ThreeLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)

            }

            2 -> {
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.ThreeLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP)
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.OneLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)
                packageManager.setComponentEnabledSetting(ComponentName(this@MainActivity, "com.app.changeapplogo.TwoLauncherAlias"), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP)
            }
        }

    }
}