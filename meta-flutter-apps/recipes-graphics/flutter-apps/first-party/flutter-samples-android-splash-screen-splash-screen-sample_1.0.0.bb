#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "splash_screen_sample"
DESCRIPTION = "A sample Flutter app with animated splash screen on Android 12."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "d62c784789683f09b92b81f964968251d5d630b7"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${UNPACKDIR}/git"

PUBSPEC_APPNAME = "splash_screen_sample"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-android-splash-screen-splash-screen-sample"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "android_splash_screen"

inherit flutter-app
