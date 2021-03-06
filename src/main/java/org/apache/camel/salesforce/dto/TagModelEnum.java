/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TagModel
 */
public enum TagModelEnum {

    // U
    U("U"),
    // G
    G("G"),
    // R
    R("R");

    final String value;

    private TagModelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TagModelEnum fromValue(String value) {
        for (TagModelEnum e : TagModelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}