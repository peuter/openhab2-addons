//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.25 at 03:39:54 PM CET 
//


package org.openhab.ui.cometvisu.internal.config.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for page complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layout" type="{}layout" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="page" type="{}page"/>
 *           &lt;element name="group" type="{}group"/>
 *           &lt;element name="navbar" type="{}navbar"/>
 *           &lt;group ref="{}Widgets"/>
 *           &lt;group ref="{}AvailablePlugins"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}flavour"/>
 *       &lt;attribute ref="{}align"/>
 *       &lt;attribute name="ga" type="{}addr" />
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="text"/>
 *             &lt;enumeration value="2d"/>
 *             &lt;enumeration value="3d"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="size">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="fixed"/>
 *             &lt;enumeration value="scaled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="backdrop" type="{}uri" />
 *       &lt;attribute name="showtopnavigation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="showfooter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shownavbar-top" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shownavbar-bottom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shownavbar-left" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shownavbar-right" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{}bind_click_to_widget"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page", propOrder = {
    "layout",
    "pageOrGroupOrNavbar"
})
public class Page {

    protected Layout layout;
    @XmlElementRefs({
        @XmlElementRef(name = "toggle", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "switch", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "group", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infotrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gauge", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "designtoggle", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pagejump", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "svg", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "multitrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diagram", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "timeout", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shade", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "page", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "audio", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rss", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infoaction", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "web", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "refresh", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rsslog", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rgb", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "break", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "info", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "urltrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "upnpcontroller", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "colorchooser", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "navbar", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "image", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "calendarlist", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "imagetrigger", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pushbutton", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wgplugin_info", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clock", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "slide", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "video", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strftime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "diagram_info", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "line", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reload", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pageOrGroupOrNavbar;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "flavour")
    protected String flavour;
    @XmlAttribute(name = "align")
    protected String align;
    @XmlAttribute(name = "ga")
    protected String ga;
    @XmlAttribute(name = "visible")
    protected Boolean visible;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "backdrop")
    protected String backdrop;
    @XmlAttribute(name = "showtopnavigation")
    protected Boolean showtopnavigation;
    @XmlAttribute(name = "showfooter")
    protected Boolean showfooter;
    @XmlAttribute(name = "shownavbar-top")
    protected Boolean shownavbarTop;
    @XmlAttribute(name = "shownavbar-bottom")
    protected Boolean shownavbarBottom;
    @XmlAttribute(name = "shownavbar-left")
    protected Boolean shownavbarLeft;
    @XmlAttribute(name = "shownavbar-right")
    protected Boolean shownavbarRight;
    @XmlAttribute(name = "bind_click_to_widget")
    protected Boolean bindClickToWidget;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link Layout }
     *     
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layout }
     *     
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the pageOrGroupOrNavbar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageOrGroupOrNavbar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageOrGroupOrNavbar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Infotrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Group }{@code >}
     * {@link JAXBElement }{@code <}{@link Switch }{@code >}
     * {@link JAXBElement }{@code <}{@link Toggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Designtoggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Gauge }{@code >}
     * {@link JAXBElement }{@code <}{@link Pagejump }{@code >}
     * {@link JAXBElement }{@code <}{@link Multitrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Svg }{@code >}
     * {@link JAXBElement }{@code <}{@link Diagram }{@code >}
     * {@link JAXBElement }{@code <}{@link Text }{@code >}
     * {@link JAXBElement }{@code <}{@link Info }{@code >}
     * {@link JAXBElement }{@code <}{@link Timeout }{@code >}
     * {@link JAXBElement }{@code <}{@link Trigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Audio }{@code >}
     * {@link JAXBElement }{@code <}{@link Page }{@code >}
     * {@link JAXBElement }{@code <}{@link Rss }{@code >}
     * {@link JAXBElement }{@code <}{@link Web }{@code >}
     * {@link JAXBElement }{@code <}{@link Infoaction }{@code >}
     * {@link JAXBElement }{@code <}{@link Include }{@code >}
     * {@link JAXBElement }{@code <}{@link Refresh }{@code >}
     * {@link JAXBElement }{@code <}{@link Rsslog }{@code >}
     * {@link JAXBElement }{@code <}{@link Rgb }{@code >}
     * {@link JAXBElement }{@code <}{@link Info }{@code >}
     * {@link JAXBElement }{@code <}{@link Break }{@code >}
     * {@link JAXBElement }{@code <}{@link Urltrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Navbar }{@code >}
     * {@link JAXBElement }{@code <}{@link Colorchooser }{@code >}
     * {@link JAXBElement }{@code <}{@link Upnpcontroller }{@code >}
     * {@link JAXBElement }{@code <}{@link Image }{@code >}
     * {@link JAXBElement }{@code <}{@link Calendarlist }{@code >}
     * {@link JAXBElement }{@code <}{@link Imagetrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link Pushbutton }{@code >}
     * {@link JAXBElement }{@code <}{@link WgpluginInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link Slide }{@code >}
     * {@link JAXBElement }{@code <}{@link Clock }{@code >}
     * {@link JAXBElement }{@code <}{@link Video }{@code >}
     * {@link JAXBElement }{@code <}{@link Strftime }{@code >}
     * {@link JAXBElement }{@code <}{@link Line }{@code >}
     * {@link JAXBElement }{@code <}{@link DiagramInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link Reload }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPageOrGroupOrNavbar() {
        if (pageOrGroupOrNavbar == null) {
            pageOrGroupOrNavbar = new ArrayList<JAXBElement<?>>();
        }
        return this.pageOrGroupOrNavbar;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the flavour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * Sets the value of the flavour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavour(String value) {
        this.flavour = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the ga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGa() {
        return ga;
    }

    /**
     * Sets the value of the ga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGa(String value) {
        this.ga = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the backdrop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackdrop() {
        return backdrop;
    }

    /**
     * Sets the value of the backdrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackdrop(String value) {
        this.backdrop = value;
    }

    /**
     * Gets the value of the showtopnavigation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowtopnavigation() {
        return showtopnavigation;
    }

    /**
     * Sets the value of the showtopnavigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowtopnavigation(Boolean value) {
        this.showtopnavigation = value;
    }

    /**
     * Gets the value of the showfooter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowfooter() {
        return showfooter;
    }

    /**
     * Sets the value of the showfooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowfooter(Boolean value) {
        this.showfooter = value;
    }

    /**
     * Gets the value of the shownavbarTop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShownavbarTop() {
        return shownavbarTop;
    }

    /**
     * Sets the value of the shownavbarTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShownavbarTop(Boolean value) {
        this.shownavbarTop = value;
    }

    /**
     * Gets the value of the shownavbarBottom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShownavbarBottom() {
        return shownavbarBottom;
    }

    /**
     * Sets the value of the shownavbarBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShownavbarBottom(Boolean value) {
        this.shownavbarBottom = value;
    }

    /**
     * Gets the value of the shownavbarLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShownavbarLeft() {
        return shownavbarLeft;
    }

    /**
     * Sets the value of the shownavbarLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShownavbarLeft(Boolean value) {
        this.shownavbarLeft = value;
    }

    /**
     * Gets the value of the shownavbarRight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShownavbarRight() {
        return shownavbarRight;
    }

    /**
     * Sets the value of the shownavbarRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShownavbarRight(Boolean value) {
        this.shownavbarRight = value;
    }

    /**
     * Gets the value of the bindClickToWidget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBindClickToWidget() {
        return bindClickToWidget;
    }

    /**
     * Sets the value of the bindClickToWidget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindClickToWidget(Boolean value) {
        this.bindClickToWidget = value;
    }

}
