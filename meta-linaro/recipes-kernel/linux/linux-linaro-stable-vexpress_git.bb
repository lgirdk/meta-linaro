DESCRIPTION = "Linaro Stable Kernel For Vexpress/KVM"

require linaro-kernel.inc

SRCREV = "05f74e8baccb60882ace4d0165887368e8143f3f"
PV = "3.10+git${SRCPV}"

KERNEL_DEVICETREE = "vexpress-v2p-ca15-tc1.dtb"

BOOTARGS_COMMON = "root=/dev/mmcblk0p2 console=ttyAMA0 consolelog=9 mem=1024M rw rootwait"

SRC_URI = "git://git.linaro.org/kernel/linux-linaro-stable.git;protocol=http;branch=linux-linaro-lsk-v3.10"


