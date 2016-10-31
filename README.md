# Raven

Location-based Content Sharing Network



## App Stores

NOT SUPPORTS YET. ~~Go to "https://play.google.com/store/apps" and search "Raven"!~~ 



## Tests

#### Works on
* Android 4.4 (Kitkat)or higher

~~#### Does not work on~~



## Development setup (Contributing)

#### IDE
* [Android Studio 2.2](https://developer.android.com/studio/index.html)
* [Java SE 8u101](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
 
#### APIs
* Firebase > [Console](https://console.firebase.google.com)
  * Firebase [setup](https://firebase.google.com/docs/android/setup)
    * Prerequisites
      * A device running Android 2.3 (Gingerbread) or newer, and Google Play services 9.6.0 or newer
      * The Google Repository from the Android SDK Manager
      * Android Studio 1.5 or higher
    * Add Firevase to your app
      * Make sure you have an Android project created in Android Studio
      * Go to console.firebase.google.com
      * Click on Create New Project and name your project
      * **Package name** is found under Project view in Android Studio in the following directory:
      * app > src > build.gradle under applicationId
    * Obtaining SHA1 key
      * Firebase Console -> Raven -> Project Settings -> General -> Your apps -> Raven Android -> ADD FINGERPRINT
      * https://developers.google.com/android/guides/client-auth
      
      * Type in Terminal:
      * keytool -exportcert -list -v -alias androiddebugkey -keystore ~/.android/debug.keystore
      * Password is “android” ~~(It will change later)~~
      * Copy and paste SHA1 value in Firebase console
      * Download the google-services-json file and move it into the app folder of your project in Android Studio.
    * Add the SDK
      * In root-level build.gradle file, add these rules:
      ```Java
     buildscript {
                 // ...
                 dependencies {
                 // ...
                 classpath 'com.google.gms:google-services:3.0.0'
                 }
      }
      ```
        * In app/build.gradle, add these rules:
        ```Java
        dependencies {
                 compile 'com.google.firebase:firebase-core:9.4.0'
                 compile 'com.google.firebase:firebase-database:9.4.0'
                 compile 'com.google.firebase:firebase-storage:9.4.0'
                 compile 'com.google.firebase:firebase-auth:9.4.0'
        }
        // ADD THIS AT THE BOTTOM
        apply plugin: 'com.google.gms.google-services'
        ```
    * References: https://firebase.google.com/docs/android/setup
* Google Maps APIs > Android > [Maps Android API](https://developers.google.com/maps/documentation/android-api)
  * Example Code: Custom Markers and Info windows
    * References: https://developers.google.com/maps/documentation/android-api/
      ```Java
      import com.google.android.gms.maps.*;
      import com.google.android.gms.maps.model.*;
      import android.app.Activity;
      import android.os.Bundle;
      
      public class MapPane extends Activity implements OnMapReadyCallback {
          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.map_activity);
              MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
              mapFragment.getMapAsync(this);
          }
          
          @Override
          public void onMapReady(GoogleMap map) {
              map.moveCamera(CameraUpdateFactory.newLatLngZoom(
                      new LatLng(41.889, -87.622), 16));
      
              // You can customize the marker image using images bundled with
              // your app, or dynamically generated bitmaps.
              map.addMarker(new MarkerOptions()
                      .icon(BitmapDescriptorFactory.fromResource(R.drawable.house_flag))
                      .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                      .position(new LatLng(41.889, -87.622)));
          }
      }
      ```

#### Collaboration
* [Google Drive](https://drive.google.com)
* [Google Hangouts](https://hangouts.google.com)
* [GitHub](https://github.com/nameisyoung/Raven)

#### Design
* [Photoshop](https://www.adobe.com/products/photoshop.html)
* [Illustator](https://www.adobe.com/products/illustrator.html)



## Version

* 0.0.2
  * 2016-10-31: Gradle update for Firebase 9.8.0
* 0.0.1
  * 2016-09-21: Work in progress



## Credits

* Younggun Chung
* Thanh Quang
* Bhargava Ramisetty
* Lindsey Zylstra


## License



## Contact
