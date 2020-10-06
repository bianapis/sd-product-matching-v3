package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTypeSelectionRetrieveOutputModelProductTypeSelectionInstanceReport
 */
public class BQProductTypeSelectionRetrieveOutputModelProductTypeSelectionInstanceReport   {
  private Object productTypeSelectionInstanceReportRecord = null;

  private String productTypeSelectionInstanceReportType = null;

  private String productTypeSelectionInstanceReportParameters = null;

  private Object productTypeSelectionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productTypeSelectionInstanceReportRecord
  **/

  public Object getProductTypeSelectionInstanceReportRecord() {
    return productTypeSelectionInstanceReportRecord;
  }

  public void setProductTypeSelectionInstanceReportRecord(Object productTypeSelectionInstanceReportRecord) {
    this.productTypeSelectionInstanceReportRecord = productTypeSelectionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productTypeSelectionInstanceReportType
  **/

  public String getProductTypeSelectionInstanceReportType() {
    return productTypeSelectionInstanceReportType;
  }

  public void setProductTypeSelectionInstanceReportType(String productTypeSelectionInstanceReportType) {
    this.productTypeSelectionInstanceReportType = productTypeSelectionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productTypeSelectionInstanceReportParameters
  **/

  public String getProductTypeSelectionInstanceReportParameters() {
    return productTypeSelectionInstanceReportParameters;
  }

  public void setProductTypeSelectionInstanceReportParameters(String productTypeSelectionInstanceReportParameters) {
    this.productTypeSelectionInstanceReportParameters = productTypeSelectionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productTypeSelectionInstanceReport
  **/

  public Object getProductTypeSelectionInstanceReport() {
    return productTypeSelectionInstanceReport;
  }

  public void setProductTypeSelectionInstanceReport(Object productTypeSelectionInstanceReport) {
    this.productTypeSelectionInstanceReport = productTypeSelectionInstanceReport;
  }


}

