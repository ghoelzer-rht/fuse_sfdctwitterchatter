/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist BackgroundDirection
 */
public enum BackgroundDirectionEnum {

    // TopToBottom
    TOPTOBOTTOM("TopToBottom"),
    // LeftToRight
    LEFTTORIGHT("LeftToRight"),
    // Diagonal
    DIAGONAL("Diagonal");

    final String value;

    private BackgroundDirectionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static BackgroundDirectionEnum fromValue(String value) {
        for (BackgroundDirectionEnum e : BackgroundDirectionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}