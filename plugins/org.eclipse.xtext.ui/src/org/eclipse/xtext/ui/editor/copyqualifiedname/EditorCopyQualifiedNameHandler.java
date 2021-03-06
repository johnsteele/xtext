/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.copyqualifiedname;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

/**
 * @author Anton Kosyakov - Initial contribution and API
 * @since 2.4
 */
public class EditorCopyQualifiedNameHandler extends AbstractCopyQualifiedNameHandler {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Override
	protected String getQualifiedName(ExecutionEvent event) {
		XtextEditor activeXtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (activeXtextEditor == null) {
			return null;
		}
		final ITextSelection selection = getTextSelection(activeXtextEditor);
		return activeXtextEditor.getDocument().readOnly(new IUnitOfWork<String, XtextResource>() {

			public String exec(XtextResource xTextResource) throws Exception {
				EObject context = getContext(selection, xTextResource);
				EObject selectedElement = getSelectedName(selection, xTextResource);
				return getQualifiedName(selectedElement, context);
			}

		});
	}

	private EObject getContext(final ITextSelection selection, XtextResource xTextResource) {
		return eObjectAtOffsetHelper.resolveContainedElementAt(xTextResource, selection.getOffset());
	}

	private EObject getSelectedName(final ITextSelection selection, XtextResource xTextResource) {
		return eObjectAtOffsetHelper.resolveElementAt(xTextResource, selection.getOffset());
	}

	private ITextSelection getTextSelection(XtextEditor activeXtextEditor) {
		return (ITextSelection) activeXtextEditor.getSelectionProvider().getSelection();
	}

}
