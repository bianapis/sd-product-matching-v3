package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTypeSelectionInitiateInputModel
 */
public class BQProductTypeSelectionInitiateInputModel   {
  private String productCustomerCombinationAssessmentInstanceReference = null;

  private Object productTypeSelectionInitiateActionRecord = null;

  private String productTypeSelectionPreconditions = null;

  private String productTypeSelectionAnalysisSchedule = null;

  private String productTypeSelectionVersionNumber = null;

  private String productTypeSelectionServiceType = null;

  private String productTypeSelectionServiceDescription = null;

  private String productTypeSelectionServiceInputsandOuputs = null;

  private String productTypeSelectionServiceWorkProduct = null;

  private String productTypeSelectionServiceName = null;


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
   * @return productTypeSelectionInitiateActionRecord
  **/

  public Object getProductTypeSelectionInitiateActionRecord() {
    return productTypeSelectionInitiateActionRecord;
  }

  public void setProductTypeSelectionInitiateActionRecord(Object productTypeSelectionInitiateActionRecord) {
    this.productTypeSelectionInitiateActionRecord = productTypeSelectionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return productTypeSelectionPreconditions
  **/

  public String getProductTypeSelectionPreconditions() {
    return productTypeSelectionPreconditions;
  }

  public void setProductTypeSelectionPreconditions(String productTypeSelectionPreconditions) {
    this.productTypeSelectionPreconditions = productTypeSelectionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return productTypeSelectionAnalysisSchedule
  **/

  public String getProductTypeSelectionAnalysisSchedule() {
    return productTypeSelectionAnalysisSchedule;
  }

  public void setProductTypeSelectionAnalysisSchedule(String productTypeSelectionAnalysisSchedule) {
    this.productTypeSelectionAnalysisSchedule = productTypeSelectionAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return productTypeSelectionVersionNumber
  **/

  public String getProductTypeSelectionVersionNumber() {
    return productTypeSelectionVersionNumber;
  }

  public void setProductTypeSelectionVersionNumber(String productTypeSelectionVersionNumber) {
    this.productTypeSelectionVersionNumber = productTypeSelectionVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return productTypeSelectionServiceType
  **/

  public String getProductTypeSelectionServiceType() {
    return productTypeSelectionServiceType;
  }

  public void setProductTypeSelectionServiceType(String productTypeSelectionServiceType) {
    this.productTypeSelectionServiceType = productTypeSelectionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return productTypeSelectionServiceDescription
  **/

  public String getProductTypeSelectionServiceDescription() {
    return productTypeSelectionServiceDescription;
  }

  public void setProductTypeSelectionServiceDescription(String productTypeSelectionServiceDescription) {
    this.productTypeSelectionServiceDescription = productTypeSelectionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return productTypeSelectionServiceInputsandOuputs
  **/

  public String getProductTypeSelectionServiceInputsandOuputs() {
    return productTypeSelectionServiceInputsandOuputs;
  }

  public void setProductTypeSelectionServiceInputsandOuputs(String productTypeSelectionServiceInputsandOuputs) {
    this.productTypeSelectionServiceInputsandOuputs = productTypeSelectionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return productTypeSelectionServiceWorkProduct
  **/

  public String getProductTypeSelectionServiceWorkProduct() {
    return productTypeSelectionServiceWorkProduct;
  }

  public void setProductTypeSelectionServiceWorkProduct(String productTypeSelectionServiceWorkProduct) {
    this.productTypeSelectionServiceWorkProduct = productTypeSelectionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return productTypeSelectionServiceName
  **/

  public String getProductTypeSelectionServiceName() {
    return productTypeSelectionServiceName;
  }

  public void setProductTypeSelectionServiceName(String productTypeSelectionServiceName) {
    this.productTypeSelectionServiceName = productTypeSelectionServiceName;
  }


}

