/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sedona.viz.extension.photoFilter;

import org.apache.sedona.viz.core.PhotoFilter;

// TODO: Auto-generated Javadoc

/**
 * The Class Outline.
 */
public class Outline
        extends PhotoFilter
{

    /**
     * Instantiates a new outline.
     */
    public Outline()
    {
        super(1);
        this.convolutionMatrix[0][0] = -1.0;
        this.convolutionMatrix[1][0] = -1.0;
        this.convolutionMatrix[2][0] = -1.0;
        this.convolutionMatrix[0][1] = -1.0;
        this.convolutionMatrix[1][1] = 8.0;
        this.convolutionMatrix[2][1] = -1.0;
        this.convolutionMatrix[0][2] = -1.0;
        this.convolutionMatrix[1][2] = -1.0;
        this.convolutionMatrix[2][2] = -1.0;
    }
}