package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceReport
 */
public class BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceReport   {
  private Object bankandCampaignAlignmentInstanceReportRecord = null;

  private String bankandCampaignAlignmentInstanceReportType = null;

  private String bankandCampaignAlignmentInstanceReportParameters = null;

  private Object bankandCampaignAlignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return bankandCampaignAlignmentInstanceReportRecord
  **/

  public Object getBankandCampaignAlignmentInstanceReportRecord() {
    return bankandCampaignAlignmentInstanceReportRecord;
  }

  public void setBankandCampaignAlignmentInstanceReportRecord(Object bankandCampaignAlignmentInstanceReportRecord) {
    this.bankandCampaignAlignmentInstanceReportRecord = bankandCampaignAlignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return bankandCampaignAlignmentInstanceReportType
  **/

  public String getBankandCampaignAlignmentInstanceReportType() {
    return bankandCampaignAlignmentInstanceReportType;
  }

  public void setBankandCampaignAlignmentInstanceReportType(String bankandCampaignAlignmentInstanceReportType) {
    this.bankandCampaignAlignmentInstanceReportType = bankandCampaignAlignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return bankandCampaignAlignmentInstanceReportParameters
  **/

  public String getBankandCampaignAlignmentInstanceReportParameters() {
    return bankandCampaignAlignmentInstanceReportParameters;
  }

  public void setBankandCampaignAlignmentInstanceReportParameters(String bankandCampaignAlignmentInstanceReportParameters) {
    this.bankandCampaignAlignmentInstanceReportParameters = bankandCampaignAlignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return bankandCampaignAlignmentInstanceReport
  **/

  public Object getBankandCampaignAlignmentInstanceReport() {
    return bankandCampaignAlignmentInstanceReport;
  }

  public void setBankandCampaignAlignmentInstanceReport(Object bankandCampaignAlignmentInstanceReport) {
    this.bankandCampaignAlignmentInstanceReport = bankandCampaignAlignmentInstanceReport;
  }


}

