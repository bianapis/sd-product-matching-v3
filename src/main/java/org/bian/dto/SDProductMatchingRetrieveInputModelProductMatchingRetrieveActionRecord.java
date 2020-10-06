package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis;
import org.bian.dto.SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecord
 */
public class SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecord   {
  private SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis productMatchingActivityAnalysis = null;

  private SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis productMatchingPerformanceAnalysis = null;

  private SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productMatchingActivityAnalysis
   * @return productMatchingActivityAnalysis
  **/

  public SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis getProductMatchingActivityAnalysis() {
    return productMatchingActivityAnalysis;
  }

  public void setProductMatchingActivityAnalysis(SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingActivityAnalysis productMatchingActivityAnalysis) {
    this.productMatchingActivityAnalysis = productMatchingActivityAnalysis;
  }


  /**
   * Get productMatchingPerformanceAnalysis
   * @return productMatchingPerformanceAnalysis
  **/

  public SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis getProductMatchingPerformanceAnalysis() {
    return productMatchingPerformanceAnalysis;
  }

  public void setProductMatchingPerformanceAnalysis(SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordProductMatchingPerformanceAnalysis productMatchingPerformanceAnalysis) {
    this.productMatchingPerformanceAnalysis = productMatchingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductMatchingRetrieveInputModelProductMatchingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

