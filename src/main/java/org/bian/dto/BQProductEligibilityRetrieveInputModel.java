package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductEligibilityRetrieveInputModelProductEligibilityInstanceAnalysis;
import org.bian.dto.BQProductEligibilityRetrieveInputModelProductEligibilityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityRetrieveInputModel
 */
public class BQProductEligibilityRetrieveInputModel   {
  private Object productEligibilityRetrieveActionTaskRecord = null;

  private String productEligibilityRetrieveActionRequest = null;

  private BQProductEligibilityRetrieveInputModelProductEligibilityInstanceReport productEligibilityInstanceReport = null;

  private BQProductEligibilityRetrieveInputModelProductEligibilityInstanceAnalysis productEligibilityInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productEligibilityRetrieveActionTaskRecord
  **/

  public Object getProductEligibilityRetrieveActionTaskRecord() {
    return productEligibilityRetrieveActionTaskRecord;
  }

  public void setProductEligibilityRetrieveActionTaskRecord(Object productEligibilityRetrieveActionTaskRecord) {
    this.productEligibilityRetrieveActionTaskRecord = productEligibilityRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productEligibilityRetrieveActionRequest
  **/

  public String getProductEligibilityRetrieveActionRequest() {
    return productEligibilityRetrieveActionRequest;
  }

  public void setProductEligibilityRetrieveActionRequest(String productEligibilityRetrieveActionRequest) {
    this.productEligibilityRetrieveActionRequest = productEligibilityRetrieveActionRequest;
  }


  /**
   * Get productEligibilityInstanceReport
   * @return productEligibilityInstanceReport
  **/

  public BQProductEligibilityRetrieveInputModelProductEligibilityInstanceReport getProductEligibilityInstanceReport() {
    return productEligibilityInstanceReport;
  }

  public void setProductEligibilityInstanceReport(BQProductEligibilityRetrieveInputModelProductEligibilityInstanceReport productEligibilityInstanceReport) {
    this.productEligibilityInstanceReport = productEligibilityInstanceReport;
  }


  /**
   * Get productEligibilityInstanceAnalysis
   * @return productEligibilityInstanceAnalysis
  **/

  public BQProductEligibilityRetrieveInputModelProductEligibilityInstanceAnalysis getProductEligibilityInstanceAnalysis() {
    return productEligibilityInstanceAnalysis;
  }

  public void setProductEligibilityInstanceAnalysis(BQProductEligibilityRetrieveInputModelProductEligibilityInstanceAnalysis productEligibilityInstanceAnalysis) {
    this.productEligibilityInstanceAnalysis = productEligibilityInstanceAnalysis;
  }


}

