require u-boot-ti.inc

include ${@ 'recipes-bsp/u-boot/ti-extras.inc' if d.getVar('TI_EXTRAS') else ''}

PR = "r0"

BRANCH = "ti-u-boot-2023.04"

SRC_URI += "file://0001-scripts-dtc-pylibfdt-libfdt.i_shipped-Use-SWIG_Appen.patch"

SRCREV = "0853d7725220d59130d8bcc59d01151cba64ffa0"
