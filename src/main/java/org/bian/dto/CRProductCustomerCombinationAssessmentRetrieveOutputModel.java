package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceAnalysis;
import org.bian.dto.CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentRetrieveOutputModel
 */
public class CRProductCustomerCombinationAssessmentRetrieveOutputModel   {
  private String productCustomerCombinationAssessmentParameterType = null;

  private String productCustomerCombinationAssessmentSelectedOption = null;

  private String productCustomerCombinationAssessmentType = null;

  private String productCustomerCombinationAssessmentReference = null;

  private String productCustomerCombinationAssessmentRequest = null;

  private String productCustomerCombinationAssessmentSchedule = null;

  private String productCustomerCombinationAssessmentStatus = null;

  private String productCustomerCombinationAssessmentUsageLog = null;

  private String productCustomerCombinationAssessmentServiceProviderReference = null;

  private String productCustomerCombinationAssessmentRequesterReference = null;

  private String productCustomerCombinationAssessmentRetrieveActionTaskReference = null;

  private Object productCustomerCombinationAssessmentRetrieveActionTaskRecord = null;

  private String productCustomerCombinationAssessmentRetrieveActionResponse = null;

  private CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceReportRecord productCustomerCombinationAssessmentInstanceReportRecord = null;

  private CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceAnalysis productCustomerCombinationAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Product Customer Combination Assessment 
   * @return productCustomerCombinationAssessmentType
  **/

  public String getProductCustomerCombinationAssessmentType() {
    return productCustomerCombinationAssessmentType;
  }

  public void setProductCustomerCombinationAssessmentType(String productCustomerCombinationAssessmentType) {
    this.productCustomerCombinationAssessmentType = productCustomerCombinationAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Product Customer Combination Assessment 
   * @return productCustomerCombinationAssessmentReference
  **/

  public String getProductCustomerCombinationAssessmentReference() {
    return productCustomerCombinationAssessmentReference;
  }

  public void setProductCustomerCombinationAssessmentReference(String productCustomerCombinationAssessmentReference) {
    this.productCustomerCombinationAssessmentReference = productCustomerCombinationAssessmentReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to assess Product CustomerCombination 
   * @return productCustomerCombinationAssessmentSchedule
  **/

  public String getProductCustomerCombinationAssessmentSchedule() {
    return productCustomerCombinationAssessmentSchedule;
  }

  public void setProductCustomerCombinationAssessmentSchedule(String productCustomerCombinationAssessmentSchedule) {
    this.productCustomerCombinationAssessmentSchedule = productCustomerCombinationAssessmentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Product Customer Combination Assessment 
   * @return productCustomerCombinationAssessmentStatus
  **/

  public String getProductCustomerCombinationAssessmentStatus() {
    return productCustomerCombinationAssessmentStatus;
  }

  public void setProductCustomerCombinationAssessmentStatus(String productCustomerCombinationAssessmentStatus) {
    this.productCustomerCombinationAssessmentStatus = productCustomerCombinationAssessmentStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Product Customer Combination Assessment 
   * @return productCustomerCombinationAssessmentUsageLog
  **/

  public String getProductCustomerCombinationAssessmentUsageLog() {
    return productCustomerCombinationAssessmentUsageLog;
  }

  public void setProductCustomerCombinationAssessmentUsageLog(String productCustomerCombinationAssessmentUsageLog) {
    this.productCustomerCombinationAssessmentUsageLog = productCustomerCombinationAssessmentUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Product Customer Combination Assessment 
   * @return productCustomerCombinationAssessmentServiceProviderReference
  **/

  public String getProductCustomerCombinationAssessmentServiceProviderReference() {
    return productCustomerCombinationAssessmentServiceProviderReference;
  }

  public void setProductCustomerCombinationAssessmentServiceProviderReference(String productCustomerCombinationAssessmentServiceProviderReference) {
    this.productCustomerCombinationAssessmentServiceProviderReference = productCustomerCombinationAssessmentServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has requested Product Customer Combination Assessment 
   * @return productCustomerCombinationAssessmentRequesterReference
  **/

  public String getProductCustomerCombinationAssessmentRequesterReference() {
    return productCustomerCombinationAssessmentRequesterReference;
  }

  public void setProductCustomerCombinationAssessmentRequesterReference(String productCustomerCombinationAssessmentRequesterReference) {
    this.productCustomerCombinationAssessmentRequesterReference = productCustomerCombinationAssessmentRequesterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Customer Combination Assessment instance retrieve service call 
   * @return productCustomerCombinationAssessmentRetrieveActionTaskReference
  **/

  public String getProductCustomerCombinationAssessmentRetrieveActionTaskReference() {
    return productCustomerCombinationAssessmentRetrieveActionTaskReference;
  }

  public void setProductCustomerCombinationAssessmentRetrieveActionTaskReference(String productCustomerCombinationAssessmentRetrieveActionTaskReference) {
    this.productCustomerCombinationAssessmentRetrieveActionTaskReference = productCustomerCombinationAssessmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productCustomerCombinationAssessmentRetrieveActionResponse
  **/

  public String getProductCustomerCombinationAssessmentRetrieveActionResponse() {
    return productCustomerCombinationAssessmentRetrieveActionResponse;
  }

  public void setProductCustomerCombinationAssessmentRetrieveActionResponse(String productCustomerCombinationAssessmentRetrieveActionResponse) {
    this.productCustomerCombinationAssessmentRetrieveActionResponse = productCustomerCombinationAssessmentRetrieveActionResponse;
  }


  /**
   * Get productCustomerCombinationAssessmentInstanceReportRecord
   * @return productCustomerCombinationAssessmentInstanceReportRecord
  **/

  public CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceReportRecord getProductCustomerCombinationAssessmentInstanceReportRecord() {
    return productCustomerCombinationAssessmentInstanceReportRecord;
  }

  public void setProductCustomerCombinationAssessmentInstanceReportRecord(CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceReportRecord productCustomerCombinationAssessmentInstanceReportRecord) {
    this.productCustomerCombinationAssessmentInstanceReportRecord = productCustomerCombinationAssessmentInstanceReportRecord;
  }


  /**
   * Get productCustomerCombinationAssessmentInstanceAnalysis
   * @return productCustomerCombinationAssessmentInstanceAnalysis
  **/

  public CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceAnalysis getProductCustomerCombinationAssessmentInstanceAnalysis() {
    return productCustomerCombinationAssessmentInstanceAnalysis;
  }

  public void setProductCustomerCombinationAssessmentInstanceAnalysis(CRProductCustomerCombinationAssessmentRetrieveOutputModelProductCustomerCombinationAssessmentInstanceAnalysis productCustomerCombinationAssessmentInstanceAnalysis) {
    this.productCustomerCombinationAssessmentInstanceAnalysis = productCustomerCombinationAssessmentInstanceAnalysis;
  }


}

