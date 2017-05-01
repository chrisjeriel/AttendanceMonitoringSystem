package ph.com.bpi.model.hibernate;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-24T17:10:55.097+08:00")
public class T0214 {

	private int id;
	private String trdrFi;
	private String currCode;
	private BigDecimal refrRate;
	
	/**
	 **/
	
	@ApiModelProperty(value = "")
	@JsonProperty("id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 **/
	
	@ApiModelProperty(value = "")
	@JsonProperty("trdr_fi")
	public String getTrdrFi() {
		return trdrFi;
	}
	public void setTrdrFi(String trdrFi) {
		this.trdrFi = trdrFi;
	}
	
	/**
	 **/
	
	@ApiModelProperty(value = "")
	@JsonProperty("curr_code")
	public String getCurrCode() {
		return currCode;
	}
	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}
	
	/**
	 **/
	
	@ApiModelProperty(value = "")
	@JsonProperty("refr_rate")
	public BigDecimal getRefrRate() {
		return refrRate;
	}
	public void setRefrRate(BigDecimal refrRate) {
		this.refrRate = refrRate;
	}
	
	
	@Override
	public boolean equals(Object o) {
	  if (this == o) {
	    return true;
	  }
	  if (o == null || getClass() != o.getClass()) {
	    return false;
	  }
	  T0214 T0214 = (T0214) o;
	  return Objects.equals(trdrFi, T0214.trdrFi) &&
		  Objects.equals(currCode, T0214.currCode) &&
	      Objects.equals(refrRate, T0214.refrRate);
	}
	
	@Override
	public int hashCode() {
	  return Objects.hash(trdrFi, currCode, refrRate);
	}
	
	@Override
	public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append("class T0214 {\n");
	  
	  sb.append("    trdrFi: ").append(toIndentedString(trdrFi)).append("\n");
	  sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
	  sb.append("    refrRate: ").append(toIndentedString(refrRate)).append("\n");
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