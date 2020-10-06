package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceReport
 */
public class BQBankandCampaignAlignmentRetrieveInputModelBankandCampaignAlignmentInstanceReport   {
  private String bankandCampaignAlignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return bankandCampaignAlignmentInstanceReportReference
  **/

  public String getBankandCampaignAlignmentInstanceReportReference() {
    return bankandCampaignAlignmentInstanceReportReference;
  }

  public void setBankandCampaignAlignmentInstanceReportReference(String bankandCampaignAlignmentInstanceReportReference) {
    this.bankandCampaignAlignmentInstanceReportReference = bankandCampaignAlignmentInstanceReportReference;
  }


}

