package co.com.beca.microservice.resolveEnigmaApi.model;

import java.util.Objects;
import co.com.beca.microservice.resolveEnigmaApi.model.GetEnigmaRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JsonApiBodyRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-02-27T20:20:35.485896300-05:00[America/Bogota]")
public class JsonApiBodyRequest   {
  @JsonProperty("data")
  @Valid
  private List<GetEnigmaRequest> data;

  public JsonApiBodyRequest data(List<GetEnigmaRequest> data) {
    this.data = data;
    return this;
  }

  public JsonApiBodyRequest addDataItem(GetEnigmaRequest dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<GetEnigmaRequest> getData() {
    return data;
  }

  public void setData(List<GetEnigmaRequest> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyRequest jsonApiBodyRequest = (JsonApiBodyRequest) o;
    return Objects.equals(this.data, jsonApiBodyRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyRequest {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
