do_install:prepend() {
    sed -i '/^dhcp-range=/d' ${WORKDIR}/dnsmasq.conf
}
