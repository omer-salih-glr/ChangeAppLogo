# ChangeAppLogo
Hello everyone, I will explain how we changed the logo of the application with onclick in this project.
After adding the logo you want to change as a 512*512 mipmap, check the manifest file and add them.


```xml
        <activity
            android:name=".MainActivity"
            android:exported="false"/>
        <activity-alias
            android:name=".OneLauncherAlias"
            android:enabled="true"
            android:exported="true"
            android:icon="@mipmap/ic_launcher_one_launcher"
            android:labeDl="@string/app_name"
            android:targetActivity=".MainActivity"
            tools:ignore="IntentFilterExportedReceiver">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity-alias>
        <activity-alias
            android:name=".TwoLauncherAlias"
            android:enabled="false"
            android:icon="@mipmap/ic_launcher_two_launcher"
            android:label="@string/secondLauncher"
            android:exported="true"
            android:targetActivity=".MainActivity"
            tools:ignore="IntentFilterExportedReceiver">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity-alias>
        <activity-alias
            android:name=".ThreeLauncherAlias"
            android:enabled="false"
            android:exported="true"
            android:icon="@mipmap/ic_launcher_three_launcher"
            android:label="@string/thirdLauncher"
            android:targetActivity=".MainActivity"
            tools:ignore="IntentFilterExportedReceiver">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity-alias>

```

Then, when you do this in the activity, you will be able to change your logo as shown in the video.
```kotlin
 private fun setOnclicklistener() {
        binding.firstLauncher.setOnClickListener {
            changeIcon(0)
        }
        binding.secondLauncher.setOnClickListener {
            changeIcon(1)
        }
        binding.thirdLauncher.setOnClickListener {
            changeIcon(2)
        }
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
```


https://github.com/omer-salih-glr/ChangeAppLogo/assets/74901557/436b4b23-19a2-47e0-8496-d2c2269b81b9

