/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Environment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T06:36:48.873Z")
public class Environment {
    @SerializedName("name")
    private String name = null;

    @SerializedName("type")
    private String type = null;

    @SerializedName("serverUrl")
    private String serverUrl = null;

    @SerializedName("showInApiConsole")
    private Boolean showInApiConsole = null;

    @SerializedName("endpoints")
    private EnvironmentEndpoints endpoints = null;

    public Environment name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Production and Sandbox", required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Environment type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(example = "hybrid", required = true, value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Environment serverUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Get serverUrl
     *
     * @return serverUrl
     **/
    @ApiModelProperty(example = "https://localhost:9443//services/", required = true, value = "")
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public Environment showInApiConsole(Boolean showInApiConsole) {
        this.showInApiConsole = showInApiConsole;
        return this;
    }

    /**
     * Get showInApiConsole
     *
     * @return showInApiConsole
     **/
    @ApiModelProperty(example = "true", required = true, value = "")
    public Boolean getShowInApiConsole() {
        return showInApiConsole;
    }

    public void setShowInApiConsole(Boolean showInApiConsole) {
        this.showInApiConsole = showInApiConsole;
    }

    public Environment endpoints(EnvironmentEndpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get endpoints
     *
     * @return endpoints
     **/
    @ApiModelProperty(example = "null", required = true, value = "")
    public EnvironmentEndpoints getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(EnvironmentEndpoints endpoints) {
        this.endpoints = endpoints;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Environment environment = (Environment) o;
        return Objects.equals(this.name, environment.name) &&
                Objects.equals(this.type, environment.type) &&
                Objects.equals(this.serverUrl, environment.serverUrl) &&
                Objects.equals(this.showInApiConsole, environment.showInApiConsole) &&
                Objects.equals(this.endpoints, environment.endpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, serverUrl, showInApiConsole, endpoints);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Environment {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
        sb.append("    showInApiConsole: ").append(toIndentedString(showInApiConsole)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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

