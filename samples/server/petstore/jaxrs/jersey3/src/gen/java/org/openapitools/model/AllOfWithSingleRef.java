/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.openapitools.model.SingleRefType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * AllOfWithSingleRef
 */
@JsonPropertyOrder({
  AllOfWithSingleRef.JSON_PROPERTY_USERNAME,
  AllOfWithSingleRef.JSON_PROPERTY_SINGLE_REF_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class AllOfWithSingleRef   {
  public static final String JSON_PROPERTY_USERNAME = "username";
  @JsonProperty(JSON_PROPERTY_USERNAME)
  private String username;

  public static final String JSON_PROPERTY_SINGLE_REF_TYPE = "SingleRefType";
  @JsonProperty(JSON_PROPERTY_SINGLE_REF_TYPE)
  private SingleRefType singleRefType;

  public AllOfWithSingleRef username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @JsonProperty(value = "username")
  @Schema(description = "")
  

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AllOfWithSingleRef singleRefType(SingleRefType singleRefType) {
    this.singleRefType = singleRefType;
    return this;
  }

  /**
   * Get singleRefType
   * @return singleRefType
   **/
  @JsonProperty(value = "SingleRefType")
  @Schema(description = "")
  

  public SingleRefType getSingleRefType() {
    return singleRefType;
  }

  public void setSingleRefType(SingleRefType singleRefType) {
    this.singleRefType = singleRefType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfWithSingleRef allOfWithSingleRef = (AllOfWithSingleRef) o;
    return Objects.equals(this.username, allOfWithSingleRef.username) &&
        Objects.equals(this.singleRefType, allOfWithSingleRef.singleRefType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, singleRefType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfWithSingleRef {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    singleRefType: ").append(toIndentedString(singleRefType)).append("\n");
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

