#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "gma_mediation_unity_example"
DESCRIPTION = "Demonstrates how to use the gma_mediation_unity plugin."
AUTHOR = "Goolge Ads"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "1cce28065c6b50b9c8c3568fe63dc32259a7665e"
SRC_URI = "git://github.com/googleads/googleads-mobile-flutter.git;lfs=0;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "gma_mediation_unity_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "googleads-flutter-packages-mediation-gma-mediation-unity-example"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "packages/mediation/gma_mediation_unity/example"

inherit flutter-app
