/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text.contentassist;

import org.eclipse.swt.widgets.Widget;


/**
 * Helper class for testing widget state.
 */
class Helper {
	
	/**
	 * Returns whether the widget is <code>null</code> or disposed.
	 *
	 * @param widget the widget to check
	 * @return <code>true</code> if the widget is neither <code>null</code> nor disposed
	 */
	public static boolean okToUse(Widget widget) {
		return (widget != null && !widget.isDisposed());
	}
}
