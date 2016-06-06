            // Google Account
            PackageParser.Package googleaccountPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.gsf.login", userId);
            if (googleaccountPackage != null) {
                grantRuntimePermissionsLPw(googleaccountPackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleaccountPackage, PHONE_PERMISSIONS, userId);
            }

            // Google App
            PackageParser.Package googleappPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.googlequicksearchbox", userId);
            if (googleappPackage != null) {
                grantRuntimePermissionsLPw(googleappPackage, CALENDAR_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, CAMERA_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, LOCATION_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, MICROPHONE_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, PHONE_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, SMS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(googleappPackage, STORAGE_PERMISSIONS, userId);
            }

            // Google Play Services
            PackageParser.Package gmscorePackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.gms", userId);
            if (gmscorePackage != null) {
                grantRuntimePermissionsLPw(gmscorePackage, SENSORS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, CALENDAR_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, CAMERA_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, LOCATION_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, MICROPHONE_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, PHONE_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, SMS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gmscorePackage, STORAGE_PERMISSIONS, userId);
            }

			// Google Connectivity Services
            PackageParser.Package gcsPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.apps.gcs", userId);
            if (gcsPackage != null) {
                grantRuntimePermissionsLPw(gcsPackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gcsPackage, LOCATION_PERMISSIONS, userId);
            }

			// Google Contacts Sync
            PackageParser.Package googlecontactssyncPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.syncadapters.contacts", userId);
            if (googlecontactssyncPackage != null) {
                grantRuntimePermissionsLPw(googlecontactssyncPackage, CONTACTS_PERMISSIONS, userId);
            }			

			// Google Backup Transport
            PackageParser.Package googlebackuptransportPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.backuptransport", userId);
            if (googlebackuptransportPackage != null) {
                grantRuntimePermissionsLPw(googlebackuptransportPackage, CONTACTS_PERMISSIONS, userId);
            }			
			
			// Google Play Framework
            PackageParser.Package gsfcorePackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.gsf", userId);
            if (gsfcorePackage != null) {
                grantRuntimePermissionsLPw(gsfcorePackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(gsfcorePackage, PHONE_PERMISSIONS, userId);
            }		

			// Google Setup Wizard
            PackageParser.Package setupwizardPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.google.android.setupwizard", userId);
            if (setupwizardPackage != null) {
                grantRuntimePermissionsLPw(setupwizardPackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(setupwizardPackage, PHONE_PERMISSIONS, userId);
            }	

			// Google Play Store
            PackageParser.Package vendingPackage = getDefaultProviderAuthorityPackageLPr(
                    "com.android.vending", userId);
            if (vendingPackage != null) {
                grantRuntimePermissionsLPw(vendingPackage, CONTACTS_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(vendingPackage, PHONE_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(vendingPackage, LOCATION_PERMISSIONS, userId);
                grantRuntimePermissionsLPw(vendingPackage, SMS_PERMISSIONS, userId);
            }	
				
     private void grantDefaultPermissionsToDefaultSystemSmsAppLPr(
             PackageParser.Package smsPackage, int userId) {
         if (doesPackageSupportRuntimePermissions(smsPackage)) {
             grantRuntimePermissionsLPw(smsPackage, PHONE_PERMISSIONS, userId);
             grantRuntimePermissionsLPw(smsPackage, CONTACTS_PERMISSIONS, userId);
            grantRuntimePermissionsLPw(smsPackage, PHONE_PERMISSIONS, userId);
             grantRuntimePermissionsLPw(smsPackage, SMS_PERMISSIONS, userId);
            grantRuntimePermissionsLPw(smsPackage, STORAGE_PERMISSIONS, true, userId);
         }
     }			
