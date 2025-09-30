# Practical-2: Activity Lifecycle & Basic UI Demonstration

## Project Overview:

This Android application showcases the Activity Lifecycle and a basic UI. The main screen displays a "Hello World" `TextView` centered on the screen, with custom styling, along with Log messages, Toasts, and Snackbars for each lifecycle method.

### Features & Requirements

+ **Activity Lifecycle**: All lifecycle callbacks (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`, etc.) should:
  + Display a Toast
+ **UI Design:**
  + Background color: Yellow (android:background="#FFFF00")
  + TextView in the center displaying “Hello World”
  + TextView attributes:
      + Text color: Holo Blue Bright (@android:color/holo_blue_bright)
      + Font size: 27sp
      + Text style: Bold & Italic (bold|italic)
+ **Layout:** Use ConstraintLayout; generate an ID for the TextView

### Setup Instructions
1. Clone or download this project.
2. Open it in Android Studio.
3. Run the app on an emulator or physical device.
4. Observe:
   - The styled "Hello World" `TextView`
   - Lifecycle callbacks in Logcat
   - Toast messages as each lifecycle method is triggered
### Usage
+ Launch the app.
+ Perform actions such as:
  - Launching the activity
  - Pressing Home or switching apps
  - Returning to the app
+ Watch for:
  - Logcat entries for each lifecycle method
  - Toasts and Snackbars displaying lifecycle events
    (E.g.: "onPause called" appears via both a Toast and a Snackbar)

### Screenshots
Below are screenshots demonstrating the application UI :

<img width="1080" height="2400" alt="image" src="https://github.com/user-attachments/assets/c6c3242f-8f03-4df4-be0f-6bdafbc2450a" />
<img width="1070" height="86" alt="Screenshot 2025-09-30 174650" src="https://github.com/user-attachments/assets/e29f756c-f3ec-42d6-b203-275944eb6e39" />
<img width="1444" height="91" alt="Screenshot 2025-09-30 174704" src="https://github.com/user-attachments/assets/1b596f49-2a0c-4877-9820-3037b7771776" />
<img width="1356" height="202" alt="Screenshot 2025-09-30 174720" src="https://github.com/user-attachments/assets/a2ee9d49-3b91-44ba-9f45-2461d59f5976" />






### Activity Lifecycle Summary
Here’s a short explanation of each lifecycle method used in this project:

`onCreate()` → Called once when the activity is created. Initialize UI, set up layouts.

`onStart()` → Activity becomes visible to the user.

`onResume()` → Activity is now active and ready for interaction.

`onPause()` → Another activity is partially covering it. Pause lightweight processes.

`onStop()` → Activity is completely hidden. Release heavy resources.

`onRestart()` → Called before onStart() if activity is coming back from stopped state.

`onDestroy()` → Final cleanup before activity is destroyed.

⚡ Quick flow: Create → Start → Resume → (Running) → Pause → Stop → Restart/Destroy

### Further Notes
+ Ensure ConstraintLayout is used in activity_main.xml

+ Use android:id="@+id/textViewHelloWorld" (or similar) for TextView

+ Include lifecycle callbacks in MainActivity.kt, e.g.:


```kotlin
    override fun onStart(){
    super.onStart()
    Log.d(TAG, "onStart called")
    Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    Snackbar.make(findViewById(R.id.textViewHelloWorld), "onStart", Snackbar.LENGTH_SHORT).show()
    }
