package com.google.android.settings;

import com.android.settingslib.metadata.FixedArrayMap;
import com.android.settingslib.metadata.PreferenceScreenMetadataFactory;

<<<<<<< PATCH SET (57a7e6f81b376384cba9f450b9ae687575c915b9 Settings: Implement reverse-engineered battery saver page)
import com.google.android.settings.fuelgauge.batterysaver.AdaptiveBatteryScreen;
import com.google.android.settings.fuelgauge.batterysaver.BatterySaverGoogleScreen;
import com.google.android.settings.fuelgauge.batterysaver.BatterySaverScheduleScreen;

public abstract class SettingsGoogleScreenCollector {

    public static FixedArrayMap<String, PreferenceScreenMetadataFactory> get() {
        return new FixedArrayMap<>(3, SettingsGoogleScreenCollector::init);
    }

    private static void init(
            FixedArrayMap.OrderedInitializer<String, PreferenceScreenMetadataFactory> initializer) {
        initializer.put(
                "adaptive_battery_entry",
                (PreferenceScreenMetadataFactory) AdaptiveBatteryScreen::new);
        initializer.put(
                "battery_saver_schedule",
                (PreferenceScreenMetadataFactory) context -> new BatterySaverScheduleScreen());
        initializer.put(
                "battery_saver_screen",
                (PreferenceScreenMetadataFactory) context -> new BatterySaverGoogleScreen());
=======
import com.google.android.settings.update.SoftwareUpdateScreen;

public abstract class SettingsGoogleScreenCollector {

    public static FixedArrayMap<String, PreferenceScreenMetadataFactory> get() {
        return new FixedArrayMap<>(1, SettingsGoogleScreenCollector::init);
    }

    private static void init(
            FixedArrayMap.OrderedInitializer<String, PreferenceScreenMetadataFactory> initializer) {
        initializer.put(
                "software_update_settings_v2",
                (PreferenceScreenMetadataFactory) context -> new SoftwareUpdateScreen());
>>>>>>> BASE      (6343fd6e4346eea67a05bd926919979f16446a66 Hide unavailable battery info)
    }
}
