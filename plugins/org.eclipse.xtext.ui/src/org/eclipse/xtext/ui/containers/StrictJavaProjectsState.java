/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.containers;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Singleton
public class StrictJavaProjectsState extends AbstractJavaProjectsState {

	@Inject
	private JavaProjectsStateHelper helper;
	
	@Override
	protected String doInitHandle(URI uri) {
		return helper.initHandle(uri);
	}

	@Override
	protected Collection<URI> doInitContainedURIs(String containerHandle) {
		return helper.initContainedURIs(containerHandle);
	}
	
	@Override
	protected List<String> doInitVisibleHandles(String handle) {
		return helper.initVisibleHandles(handle);
	}
	
	public JavaProjectsStateHelper getHelper() {
		return helper;
	}
	
	public void setHelper(JavaProjectsStateHelper helper) {
		this.helper = helper;
	}
}
