package com.ch2.as7phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "IPhone " + this.getVersionNumber() + " says Zing";
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
    	System.out.println("IPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}
