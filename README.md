# ChangeAppLogo
Hello everyone, I will explain how we changed the logo of the application with onclick in this project.
After adding the logo you want to change as a 512*512 mipmap, check the manifest file and add them.
        <activity
            android:name=".MainActivity"
            android:exported="false"/>
        <activity-alias
            android:name=".OneLauncherAlias"
            android:enabled="true"
            android:exported="true"
            android:icon="@mipmap/ic_launcher_one_launcher"
            android:label="@string/app_name"
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


https://github.com/omer-salih-glr/ChangeAppLogo/assets/74901557/436b4b23-19a2-47e0-8496-d2c2269b81b9

