/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TemplateStyle
 */
public enum TemplateStyleEnum {

    // none
    NONE("none"),
    // freeForm
    FREEFORM("freeForm"),
    // formalLetter
    FORMALLETTER("formalLetter"),
    // promotionRight
    PROMOTIONRIGHT("promotionRight"),
    // promotionLeft
    PROMOTIONLEFT("promotionLeft"),
    // newsletter
    NEWSLETTER("newsletter"),
    // products
    PRODUCTS("products");

    final String value;

    private TemplateStyleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TemplateStyleEnum fromValue(String value) {
        for (TemplateStyleEnum e : TemplateStyleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}