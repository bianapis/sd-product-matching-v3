package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductCustomerCombinationAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRProductCustomerCombinationAssessmentGrantInputModel
 */
public class CRProductCustomerCombinationAssessmentGrantInputModel   {
  private String productMatchingServicingSessionReference = null;

  private String productCustomerCombinationAssessmentInstanceReference = null;

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

  private Object productCustomerCombinationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRProductCustomerCombinationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productMatchingServicingSessionReference
  **/

  public String getProductMatchingServicingSessionReference() {
    return productMatchingServicingSessionReference;
  }

  public void setProductMatchingServicingSessionReference(String productMatchingServicingSessionReference) {
    this.productMatchingServicingSessionReference = productMatchingServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return productCustomerCombinationAssessmentGrantActionTaskRecord
  **/

  public Object getProductCustomerCombinationAssessmentGrantActionTaskRecord() {
    return productCustomerCombinationAssessmentGrantActionTaskRecord;
  }

  public void setProductCustomerCombinationAssessmentGrantActionTaskRecord(Object productCustomerCombinationAssessmentGrantActionTaskRecord) {
    this.productCustomerCombinationAssessmentGrantActionTaskRecord = productCustomerCombinationAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRProductCustomerCombinationAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRProductCustomerCombinationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

