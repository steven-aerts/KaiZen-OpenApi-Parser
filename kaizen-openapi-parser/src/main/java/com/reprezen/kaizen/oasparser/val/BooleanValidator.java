/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.reprezen.kaizen.oasparser.val;

import com.fasterxml.jackson.databind.node.BooleanNode;
import com.reprezen.kaizen.oasparser.jsonoverlay.BooleanOverlay;

public class BooleanValidator extends OverlayValidator<BooleanOverlay> {

    @Override
    public void validate(BooleanOverlay overlay, ValidationResults results) {
        super.validate(overlay, results, BooleanNode.class);
    }
}
