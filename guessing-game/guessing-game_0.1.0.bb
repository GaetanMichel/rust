# Auto-Generated by cargo-bitbake 0.3.15
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get guessing-game could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/guessing-game/0.1.0"
SRC_URI += "git://github.com/GaetanMichel/rust;protocol=https;nobranch=1;branch=main"
SRCREV = "6559c6f49f866e56b0700395f91f39b981264350"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV_append = ".AUTOINC+6559c6f49f"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/getrandom/0.2.3 \
    crate://crates.io/libc/0.2.97 \
    crate://crates.io/ppv-lite86/0.2.10 \
    crate://crates.io/rand/0.8.4 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/rand_hc/0.3.1 \
    crate://crates.io/wasi/0.10.2+wasi-snapshot-preview1 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=f3e38c1f1e0db893f5e9a1b4328246d3 \
"

SUMMARY = "Test with guessing game app"
HOMEPAGE = "https://github.com/GaetanMichel/rust/tree/main/guessing-game"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include guessing-game-${PV}.inc
include guessing-game.inc
