### BuildConfig
-keep class com.example.BuildConfig { *; }

### Lines numbers
-keepattributes SourceFile, LineNumberTable, *Annotation*
-keep public class * extends java.lang.Exception

### LogCat
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** w(...);
    public static *** i(...);
    public static *** v(...);
}
