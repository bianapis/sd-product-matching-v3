package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceAnalysis;
import org.bian.dto.CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRetrieveInputModel
 */
public class CRProductCustomerCombinationAssessmentRetrieveInputModel   {
  private Object productCustomerCombinationAssessmentRetrieveActionTaskRecord = null;

  private String productCustomerCombinationAssessmentRetrieveActionRequest = null;

  private CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceReportRecord productCustomerCombinationAssessmentInstanceReportRecord = null;

  private CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceAnalysis productCustomerCombinationAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productCustomerCombinationAssessmentRetrieveActionTaskRecord
  **/

  public Object getProductCustomerCombinationAssessmentRetrieveActionTaskRecord() {
    return productCustomerCombinationAssessmentRetrieveActionTaskRecord;
  }

  public void setProductCustomerCombinationAssessmentRetrieveActionTaskRecord(Object productCustomerCombinationAssessmentRetrieveActionTaskRecord) {
    this.productCustomerCombinationAssessmentRetrieveActionTaskRecord = productCustomerCombinationAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productCustomerCombinationAssessmentRetrieveActionRequest
  **/

  public String getProductCustomerCombinationAssessmentRetrieveActionRequest() {
    return productCustomerCombinationAssessmentRetrieveActionRequest;
  }

  public void setProductCustomerCombinationAssessmentRetrieveActionRequest(String productCustomerCombinationAssessmentRetrieveActionRequest) {
    this.productCustomerCombinationAssessmentRetrieveActionRequest = productCustomerCombinationAssessmentRetrieveActionRequest;
  }


  /**
   * Get productCustomerCombinationAssessmentInstanceReportRecord
   * @return productCustomerCombinationAssessmentInstanceReportRecord
  **/

  public CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceReportRecord getProductCustomerCombinationAssessmentInstanceReportRecord() {
    return productCustomerCombinationAssessmentInstanceReportRecord;
  }

  public void setProductCustomerCombinationAssessmentInstanceReportRecord(CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceReportRecord productCustomerCombinationAssessmentInstanceReportRecord) {
    this.productCustomerCombinationAssessmentInstanceReportRecord = productCustomerCombinationAssessmentInstanceReportRecord;
  }


  /**
   * Get productCustomerCombinationAssessmentInstanceAnalysis
   * @return productCustomerCombinationAssessmentInstanceAnalysis
  **/

  public CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceAnalysis getProductCustomerCombinationAssessmentInstanceAnalysis() {
    return productCustomerCombinationAssessmentInstanceAnalysis;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysis(CRProductCustomerCombinationAssessmentRetrieveInputModelProductCustomerCombinationAssessmentInstanceAnalysis productCustomerCombinationAssessmentInstanceAnalysis) {
    this.productCustomerCombinationAssessmentInstanceAnalysis = productCustomerCombinationAssessmentInstanceAnalysis;
  }


}

