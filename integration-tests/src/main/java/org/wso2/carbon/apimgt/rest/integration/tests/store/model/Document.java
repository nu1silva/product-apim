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
 * Document
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T05:38:36.290Z")
public class Document {
    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("name")
    private String name = null;
    @SerializedName("type")
    private TypeEnum type = null;
    @SerializedName("summary")
    private String summary = null;
    @SerializedName("sourceType")
    private SourceTypeEnum sourceType = null;
    @SerializedName("sourceUrl")
    private String sourceUrl = null;
    @SerializedName("inlineContent")
    private String inlineContent = null;
    @SerializedName("otherTypeName")
    private String otherTypeName = null;

    public Document documentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Get documentId
     *
     * @return documentId
     **/
    @ApiModelProperty(value = "")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Document name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Document summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     *
     * @return summary
     **/
    @ApiModelProperty(value = "")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Document sourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     *
     * @return sourceType
     **/
    @ApiModelProperty(required = true, value = "")
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public Document sourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Get sourceUrl
     *
     * @return sourceUrl
     **/
    @ApiModelProperty(value = "")
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Document inlineContent(String inlineContent) {
        this.inlineContent = inlineContent;
        return this;
    }

    /**
     * Get inlineContent
     *
     * @return inlineContent
     **/
    @ApiModelProperty(value = "")
    public String getInlineContent() {
        return inlineContent;
    }

    public void setInlineContent(String inlineContent) {
        this.inlineContent = inlineContent;
    }

    public Document otherTypeName(String otherTypeName) {
        this.otherTypeName = otherTypeName;
        return this;
    }

    /**
     * Get otherTypeName
     *
     * @return otherTypeName
     **/
    @ApiModelProperty(value = "")
    public String getOtherTypeName() {
        return otherTypeName;
    }

    public void setOtherTypeName(String otherTypeName) {
        this.otherTypeName = otherTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Document document = (Document) o;
        return Objects.equals(this.documentId, document.documentId) &&
                Objects.equals(this.name, document.name) &&
                Objects.equals(this.type, document.type) &&
                Objects.equals(this.summary, document.summary) &&
                Objects.equals(this.sourceType, document.sourceType) &&
                Objects.equals(this.sourceUrl, document.sourceUrl) &&
                Objects.equals(this.inlineContent, document.inlineContent) &&
                Objects.equals(this.otherTypeName, document.otherTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, type, summary, sourceType, sourceUrl, inlineContent, otherTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Document {\n");

        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    inlineContent: ").append(toIndentedString(inlineContent)).append("\n");
        sb.append("    otherTypeName: ").append(toIndentedString(otherTypeName)).append("\n");
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
     * Gets or Sets type
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        HOWTO("HOWTO"),

        SAMPLES("SAMPLES"),

        PUBLIC_FORUM("PUBLIC_FORUM"),

        SUPPORT_FORUM("SUPPORT_FORUM"),

        API_MESSAGE_FORMAT("API_MESSAGE_FORMAT"),

        SWAGGER_DOC("SWAGGER_DOC"),

        OTHER("OTHER");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Gets or Sets sourceType
     */
    @JsonAdapter(SourceTypeEnum.Adapter.class)
    public enum SourceTypeEnum {
        INLINE("INLINE"),

        URL("URL"),

        FILE("FILE");

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        public static SourceTypeEnum fromValue(String text) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<SourceTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SourceTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

