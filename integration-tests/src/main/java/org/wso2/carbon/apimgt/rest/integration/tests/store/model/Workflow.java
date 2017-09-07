/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.store.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Workflow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T05:38:36.290Z")
public class Workflow {
    @SerializedName("status")
    private StatusEnum status = null;
    @SerializedName("attributes")
    private Map<String, String> attributes = null;
    @SerializedName("description")
    private String description = null;

    public Workflow status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * This attribute declares whether this workflow task is approved or rejected.
     *
     * @return status
     **/
    @ApiModelProperty(example = "APPROVED", required = true, value = "This attribute declares whether this workflow task is approved or rejected. ")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Workflow attributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Workflow putAttributesItem(String key, String attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<String, String>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    /**
     * Custom attributes to complete the workflow task
     *
     * @return attributes
     **/
    @ApiModelProperty(example = "{}", value = "Custom attributes to complete the workflow task ")
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Workflow description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(example = "Approve workflow request.", value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Workflow workflow = (Workflow) o;
        return Objects.equals(this.status, workflow.status) &&
                Objects.equals(this.attributes, workflow.attributes) &&
                Objects.equals(this.description, workflow.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, attributes, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Workflow {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * This attribute declares whether this workflow task is approved or rejected.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        APPROVED("APPROVED"),

        REJECTED("REJECTED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
