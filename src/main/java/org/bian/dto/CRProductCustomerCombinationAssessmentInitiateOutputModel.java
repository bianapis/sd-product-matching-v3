package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentInitiateOutputModel
 */
public class CRProductCustomerCombinationAssessmentInitiateOutputModel   {
  private String productCustomerCombinationAssessmentInstanceReference = null;

  private String productCustomerCombinationAssessmentInitiateActionReference = null;

  private Object productCustomerCombinationAssessmentInitiateActionRecord = null;

  private String productCustomerCombinationAssessmentInstanceStatus = null;

  private String productCustomerCombinationAssessmentParameterType = null;

  private String productCustomerCombinationAssessmentSelectedOption = null;

  private String productCustomerCombinationAssessmentRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Customer Combination Assessment instance 
   * @return productCustomerCombinationAssessmentInstanceReference
  **/

  public String getProductCustomerCombinationAssessmentInstanceReference() {
    return productCustomerCombinationAssessmentInstanceReference;
  }

  public void setProductCustomerCombinationAssessmentInstanceReference(String productCustomerCombinationAssessmentInstanceReference) {
    this.productCustomerCombinationAssessmentInstanceReference = productCustomerCombinationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productCustomerCombinationAssessmentInitiateActionReference
  **/

  public String getProductCustomerCombinationAssessmentInitiateActionReference() {
    return productCustomerCombinationAssessmentInitiateActionReference;
  }

  public void setProductCustomerCombinationAssessmentInitiateActionReference(String productCustomerCombinationAssessmentInitiateActionReference) {
    this.productCustomerCombinationAssessmentInitiateActionReference = productCustomerCombinationAssessmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productCustomerCombinationAssessmentInitiateActionRecord
  **/

  public Object getProductCustomerCombinationAssessmentInitiateActionRecord() {
    return productCustomerCombinationAssessmentInitiateActionRecord;
  }

  public void setProductCustomerCombinationAssessmentInitiateActionRecord(Object productCustomerCombinationAssessmentInitiateActionRecord) {
    this.productCustomerCombinationAssessmentInitiateActionRecord = productCustomerCombinationAssessmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product Customer Combination Assessment instance (e.g. initialised, pending, active) 
   * @return productCustomerCombinationAssessmentInstanceStatus
  **/

  public String getProductCustomerCombinationAssessmentInstanceStatus() {
    return productCustomerCombinationAssessmentInstanceStatus;
  }

  public void setProductCustomerCombinationAssessmentInstanceStatus(String productCustomerCombinationAssessmentInstanceStatus) {
    this.productCustomerCombinationAssessmentInstanceStatus = productCustomerCombinationAssessmentInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Assessments according to type of concern defined within Product Customer Combination Assessment . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc. 
   * @return productCustomerCombinationAssessmentParameterType
  **/

  public String getProductCustomerCombinationAssessmentParameterType() {
    return productCustomerCombinationAssessmentParameterType;
  }

  public void setProductCustomerCombinationAssessmentParameterType(String productCustomerCombinationAssessmentParameterType) {
    this.productCustomerCombinationAssessmentParameterType = productCustomerCombinationAssessmentParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of assessment 
   * @return productCustomerCombinationAssessmentSelectedOption
  **/

  public String getProductCustomerCombinationAssessmentSelectedOption() {
    return productCustomerCombinationAssessmentSelectedOption;
  }

  public void setProductCustomerCombinationAssessmentSelectedOption(String productCustomerCombinationAssessmentSelectedOption) {
    this.productCustomerCombinationAssessmentSelectedOption = productCustomerCombinationAssessmentSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to assess Product CustomerCombination 
   * @return productCustomerCombinationAssessmentRequest
  **/

  public String getProductCustomerCombinationAssessmentRequest() {
    return productCustomerCombinationAssessmentRequest;
  }

  public void setProductCustomerCombinationAssessmentRequest(String productCustomerCombinationAssessmentRequest) {
    this.productCustomerCombinationAssessmentRequest = productCustomerCombinationAssessmentRequest;
  }


}

