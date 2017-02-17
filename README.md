# androidthings-PiFaceDigital2-driver
This repository contains the Android Things driver to control the MCP23S17 chip on the PiFace Digital 2.

Only tested with a Raspberry Pi 3, but shouldn't be hard to adapt for other boards too.

## Using

To use it in your Android Things project:

```java
PiFaceDigital2 mPiFaceDigital2 = PiFaceDigital2.create(SPI_DEVICE_NAME);

// Then you can simply set LEDs and Relays on and off
mPiFaceDigital2.setLED(0, true);

// Later on
mPiFaceDigital2.close();
```

More info on the MCP23S17: http://ww1.microchip.com/downloads/en/DeviceDoc/20001952C.pdf