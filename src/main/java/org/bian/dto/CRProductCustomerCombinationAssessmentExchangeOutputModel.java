package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentExchangeOutputModel
 */
public class CRProductCustomerCombinationAssessmentExchangeOutputModel   {
  private String productCustomerCombinationAssessmentParameterType = null;

  private String productCustomerCombinationAssessmentSelectedOption = null;

  private String productCustomerCombinationAssessmentRequest = null;

  private String productCustomerCombinationAssessmentExchangeActionTaskReference = null;

  private Object productCustomerCombinationAssessmentExchangeActionTaskRecord = null;

  private String productCustomerCombinationAssessmentExchangeActionResponse = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Customer Combination Assessment instance exchange service call 
   * @return productCustomerCombinationAssessmentExchangeActionTaskReference
  **/

  public String getProductCustomerCombinationAssessmentExchangeActionTaskReference() {
    return productCustomerCombinationAssessmentExchangeActionTaskReference;
  }

  public void setProductCustomerCombinationAssessmentExchangeActionTaskReference(String productCustomerCombinationAssessmentExchangeActionTaskReference) {
    this.productCustomerCombinationAssessmentExchangeActionTaskReference = productCustomerCombinationAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productCustomerCombinationAssessmentExchangeActionTaskRecord
  **/

  public Object getProductCustomerCombinationAssessmentExchangeActionTaskRecord() {
    return productCustomerCombinationAssessmentExchangeActionTaskRecord;
  }

  public void setProductCustomerCombinationAssessmentExchangeActionTaskRecord(Object productCustomerCombinationAssessmentExchangeActionTaskRecord) {
    this.productCustomerCombinationAssessmentExchangeActionTaskRecord = productCustomerCombinationAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productCustomerCombinationAssessmentExchangeActionResponse
  **/

  public String getProductCustomerCombinationAssessmentExchangeActionResponse() {
    return productCustomerCombinationAssessmentExchangeActionResponse;
  }

  public void setProductCustomerCombinationAssessmentExchangeActionResponse(String productCustomerCombinationAssessmentExchangeActionResponse) {
    this.productCustomerCombinationAssessmentExchangeActionResponse = productCustomerCombinationAssessmentExchangeActionResponse;
  }


}

