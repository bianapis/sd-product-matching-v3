package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContextCriteriaInitiateInputModel
 */
public class BQContextCriteriaInitiateInputModel   {
  private String productCustomerCombinationAssessmentInstanceReference = null;

  private Object contextCriteriaInitiateActionRecord = null;

  private String contextCriteriaPreconditions = null;

  private String contextCriteriaAnalysisSchedule = null;

  private String contextCriteriaVersionNumber = null;

  private String contextCriteriaServiceType = null;

  private String contextCriteriaServiceDescription = null;

  private String contextCriteriaServiceInputsandOuputs = null;

  private String contextCriteriaServiceWorkProduct = null;


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
   * @return contextCriteriaInitiateActionRecord
  **/

  public Object getContextCriteriaInitiateActionRecord() {
    return contextCriteriaInitiateActionRecord;
  }

  public void setContextCriteriaInitiateActionRecord(Object contextCriteriaInitiateActionRecord) {
    this.contextCriteriaInitiateActionRecord = contextCriteriaInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return contextCriteriaPreconditions
  **/

  public String getContextCriteriaPreconditions() {
    return contextCriteriaPreconditions;
  }

  public void setContextCriteriaPreconditions(String contextCriteriaPreconditions) {
    this.contextCriteriaPreconditions = contextCriteriaPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return contextCriteriaAnalysisSchedule
  **/

  public String getContextCriteriaAnalysisSchedule() {
    return contextCriteriaAnalysisSchedule;
  }

  public void setContextCriteriaAnalysisSchedule(String contextCriteriaAnalysisSchedule) {
    this.contextCriteriaAnalysisSchedule = contextCriteriaAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return contextCriteriaVersionNumber
  **/

  public String getContextCriteriaVersionNumber() {
    return contextCriteriaVersionNumber;
  }

  public void setContextCriteriaVersionNumber(String contextCriteriaVersionNumber) {
    this.contextCriteriaVersionNumber = contextCriteriaVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contextCriteriaServiceType
  **/

  public String getContextCriteriaServiceType() {
    return contextCriteriaServiceType;
  }

  public void setContextCriteriaServiceType(String contextCriteriaServiceType) {
    this.contextCriteriaServiceType = contextCriteriaServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contextCriteriaServiceDescription
  **/

  public String getContextCriteriaServiceDescription() {
    return contextCriteriaServiceDescription;
  }

  public void setContextCriteriaServiceDescription(String contextCriteriaServiceDescription) {
    this.contextCriteriaServiceDescription = contextCriteriaServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contextCriteriaServiceInputsandOuputs
  **/

  public String getContextCriteriaServiceInputsandOuputs() {
    return contextCriteriaServiceInputsandOuputs;
  }

  public void setContextCriteriaServiceInputsandOuputs(String contextCriteriaServiceInputsandOuputs) {
    this.contextCriteriaServiceInputsandOuputs = contextCriteriaServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contextCriteriaServiceWorkProduct
  **/

  public String getContextCriteriaServiceWorkProduct() {
    return contextCriteriaServiceWorkProduct;
  }

  public void setContextCriteriaServiceWorkProduct(String contextCriteriaServiceWorkProduct) {
    this.contextCriteriaServiceWorkProduct = contextCriteriaServiceWorkProduct;
  }


}

