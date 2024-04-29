# IMAD-assignment-2

Sure, I'll explain the code you provided:

1. `MainActivity` class: This is the main activity of your Android application. It extends `AppCompatActivity`, which provides compatibility features for older versions of Android.

2. Properties:
   - `petHealth`, `petHunger`, and `petCleanLiness`: These are private variables representing the health, hunger, and cleanliness levels of a pet.

3. `onCreate` method:
   - This method is called when the activity is first created. 
   - `super.onCreate(savedInstanceState)`: Calls the superclass implementation of `onCreate`.
   - `setContentView(R.layout.activity_main)`: Sets the content view of the activity to the layout defined in `activity_main.xml`.

4. Finding Views:
   - `findViewById`: Finds views in the layout by their IDs and assigns them to variables.
   - `val btn_feed`, `btn_clean`, `btnHappy`: Buttons for feeding, cleaning, and making the pet happy.
   - `val txtHunger`, `txtClean`, `txtHappy`: EditText fields for displaying hunger, cleanliness, and health levels.
   - `val petImage`: ImageView for displaying the pet's image.

5. Setting Initial Text Values:
   - Sets the initial values of hunger, cleanliness, and health levels in the EditText fields.

6. Handling Button Clicks:
   - `btn_feed.setOnClickListener`: Decreases hunger, increases health, updates hunger text, and animates the pet image when the feed button is clicked.
   - `btn_clean.setOnClickListener`: Increases cleanliness, increases health, updates cleanliness text, and animates the pet image when the clean button is clicked.
   - `btnHappy.setOnClickListener`: Increases health, increases hunger (assuming it's a happy interaction), decreases cleanliness (assuming it's a playful interaction), updates health text, and animates the pet image when the happy button is clicked.

7. `animateImageChange` function:
   - Animates the change of the pet's image using an AlphaAnimation.
   - It sets the duration of the animation, ensures it persists after completion (`fillAfter`), starts the animation on the ImageView, and sets the new image resource.

Overall, this code sets up a basic Android app where the user can interact with buttons to simulate taking care of a virtual pet, with corresponding changes displayed in EditText fields and animated images.
