/*
 * Copyright 2004-2016 EPAM Systems
 * This file is part of Java Market Data Handler for CME Market Data (MDP 3.0).
 * Java Market Data Handler for CME Market Data (MDP 3.0) is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * Java Market Data Handler for CME Market Data (MDP 3.0) is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with Java Market Data Handler for CME Market Data (MDP 3.0).
 * If not, see <http://www.gnu.org/licenses/>.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/schema">http://java.sun.com/xml/schema</a>
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.18 at 01:02:39 PM MSK 
//


package com.epam.cme.mdp3.sbe.schema.vo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Set valid bit numbers
 * <p>
 * <p>Java class for setType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="setType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="choice" type="{http://www.fixprotocol.org/ns/simple/1.0}choice" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encodingType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setType", propOrder = {
        "choice"
})
public class SetType {

    @XmlElement(required = true)
    protected List<Choice> choice;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "encodingType", required = true)
    protected String encodingType;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the choice property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choice property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoice().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Choice }
     */
    public List<Choice> getChoice() {
        if (choice == null) {
            choice = new ArrayList<>();
        }
        return this.choice;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the encodingType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * Sets the value of the encodingType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEncodingType(String value) {
        this.encodingType = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
