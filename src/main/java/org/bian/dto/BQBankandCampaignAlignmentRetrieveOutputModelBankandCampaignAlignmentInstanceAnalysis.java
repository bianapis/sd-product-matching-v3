package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceAnalysis
 */
public class BQBankandCampaignAlignmentRetrieveOutputModelBankandCampaignAlignmentInstanceAnalysis   {
  private Object bankandCampaignAlignmentInstanceAnalysisRecord = null;

  private String bankandCampaignAlignmentInstanceAnalysisReportType = null;

  private String bankandCampaignAlignmentInstanceAnalysisParameters = null;

  private Object bankandCampaignAlignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return bankandCampaignAlignmentInstanceAnalysisRecord
  **/

  public Object getBankandCampaignAlignmentInstanceAnalysisRecord() {
    return bankandCampaignAlignmentInstanceAnalysisRecord;
  }

  public void setBankandCampaignAlignmentInstanceAnalysisRecord(Object bankandCampaignAlignmentInstanceAnalysisRecord) {
    this.bankandCampaignAlignmentInstanceAnalysisRecord = bankandCampaignAlignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return bankandCampaignAlignmentInstanceAnalysisReportType
  **/

  public String getBankandCampaignAlignmentInstanceAnalysisReportType() {
    return bankandCampaignAlignmentInstanceAnalysisReportType;
  }

  public void setBankandCampaignAlignmentInstanceAnalysisReportType(String bankandCampaignAlignmentInstanceAnalysisReportType) {
    this.bankandCampaignAlignmentInstanceAnalysisReportType = bankandCampaignAlignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return bankandCampaignAlignmentInstanceAnalysisParameters
  **/

  public String getBankandCampaignAlignmentInstanceAnalysisParameters() {
    return bankandCampaignAlignmentInstanceAnalysisParameters;
  }

  public void setBankandCampaignAlignmentInstanceAnalysisParameters(String bankandCampaignAlignmentInstanceAnalysisParameters) {
    this.bankandCampaignAlignmentInstanceAnalysisParameters = bankandCampaignAlignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return bankandCampaignAlignmentInstanceAnalysisReport
  **/

  public Object getBankandCampaignAlignmentInstanceAnalysisReport() {
    return bankandCampaignAlignmentInstanceAnalysisReport;
  }

  public void setBankandCampaignAlignmentInstanceAnalysisReport(Object bankandCampaignAlignmentInstanceAnalysisReport) {
    this.bankandCampaignAlignmentInstanceAnalysisReport = bankandCampaignAlignmentInstanceAnalysisReport;
  }


}

