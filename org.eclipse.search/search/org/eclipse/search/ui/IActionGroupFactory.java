/*
 * Copyright (c) 2000, 2002 IBM Corp. and others..
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v0.5
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v05.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 */
package org.eclipse.search.ui;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.actions.ActionGroup;

/**
 * Allows to specify an <code>ActionGroup</code> factory
 * which will be used by the Search view to create an
 * <code>ActionGroup</code> which is used to build the
 * actions bars and the context menu.
 * <p>
 * Note: Local tool bar contributions are not supported in 2.0.
 * </p>
 * 
 * Clients can implement this interface and pass an
 * instance to the search result view.
 * 
 * @see	org.eclipse.ui.actions.ActionGroup
 * @see	ISearchResultView#searchStarted
 * @since 	2.0
 */
public interface IActionGroupFactory {

	/**
	 * Creates an <code>ActionGroup</code> for a Search view.
	 *
	 * @param 	searchView the search result view for which the group is made
	 * @see	org.eclipse.ui.actions.ActionGroup
	 */
	ActionGroup createActionGroup(ISearchResultView searchView);
}
