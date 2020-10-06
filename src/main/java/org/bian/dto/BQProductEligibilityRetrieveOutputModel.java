package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceAnalysis;
import org.bian.dto.BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityRetrieveOutputModel
 */
public class BQProductEligibilityRetrieveOutputModel   {
  private String productEligibilityPreconditions = null;

  private String productEligibilityAnalysisSchedule = null;

  private String productEligibilityVersionNumber = null;

  private String productEligibilityServiceType = null;

  private String productEligibilityServiceDescription = null;

  private String productEligibilityServiceInputsandOuputs = null;

  private String productEligibilityServiceWorkProduct = null;

  private String productEligibilityServiceName = null;

  private String productEligibilityRetrieveActionTaskReference = null;

  private Object productEligibilityRetrieveActionTaskRecord = null;

  private String productEligibilityRetrieveActionResponse = null;

  private BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceReport productEligibilityInstanceReport = null;

  private BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceAnalysis productEligibilityInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return productEligibilityPreconditions
  **/

  public String getProductEligibilityPreconditions() {
    return productEligibilityPreconditions;
  }

  public void setProductEligibilityPreconditions(String productEligibilityPreconditions) {
    this.productEligibilityPreconditions = productEligibilityPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return productEligibilityAnalysisSchedule
  **/

  public String getProductEligibilityAnalysisSchedule() {
    return productEligibilityAnalysisSchedule;
  }

  public void setProductEligibilityAnalysisSchedule(String productEligibilityAnalysisSchedule) {
    this.productEligibilityAnalysisSchedule = productEligibilityAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return productEligibilityVersionNumber
  **/

  public String getProductEligibilityVersionNumber() {
    return productEligibilityVersionNumber;
  }

  public void setProductEligibilityVersionNumber(String productEligibilityVersionNumber) {
    this.productEligibilityVersionNumber = productEligibilityVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return productEligibilityServiceType
  **/

  public String getProductEligibilityServiceType() {
    return productEligibilityServiceType;
  }

  public void setProductEligibilityServiceType(String productEligibilityServiceType) {
    this.productEligibilityServiceType = productEligibilityServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return productEligibilityServiceDescription
  **/

  public String getProductEligibilityServiceDescription() {
    return productEligibilityServiceDescription;
  }

  public void setProductEligibilityServiceDescription(String productEligibilityServiceDescription) {
    this.productEligibilityServiceDescription = productEligibilityServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return productEligibilityServiceInputsandOuputs
  **/

  public String getProductEligibilityServiceInputsandOuputs() {
    return productEligibilityServiceInputsandOuputs;
  }

  public void setProductEligibilityServiceInputsandOuputs(String productEligibilityServiceInputsandOuputs) {
    this.productEligibilityServiceInputsandOuputs = productEligibilityServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return productEligibilityServiceWorkProduct
  **/

  public String getProductEligibilityServiceWorkProduct() {
    return productEligibilityServiceWorkProduct;
  }

  public void setProductEligibilityServiceWorkProduct(String productEligibilityServiceWorkProduct) {
    this.productEligibilityServiceWorkProduct = productEligibilityServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return productEligibilityServiceName
  **/

  public String getProductEligibilityServiceName() {
    return productEligibilityServiceName;
  }

  public void setProductEligibilityServiceName(String productEligibilityServiceName) {
    this.productEligibilityServiceName = productEligibilityServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Eligibility instance retrieve service call 
   * @return productEligibilityRetrieveActionTaskReference
  **/

  public String getProductEligibilityRetrieveActionTaskReference() {
    return productEligibilityRetrieveActionTaskReference;
  }

  public void setProductEligibilityRetrieveActionTaskReference(String productEligibilityRetrieveActionTaskReference) {
    this.productEligibilityRetrieveActionTaskReference = productEligibilityRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productEligibilityRetrieveActionResponse
  **/

  public String getProductEligibilityRetrieveActionResponse() {
    return productEligibilityRetrieveActionResponse;
  }

  public void setProductEligibilityRetrieveActionResponse(String productEligibilityRetrieveActionResponse) {
    this.productEligibilityRetrieveActionResponse = productEligibilityRetrieveActionResponse;
  }


  /**
   * Get productEligibilityInstanceReport
   * @return productEligibilityInstanceReport
  **/

  public BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceReport getProductEligibilityInstanceReport() {
    return productEligibilityInstanceReport;
  }

  public void setProductEligibilityInstanceReport(BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceReport productEligibilityInstanceReport) {
    this.productEligibilityInstanceReport = productEligibilityInstanceReport;
  }


  /**
   * Get productEligibilityInstanceAnalysis
   * @return productEligibilityInstanceAnalysis
  **/

  public BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceAnalysis getProductEligibilityInstanceAnalysis() {
    return productEligibilityInstanceAnalysis;
  }

  public void setProductEligibilityInstanceAnalysis(BQProductEligibilityRetrieveOutputModelProductEligibilityInstanceAnalysis productEligibilityInstanceAnalysis) {
    this.productEligibilityInstanceAnalysis = productEligibilityInstanceAnalysis;
  }


}

