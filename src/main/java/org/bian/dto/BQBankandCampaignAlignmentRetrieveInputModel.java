package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceAnalysis;
import org.bian.dto.BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBankandCampaignAlignmentRetrieveInputModel
 */
public class BQBankandCampaignAlignmentRetrieveInputModel   {
  private Object bankandCampaignAlignmentRetrieveActionTaskRecord = null;

  private String bankandCampaignAlignmentRetrieveActionRequest = null;

  private BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceReport bankandCampaignAlignmentInstanceReport = null;

  private BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceAnalysis bankandCampaignAlignmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return bankandCampaignAlignmentRetrieveActionRequest
  **/

  public String getBankandCampaignAlignmentRetrieveActionRequest() {
    return bankandCampaignAlignmentRetrieveActionRequest;
  }

  public void setBankandCampaignAlignmentRetrieveActionRequest(String bankandCampaignAlignmentRetrieveActionRequest) {
    this.bankandCampaignAlignmentRetrieveActionRequest = bankandCampaignAlignmentRetrieveActionRequest;
  }


  /**
   * Get bankandCampaignAlignmentInstanceReport
   * @return bankandCampaignAlignmentInstanceReport
  **/

  public BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceReport getBankandCampaignAlignmentInstanceReport() {
    return bankandCampaignAlignmentInstanceReport;
  }

  public void setBankandCampaignAlignmentInstanceReport(BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceReport bankandCampaignAlignmentInstanceReport) {
    this.bankandCampaignAlignmentInstanceReport = bankandCampaignAlignmentInstanceReport;
  }


  /**
   * Get bankandCampaignAlignmentInstanceAnalysis
   * @return bankandCampaignAlignmentInstanceAnalysis
  **/

  public BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceAnalysis getBankandCampaignAlignmentInstanceAnalysis() {
    return bankandCampaignAlignmentInstanceAnalysis;
  }

  public void setBankandCampaignAlignmentInstanceAnalysis(BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceAnalysis bankandCampaignAlignmentInstanceAnalysis) {
    this.bankandCampaignAlignmentInstanceAnalysis = bankandCampaignAlignmentInstanceAnalysis;
  }


}

