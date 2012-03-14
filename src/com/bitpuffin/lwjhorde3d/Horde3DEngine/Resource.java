package com.bitpuffin.lwjhorde3d.Horde3DEngine;

public abstract class Resource {
	
	public
	Resource(int type, final String name, int flags) {
		
	}
	
	public abstract void initDefault();
	public abstract void release();
	public abstract boolean load(final char data, int size);
	
	public
	void
	unload(){
		
	}
	
	public
	int
	findElem(int elem, int param, final char value){
		int temporaryReturn = 1;
		return temporaryReturn;
	}
	
}
