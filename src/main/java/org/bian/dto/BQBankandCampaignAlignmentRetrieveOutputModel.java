package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceAnalysis;
import org.bian.dto.BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBankandCampaignAlignmentRetrieveOutputModel
 */
public class BQBankandCampaignAlignmentRetrieveOutputModel   {
  private String bankandCampaignAlignmentPreconditions = null;

  private String bankandCampaignAlignmentAnalysisSchedule = null;

  private String bankandCampaignAlignmentVersionNumber = null;

  private String bankandCampaignAlignment = null;

  private String bankandCampaignAlignmentServiceType = null;

  private String bankandCampaignAlignmentServiceDescription = null;

  private String bankandCampaignAlignmentServiceInputsandOuputs = null;

  private String bankandCampaignAlignmentServiceWorkProduct = null;

  private String bankandCampaignAlignmentServiceName = null;

  private String bankandCampaignAlignmentRetrieveActionTaskReference = null;

  private Object bankandCampaignAlignmentRetrieveActionTaskRecord = null;

  private String bankandCampaignAlignmentRetrieveActionResponse = null;

  private BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceReport bankandCampaignAlignmentInstanceReport = null;

  private BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceAnalysis bankandCampaignAlignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return bankandCampaignAlignmentPreconditions
  **/

  public String getBankandCampaignAlignmentPreconditions() {
    return bankandCampaignAlignmentPreconditions;
  }

  public void setBankandCampaignAlignmentPreconditions(String bankandCampaignAlignmentPreconditions) {
    this.bankandCampaignAlignmentPreconditions = bankandCampaignAlignmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return bankandCampaignAlignmentAnalysisSchedule
  **/

  public String getBankandCampaignAlignmentAnalysisSchedule() {
    return bankandCampaignAlignmentAnalysisSchedule;
  }

  public void setBankandCampaignAlignmentAnalysisSchedule(String bankandCampaignAlignmentAnalysisSchedule) {
    this.bankandCampaignAlignmentAnalysisSchedule = bankandCampaignAlignmentAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return bankandCampaignAlignmentVersionNumber
  **/

  public String getBankandCampaignAlignmentVersionNumber() {
    return bankandCampaignAlignmentVersionNumber;
  }

  public void setBankandCampaignAlignmentVersionNumber(String bankandCampaignAlignmentVersionNumber) {
    this.bankandCampaignAlignmentVersionNumber = bankandCampaignAlignmentVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product Customer Combination Assessment specific Business Service 
   * @return bankandCampaignAlignment
  **/

  public String getBankandCampaignAlignment() {
    return bankandCampaignAlignment;
  }

  public void setBankandCampaignAlignment(String bankandCampaignAlignment) {
    this.bankandCampaignAlignment = bankandCampaignAlignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return bankandCampaignAlignmentServiceType
  **/

  public String getBankandCampaignAlignmentServiceType() {
    return bankandCampaignAlignmentServiceType;
  }

  public void setBankandCampaignAlignmentServiceType(String bankandCampaignAlignmentServiceType) {
    this.bankandCampaignAlignmentServiceType = bankandCampaignAlignmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return bankandCampaignAlignmentServiceDescription
  **/

  public String getBankandCampaignAlignmentServiceDescription() {
    return bankandCampaignAlignmentServiceDescription;
  }

  public void setBankandCampaignAlignmentServiceDescription(String bankandCampaignAlignmentServiceDescription) {
    this.bankandCampaignAlignmentServiceDescription = bankandCampaignAlignmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return bankandCampaignAlignmentServiceInputsandOuputs
  **/

  public String getBankandCampaignAlignmentServiceInputsandOuputs() {
    return bankandCampaignAlignmentServiceInputsandOuputs;
  }

  public void setBankandCampaignAlignmentServiceInputsandOuputs(String bankandCampaignAlignmentServiceInputsandOuputs) {
    this.bankandCampaignAlignmentServiceInputsandOuputs = bankandCampaignAlignmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return bankandCampaignAlignmentServiceWorkProduct
  **/

  public String getBankandCampaignAlignmentServiceWorkProduct() {
    return bankandCampaignAlignmentServiceWorkProduct;
  }

  public void setBankandCampaignAlignmentServiceWorkProduct(String bankandCampaignAlignmentServiceWorkProduct) {
    this.bankandCampaignAlignmentServiceWorkProduct = bankandCampaignAlignmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return bankandCampaignAlignmentServiceName
  **/

  public String getBankandCampaignAlignmentServiceName() {
    return bankandCampaignAlignmentServiceName;
  }

  public void setBankandCampaignAlignmentServiceName(String bankandCampaignAlignmentServiceName) {
    this.bankandCampaignAlignmentServiceName = bankandCampaignAlignmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Bank and Campaign Alignment instance retrieve service call 
   * @return bankandCampaignAlignmentRetrieveActionTaskReference
  **/

  public String getBankandCampaignAlignmentRetrieveActionTaskReference() {
    return bankandCampaignAlignmentRetrieveActionTaskReference;
  }

  public void setBankandCampaignAlignmentRetrieveActionTaskReference(String bankandCampaignAlignmentRetrieveActionTaskReference) {
    this.bankandCampaignAlignmentRetrieveActionTaskReference = bankandCampaignAlignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return bankandCampaignAlignmentRetrieveActionTaskRecord
  **/

  public Object getBankandCampaignAlignmentRetrieveActionTaskRecord() {
    return bankandCampaignAlignmentRetrieveActionTaskRecord;
  }

  public void setBankandCampaignAlignmentRetrieveActionTaskRecord(Object bankandCampaignAlignmentRetrieveActionTaskRecord) {
    this.bankandCampaignAlignmentRetrieveActionTaskRecord = bankandCampaignAlignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return bankandCampaignAlignmentRetrieveActionResponse
  **/

  public String getBankandCampaignAlignmentRetrieveActionResponse() {
    return bankandCampaignAlignmentRetrieveActionResponse;
  }

  public void setBankandCampaignAlignmentRetrieveActionResponse(String bankandCampaignAlignmentRetrieveActionResponse) {
    this.bankandCampaignAlignmentRetrieveActionResponse = bankandCampaignAlignmentRetrieveActionResponse;
  }


  /**
   * Get bankandCampaignAlignmentInstanceReport
   * @return bankandCampaignAlignmentInstanceReport
  **/

  public BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceReport getBankandCampaignAlignmentInstanceReport() {
    return bankandCampaignAlignmentInstanceReport;
  }

  public void setBankandCampaignAlignmentInstanceReport(BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceReport bankandCampaignAlignmentInstanceReport) {
    this.bankandCampaignAlignmentInstanceReport = bankandCampaignAlignmentInstanceReport;
  }


  /**
   * Get bankandCampaignAlignmentInstanceAnalysis
   * @return bankandCampaignAlignmentInstanceAnalysis
  **/

  public BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceAnalysis getBankandCampaignAlignmentInstanceAnalysis() {
    return bankandCampaignAlignmentInstanceAnalysis;
  }

  public void setBankandCampaignAlignmentInstanceAnalysis(BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceAnalysis bankandCampaignAlignmentInstanceAnalysis) {
    this.bankandCampaignAlignmentInstanceAnalysis = bankandCampaignAlignmentInstanceAnalysis;
  }


}

