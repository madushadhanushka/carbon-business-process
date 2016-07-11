/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.bpel.ui.bpel2svg;

import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * Scope Interface.
 */
public interface ScopeInterface extends ActivityInterface {
    /**
     * At start: xLeft=0, yTop=0
     *
     * @param doc SVG document which defines the components including shapes, gradients etc. of the activity
     * @return Element(represents an element in a XML) which contains the TerminationHandler icon and arrow flows
     */
    public Element getTerminationHandlerIcon(SVGDocument doc);

    /**
     * At start: xLeft=0, yTop=0
     *
     * @param doc SVG document which defines the components including shapes, gradients etc. of the activity
     * @return Element(represents an element in a XML) which contains the FaultHandler icon and arrow flows
     */
    public Element getFaultHandlerIcon(SVGDocument doc);

    /**
     * At start: xLeft=0, yTop=0
     *
     * @param doc SVG document which defines the components including shapes, gradients etc. of the activity
     * @return Element(represents an element in a XML) which contains the CompensationHandler icon and arrow flows
     */
    public Element getCompensationHandlerIcon(SVGDocument doc);

    /**
     * At start: xLeft=0, yTop=0
     *
     * @param doc SVG document which defines the components including shapes, gradients etc. of the activity
     * @return Element(represents an element in a XML) which contains the EventHandler icon and arrow flows
     */
    public Element getEventHandlerIcon(SVGDocument doc);
}
