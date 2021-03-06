/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Outcome
 */
public enum OutcomeEnum {

    // Pass
    PASS("Pass"),
    // Fail
    FAIL("Fail"),
    // CompileFail
    COMPILEFAIL("CompileFail"),
    // Skip
    SKIP("Skip");

    final String value;

    private OutcomeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OutcomeEnum fromValue(String value) {
        for (OutcomeEnum e : OutcomeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}