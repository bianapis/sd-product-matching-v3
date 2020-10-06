package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankandCampaignAlignmentInitiateOutputModel
 */
public class BQBankandCampaignAlignmentInitiateOutputModel   {
  private String bankandCampaignAlignmentInstanceReference = null;

  private String bankandCampaignAlignmentInitiateActionReference = null;

  private Object bankandCampaignAlignmentInitiateActionRecord = null;

  private String bankandCampaignAlignmentInstanceStatus = null;

  private String bankandCampaignAlignmentPreconditions = null;

  private String bankandCampaignAlignmentAnalysisSchedule = null;

  private String bankandCampaignAlignmentVersionNumber = null;

  private String bankandCampaignAlignment = null;

  private String bankandCampaignAlignmentServiceType = null;

  private String bankandCampaignAlignmentServiceDescription = null;

  private String bankandCampaignAlignmentServiceInputsandOuputs = null;

  private String bankandCampaignAlignmentServiceWorkProduct = null;

  private String bankandCampaignAlignmentServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Bank and Campaign Alignment instance 
   * @return bankandCampaignAlignmentInstanceReference
  **/

  public String getBankandCampaignAlignmentInstanceReference() {
    return bankandCampaignAlignmentInstanceReference;
  }

  public void setBankandCampaignAlignmentInstanceReference(String bankandCampaignAlignmentInstanceReference) {
    this.bankandCampaignAlignmentInstanceReference = bankandCampaignAlignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return bankandCampaignAlignmentInitiateActionReference
  **/

  public String getBankandCampaignAlignmentInitiateActionReference() {
    return bankandCampaignAlignmentInitiateActionReference;
  }

  public void setBankandCampaignAlignmentInitiateActionReference(String bankandCampaignAlignmentInitiateActionReference) {
    this.bankandCampaignAlignmentInitiateActionReference = bankandCampaignAlignmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return bankandCampaignAlignmentInitiateActionRecord
  **/

  public Object getBankandCampaignAlignmentInitiateActionRecord() {
    return bankandCampaignAlignmentInitiateActionRecord;
  }

  public void setBankandCampaignAlignmentInitiateActionRecord(Object bankandCampaignAlignmentInitiateActionRecord) {
    this.bankandCampaignAlignmentInitiateActionRecord = bankandCampaignAlignmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Bank and Campaign Alignment instance (e.g. initialised, pending, active) 
   * @return bankandCampaignAlignmentInstanceStatus
  **/

  public String getBankandCampaignAlignmentInstanceStatus() {
    return bankandCampaignAlignmentInstanceStatus;
  }

  public void setBankandCampaignAlignmentInstanceStatus(String bankandCampaignAlignmentInstanceStatus) {
    this.bankandCampaignAlignmentInstanceStatus = bankandCampaignAlignmentInstanceStatus;
  }


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


}

