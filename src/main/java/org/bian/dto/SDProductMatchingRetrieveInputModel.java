package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingRetrieveInputModelProductMatchingOfferedService;
import org.bian.dto.SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveInputModel
 */
public class SDProductMatchingRetrieveInputModel   {
  private Object productMatchingRetrieveActionTaskRecord = null;

  private String productMatchingRetrieveActionRequest = null;

  private SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecord productMatchingRetrieveActionRecord = null;

  private SDProductMatchingRetrieveInputModelProductMatchingOfferedService productMatchingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productMatchingRetrieveActionTaskRecord
  **/

  public Object getProductMatchingRetrieveActionTaskRecord() {
    return productMatchingRetrieveActionTaskRecord;
  }

  public void setProductMatchingRetrieveActionTaskRecord(Object productMatchingRetrieveActionTaskRecord) {
    this.productMatchingRetrieveActionTaskRecord = productMatchingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productMatchingRetrieveActionRequest
  **/

  public String getProductMatchingRetrieveActionRequest() {
    return productMatchingRetrieveActionRequest;
  }

  public void setProductMatchingRetrieveActionRequest(String productMatchingRetrieveActionRequest) {
    this.productMatchingRetrieveActionRequest = productMatchingRetrieveActionRequest;
  }


  /**
   * Get productMatchingRetrieveActionRecord
   * @return productMatchingRetrieveActionRecord
  **/

  public SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecord getProductMatchingRetrieveActionRecord() {
    return productMatchingRetrieveActionRecord;
  }

  public void setProductMatchingRetrieveActionRecord(SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecord productMatchingRetrieveActionRecord) {
    this.productMatchingRetrieveActionRecord = productMatchingRetrieveActionRecord;
  }


  /**
   * Get productMatchingOfferedService
   * @return productMatchingOfferedService
  **/

  public SDProductMatchingRetrieveInputModelProductMatchingOfferedService getProductMatchingOfferedService() {
    return productMatchingOfferedService;
  }

  public void setProductMatchingOfferedService(SDProductMatchingRetrieveInputModelProductMatchingOfferedService productMatchingOfferedService) {
    this.productMatchingOfferedService = productMatchingOfferedService;
  }


}

