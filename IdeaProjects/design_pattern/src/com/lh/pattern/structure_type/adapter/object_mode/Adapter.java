package com.lh.pattern.structure_type.adapter.object_mode;

public class Adapter implements Ps2{
	Usb usb;
	public Adapter(Usb usb){
		this.usb = usb;
	}
	
	public void isPs2() {
		usb.isUsb();
	}
}
