SUMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

#In the recipe, you just need to define the location of the kernel module 
#source code, and inherit module.bbclass to build the kernel module
inherit module

#copy files to workdir to build it
SRC_URI =   "file://hello_world.c \
            file://Makefile \
            file://COPYING \
            "

S = "${WORKDIR}"
 
RPROVIDES_${PN} += "hello_world" 
#FILES_${PN} += "${base_libdir}/modules/"