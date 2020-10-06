package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRequestOutputModel
 */
public class CRProductCustomerCombinationAssessmentRequestOutputModel   {
  private String productCustomerCombinationAssessmentParameterType = null;

  private String productCustomerCombinationAssessmentSelectedOption = null;

  private String productCustomerCombinationAssessmentRequest = null;

  private String productCustomerCombinationAssessmentRequestActionTaskReference = null;

  private Object productCustomerCombinationAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Customer Combination Assessment instance request service call 
   * @return productCustomerCombinationAssessmentRequestActionTaskReference
  **/

  public String getProductCustomerCombinationAssessmentRequestActionTaskReference() {
    return productCustomerCombinationAssessmentRequestActionTaskReference;
  }

  public void setProductCustomerCombinationAssessmentRequestActionTaskReference(String productCustomerCombinationAssessmentRequestActionTaskReference) {
    this.productCustomerCombinationAssessmentRequestActionTaskReference = productCustomerCombinationAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productCustomerCombinationAssessmentRequestActionTaskRecord
  **/

  public Object getProductCustomerCombinationAssessmentRequestActionTaskRecord() {
    return productCustomerCombinationAssessmentRequestActionTaskRecord;
  }

  public void setProductCustomerCombinationAssessmentRequestActionTaskRecord(Object productCustomerCombinationAssessmentRequestActionTaskRecord) {
    this.productCustomerCombinationAssessmentRequestActionTaskRecord = productCustomerCombinationAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

