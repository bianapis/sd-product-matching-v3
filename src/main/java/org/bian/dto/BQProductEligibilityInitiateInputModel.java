package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductEligibilityInitiateInputModel
 */
public class BQProductEligibilityInitiateInputModel   {
  private String productCustomerCombinationAssessmentInstanceReference = null;

  private Object productEligibilityInitiateActionRecord = null;

  private String productEligibilityPreconditions = null;

  private String productEligibilityAnalysisSchedule = null;

  private String productEligibilityVersionNumber = null;

  private String productEligibilityServiceType = null;

  private String productEligibilityServiceDescription = null;

  private String productEligibilityServiceInputsandOuputs = null;

  private String productEligibilityServiceWorkProduct = null;

  private String productEligibilityServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Customer Combination Assessment instance 
   * @return productCustomerCombinationAssessmentInstanceReference
  **/

  public String getProductCustomerCombinationAssessmentInstanceReference() {
    return productCustomerCombinationAssessmentInstanceReference;
  }

  public void setProductCustomerCombinationAssessmentInstanceReference(String productCustomerCombinationAssessmentInstanceReference) {
    this.productCustomerCombinationAssessmentInstanceReference = productCustomerCombinationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productEligibilityInitiateActionRecord
  **/

  public Object getProductEligibilityInitiateActionRecord() {
    return productEligibilityInitiateActionRecord;
  }

  public void setProductEligibilityInitiateActionRecord(Object productEligibilityInitiateActionRecord) {
    this.productEligibilityInitiateActionRecord = productEligibilityInitiateActionRecord;
  }


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


}

