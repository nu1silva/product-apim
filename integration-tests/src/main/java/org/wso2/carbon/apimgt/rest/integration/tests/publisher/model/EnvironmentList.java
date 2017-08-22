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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnvironmentList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T06:36:48.873Z")
public class EnvironmentList {
    @SerializedName("count")
    private Integer count = null;

    @SerializedName("list")
    private List<Environment> list = new ArrayList<Environment>();

    public EnvironmentList count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Number of Environments returned.
     *
     * @return count
     **/
    @ApiModelProperty(example = "1", value = "Number of Environments returned. ")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public EnvironmentList list(List<Environment> list) {
        this.list = list;
        return this;
    }

    public EnvironmentList addListItem(Environment listItem) {
        this.list.add(listItem);
        return this;
    }

    /**
     * Get list
     *
     * @return list
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<Environment> getList() {
        return list;
    }

    public void setList(List<Environment> list) {
        this.list = list;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentList environmentList = (EnvironmentList) o;
        return Objects.equals(this.count, environmentList.count) &&
                Objects.equals(this.list, environmentList.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, list);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentList {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

