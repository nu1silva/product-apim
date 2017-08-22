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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * APIInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T05:38:36.290Z")
public class APIInfo extends BaseAPIInfo {
    @SerializedName("lifeCycleStatus")
    private String lifeCycleStatus = null;

    public APIInfo lifeCycleStatus(String lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
        return this;
    }

    /**
     * Get lifeCycleStatus
     *
     * @return lifeCycleStatus
     **/
    @ApiModelProperty(value = "")
    public String getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    public void setLifeCycleStatus(String lifeCycleStatus) {
        this.lifeCycleStatus = lifeCycleStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APIInfo apIInfo = (APIInfo) o;
        return Objects.equals(this.lifeCycleStatus, apIInfo.lifeCycleStatus) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lifeCycleStatus, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APIInfo {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
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

}

