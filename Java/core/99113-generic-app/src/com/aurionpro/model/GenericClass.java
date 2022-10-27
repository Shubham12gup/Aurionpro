package com.aurionpro.model;

public class GenericClass<T extends Number> {

	private T obj;

	public GenericClass(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}
