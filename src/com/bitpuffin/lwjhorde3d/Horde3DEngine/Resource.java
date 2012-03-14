package com.bitpuffin.lwjhorde3d.Horde3DEngine;

// Wtf is Friend class in C++? "friend class ResourceManager"

public abstract class Resource 
{
	
	////////////////////////////////////
	// ============================== //
	// =		Class variables		= //
	// ============================== //
	////////////////////////////////////
	
	//	Protected:
	protected int 			_type;
	protected String 		_name;
	protected ResHandle		_handle;
	protected int			_flags;
	//TODO Make unsigned,
	protected int			_refCount;
	protected int			_userRefCount;
	//end usign
	protected boolean		_loaded;
	protected boolean		_noQuery;
	
	////////////////////////////////////
	// ============================== //
	// = 		Constructor			= //
	// ============================== //
	////////////////////////////////////
	
	public Resource( int type, final String name, int flags ) {
		
	}
	
	////////////////////////////////////
	// ============================== //
	// =		Class Methods		= //
	// ============================== //
	////////////////////////////////////
	
	public abstract void initDefault();
	public abstract void release();
	public abstract boolean load( final char data, int size ); // data == ptr
	
	public
	void
	unload() {
		
	}
	
	public
	int
	findElem( int elem, int param, final char value ) { // value => ptr
		int temporaryReturn = 1;
		return temporaryReturn;
	}
	
	//////////////////////////////////////
	// ================================	//
	// =		Abstract Methods	  =	//
	// ================================	//
	//////////////////////////////////////
	
	public abstract int getElemCount( int elem );
	public abstract int getElemParamI( int elem, int elemIdx, int param );
	public abstract void setElemParamI( int elem, int elemIdx, int param, int value );
	public abstract float getElemParamF( int elem, int elemIdx, int param, int compIdx );
	public abstract void setElemParamF( int elem, int elemIdx, int param, int compIdx, float value );
	public abstract char getElemParamStr( int elem, int elemIdx, int param ); // Meth == ptr
	public abstract void setElemParamStr( int elem, int elemIdx, int param, final char value ); // value == ptr
	public abstract void mapStream( int elem, int elemIdx, int stream, boolean read, boolean write ); // Meth == ptr
	public abstract void unmapStream();
	
	//////////////////////////////////////////
	// ====================================	//
	// =		Getters & Setters	      =	//
	// ====================================	//
	//////////////////////////////////////////
	
	public
	int
	getType() {		//	&getType?
		return _type;
	}
	
	public 
	int
	getFlags() {
		return _flags;
	}
	
	public
	final String
	getName() {		// &getName?
		return _name;
	}
	
	public
	ResHandle
	getHandle() {
		return _handle;
	}
	
	public
	boolean
	isLoaded() {
		return _loaded;
	}
	
	public
	void
	addRef() {
		++_refCount;
	}
	
	public
	void
	subRef() {
		--_refCount;
	}
	
}