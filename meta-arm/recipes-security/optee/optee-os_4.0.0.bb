require recipes-security/optee/optee-os.inc

DEPENDS += "dtc-native"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRCREV = "2a5b1d1232f582056184367fb58a425ac7478ec6"
SRC_URI += " \
    file://0003-optee-enable-clang-support.patch \
   "
