//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.25 at 03:39:54 PM CET 
//


package org.openhab.ui.cometvisu.internal.config.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="icon" type="{}icon"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}range"/>
 *       &lt;attribute ref="{}value"/>
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entry", propOrder = {
    "content"
})
public class Entry {

    @XmlElementRef(name = "icon", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "default")
    protected Boolean _default;
    @XmlAttribute(name = "range_min")
    protected Float rangeMin;
    @XmlAttribute(name = "range_max")
    protected Float rangeMax;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Icon }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the rangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRangeMin() {
        return rangeMin;
    }

    /**
     * Sets the value of the rangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRangeMin(Float value) {
        this.rangeMin = value;
    }

    /**
     * Gets the value of the rangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRangeMax() {
        return rangeMax;
    }

    /**
     * Sets the value of the rangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRangeMax(Float value) {
        this.rangeMax = value;
    }

}
