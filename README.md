# androidthings-PiFaceDigital2-driver
This repository contains the Android Things driver to control the MCP23S17 chip on the PiFace Digital 2.

Only tested with a Raspberry Pi 3, but shouldn't be hard to adapt for other boards too.

## PiFace Digital 2

![Image of PiFace Digital 2](https://www.element14.com/community/dtss-images/uploads/devtool/image/large/PiFace+Digital+2+for+Raspberry+Pi+5511ec19dca72.png)

PiFace Digital has eight inputs, eight outputs, eight LED’s, two relays and four switches.

## Using

To use it in your Android Things project:

```java
PiFaceDigital2 mPiFaceDigital2 = PiFaceDigital2.create(SPI_DEVICE_NAME);

// The LED’s are connected in parallel to each of the outputs
// This means that when you set output pin 4 high, LED 4 illuminates
mPiFaceDigital2.setOutputPin(4, true);
mPiFaceDigital2.setLED(4, true);

// The two Relays are connected in parallel to output pins 0 and 1 respectively.
// When you set output pin 0 high, LED 0 illuminates and Relay 0 activates.
mPiFaceDigital2.setOutputPin(0, true);
mPiFaceDigital2.setLED(0, true);
mPiFaceDigital2.setRelay(0, true);

// Later on
mPiFaceDigital2.close();
```

More info on the MCP23S17: http://ww1.microchip.com/downloads/en/DeviceDoc/20001952C.pdf