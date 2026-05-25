-keep class com.rattynavien.aimusicapp.** { *; }
-keepattributes Signature
-keepattributes *Annotation*
-keep class com.squareup.okhttp3.** { *; }
-keep interface com.squareup.okhttp3.** { *; }
-keep class retrofit2.** { *; }
-keepattributes EnclosingMethod
-keepclasseswithmembers class * {
    @com.google.gson.annotations.SerializedName <fields>;
}