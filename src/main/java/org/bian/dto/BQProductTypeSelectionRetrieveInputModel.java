package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceAnalysis;
import org.bian.dto.BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductTypeSelectionRetrieveInputModel
 */
public class BQProductTypeSelectionRetrieveInputModel   {
  private Object productTypeSelectionRetrieveActionTaskRecord = null;

  private String productTypeSelectionRetrieveActionRequest = null;

  private BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceReport productTypeSelectionInstanceReport = null;

  private BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceAnalysis productTypeSelectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productTypeSelectionRetrieveActionTaskRecord
  **/

  public Object getProductTypeSelectionRetrieveActionTaskRecord() {
    return productTypeSelectionRetrieveActionTaskRecord;
  }

  public void setProductTypeSelectionRetrieveActionTaskRecord(Object productTypeSelectionRetrieveActionTaskRecord) {
    this.productTypeSelectionRetrieveActionTaskRecord = productTypeSelectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productTypeSelectionRetrieveActionRequest
  **/

  public String getProductTypeSelectionRetrieveActionRequest() {
    return productTypeSelectionRetrieveActionRequest;
  }

  public void setProductTypeSelectionRetrieveActionRequest(String productTypeSelectionRetrieveActionRequest) {
    this.productTypeSelectionRetrieveActionRequest = productTypeSelectionRetrieveActionRequest;
  }


  /**
   * Get productTypeSelectionInstanceReport
   * @return productTypeSelectionInstanceReport
  **/

  public BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceReport getProductTypeSelectionInstanceReport() {
    return productTypeSelectionInstanceReport;
  }

  public void setProductTypeSelectionInstanceReport(BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceReport productTypeSelectionInstanceReport) {
    this.productTypeSelectionInstanceReport = productTypeSelectionInstanceReport;
  }


  /**
   * Get productTypeSelectionInstanceAnalysis
   * @return productTypeSelectionInstanceAnalysis
  **/

  public BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceAnalysis getProductTypeSelectionInstanceAnalysis() {
    return productTypeSelectionInstanceAnalysis;
  }

  public void setProductTypeSelectionInstanceAnalysis(BQProductTypeSelectionRetrieveInputModelProductTypeSelectionInstanceAnalysis productTypeSelectionInstanceAnalysis) {
    this.productTypeSelectionInstanceAnalysis = productTypeSelectionInstanceAnalysis;
  }


}

