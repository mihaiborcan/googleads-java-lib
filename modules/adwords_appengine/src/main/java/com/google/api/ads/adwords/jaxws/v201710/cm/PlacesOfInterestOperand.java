// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201710.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This operand specifies a place of interest category for semantic targeting.
 *           
 * 
 * <p>Java class for PlacesOfInterestOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacesOfInterestOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201710}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="category" type="{https://adwords.google.com/api/adwords/cm/v201710}PlacesOfInterestOperand.Category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacesOfInterestOperand", propOrder = {
    "category"
})
public class PlacesOfInterestOperand
    extends FunctionArgumentOperand
{

    @XmlSchemaType(name = "string")
    protected PlacesOfInterestOperandCategory category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesOfInterestOperandCategory }
     *     
     */
    public PlacesOfInterestOperandCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesOfInterestOperandCategory }
     *     
     */
    public void setCategory(PlacesOfInterestOperandCategory value) {
        this.category = value;
    }

}
