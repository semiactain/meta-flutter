#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "desktop_photo_search"
DESCRIPTION = "Search for Photos, using the Unsplash API."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "a0466d05202e80d2faf1c322b6ff7542bcf0d54f"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "desktop_photo_search"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-desktop-photo-search-material"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "desktop_photo_search/material"

inherit flutter-app

do_compile[network] = "1"

