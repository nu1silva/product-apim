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
import java.util.Objects;

/**
 * WorkflowResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T05:38:36.290Z")
public class WorkflowResponse {
    @SerializedName("workflowStatus")
    private WorkflowStatusEnum workflowStatus = null;
    @SerializedName("jsonPayload")
    private String jsonPayload = null;

    public WorkflowResponse workflowStatus(WorkflowStatusEnum workflowStatus) {
        this.workflowStatus = workflowStatus;
        return this;
    }

    /**
     * This attribute declares whether this workflow task is approved or rejected.
     *
     * @return workflowStatus
     **/
    @ApiModelProperty(example = "APPROVED", required = true, value = "This attribute declares whether this workflow task is approved or rejected. ")
    public WorkflowStatusEnum getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public WorkflowResponse jsonPayload(String jsonPayload) {
        this.jsonPayload = jsonPayload;
        return this;
    }

    /**
     * Attributes that returned after the workflow execution
     *
     * @return jsonPayload
     **/
    @ApiModelProperty(value = "Attributes that returned after the workflow execution ")
    public String getJsonPayload() {
        return jsonPayload;
    }

    public void setJsonPayload(String jsonPayload) {
        this.jsonPayload = jsonPayload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowResponse workflowResponse = (WorkflowResponse) o;
        return Objects.equals(this.workflowStatus, workflowResponse.workflowStatus) &&
                Objects.equals(this.jsonPayload, workflowResponse.jsonPayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowStatus, jsonPayload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowResponse {\n");

        sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
        sb.append("    jsonPayload: ").append(toIndentedString(jsonPayload)).append("\n");
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
    @JsonAdapter(WorkflowStatusEnum.Adapter.class)
    public enum WorkflowStatusEnum {
        CREATED("CREATED"),

        APPROVED("APPROVED"),

        REJECTED("REJECTED"),

        REGISTERED("REGISTERED");

        private String value;

        WorkflowStatusEnum(String value) {
            this.value = value;
        }

        public static WorkflowStatusEnum fromValue(String text) {
            for (WorkflowStatusEnum b : WorkflowStatusEnum.values()) {
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

        public static class Adapter extends TypeAdapter<WorkflowStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final WorkflowStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public WorkflowStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return WorkflowStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

