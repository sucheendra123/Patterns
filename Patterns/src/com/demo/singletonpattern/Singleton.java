package com.demo.singletonpattern;

/**
 * @author Sucheendra
 * @version 0.1
 * @category Lazy Instatiation
 *
 */

class Singleton {

	public static Singleton obj;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (obj == null) {
			obj = new Singleton();
		}

		return obj;
	}
}


// Version 2

// making the getInstance() synchronized so that the method becomes Thread Safe

//version 3
//Static initializer based Java implementation of 
//singleton design pattern 

//Double Checked Locking based Java implementation of 
//singleton design pattern 

//class Singleton 
//{ 
//	private volatile static Singleton obj; 
//
//	private Singleton() {} 
//
//	public static Singleton getInstance() 
//	{ 
//		if (obj == null) 
//		{ 
//			// To make thread safe 
//			synchronized (Singleton.class) 
//			{ 
//				// check again as multiple threads 
//				// can reach above step 
//				if (obj==null) 
//					obj = new Singleton(); 
//			} 
//		} 
//		return obj; 
//	} 
//} 
