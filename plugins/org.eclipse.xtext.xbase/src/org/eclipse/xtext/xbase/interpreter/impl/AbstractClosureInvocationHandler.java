/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.interpreter.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractClosureInvocationHandler implements InvocationHandler {

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (isEquals(method)) {
			return proxy == args[0];
		}
		if (isHashCode(method)) {
			return System.identityHashCode(proxy);
		}
		if (isToString(method)) {
			return proxyToString(proxy);
		}
		return doInvoke(method, args);
	}

	/**
	 * @param proxy the proxy instance. May be used by inheritors.
	 */
	protected String proxyToString(Object proxy) {
		return toString();
	}

	protected abstract Object doInvoke(Method method, Object[] args) throws Throwable;

	protected boolean isHashCode(Method method) {
		return "hashCode".equals(method.getName()) 
			&& method.getParameterTypes().length == 0;
	}
	
	protected boolean isToString(Method method) {
		return "toString".equals(method.getName()) 
			&& method.getParameterTypes().length == 0;
	}

	protected boolean isEquals(Method method) {
		return "equals".equals(method.getName())
			&& method.getParameterTypes().length == 1
			&& Object.class.equals(method.getParameterTypes()[0]);
	}

}
