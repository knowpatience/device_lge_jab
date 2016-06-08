
PRODUCT_PACKAGE_OVERLAYS := \
    device/lge/jab/overlay-gms \
    device/lge/jab/overlay-nexus

PRODUCT_PROPERTY_OVERRIDES := \
	ro.com.android.dateformat=MM-dd-yyyy \
	ro.com.android.dataroaming=false \
	net.bt.name=Nexus 5 \
	ro.config.ringtone=Titania.ogg \
	ro.config.notification_sound=Tethys.ogg \
	ro.config.alarm_alert=Oxygen.ogg 

# Exclude live wallpapers
TARGET_EXCLUDE_LIVEWALLPAPERS := true

$(call inherit-product-if-exists, vendor/google/device-partial.mk)
$(call inherit-product, device/lge/hammerhead/full_hammerhead.mk)

PRODUCT_BUILD_PROP_OVERRIDES += \
    BUILD_FINGERPRINT=google/hammerhead/hammerhead:6.0.1/MOB30H/2751534:user/release-keys \
    PRIVATE_BUILD_DESC="hammerhead-user 6.0.1 MOB30H 2751534 release-keys" \
    BUILD_ID=MOB30H

# Reduce client buffer size for fast audio output tracks
PRODUCT_PROPERTY_OVERRIDES += \
    af.fast_track_multiplier=1
# Low latency audio buffer size in frames
PRODUCT_PROPERTY_OVERRIDES += \
    audio_hal.period_size=192

# Extra Apps
PRODUCT_PACKAGES += \
    FakeNexusProvision \
    Terminal \
    libjni_terminal \

PRODUCT_NAME := jab
