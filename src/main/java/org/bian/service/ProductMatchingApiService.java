/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductMatchingApiService {

	SDProductMatchingActivateOutputModel activate(SDProductMatchingActivateInputModel request);
	
	SDProductMatchingConfigureOutputModel configure(String sdReferenceId, SDProductMatchingConfigureInputModel request);
	
	CRProductCustomerCombinationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentExchangeInputModel request);
	
	CRProductCustomerCombinationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentExecuteInputModel request);
	
	SDProductMatchingFeedbackOutputModel feedback(String sdReferenceId, SDProductMatchingFeedbackInputModel request);
	
	CRProductCustomerCombinationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentGrantInputModel request);
	
	CRProductCustomerCombinationAssessmentInitiateOutputModel initiate(String sdReferenceId, CRProductCustomerCombinationAssessmentInitiateInputModel request);
	
	BQBankandCampaignAlignmentInitiateOutputModel initiateBankandcampaignalignment(String sdReferenceId, String crReferenceId, BQBankandCampaignAlignmentInitiateInputModel request);
	
	BQContextCriteriaInitiateOutputModel initiateContextcriteria(String sdReferenceId, String crReferenceId, BQContextCriteriaInitiateInputModel request);
	
	BQProductEligibilityInitiateOutputModel initiateProducteligibility(String sdReferenceId, String crReferenceId, BQProductEligibilityInitiateInputModel request);
	
	BQProductTypeSelectionInitiateOutputModel initiateProducttypeselection(String sdReferenceId, String crReferenceId, BQProductTypeSelectionInitiateInputModel request);
	
	CRProductCustomerCombinationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentRequestInputModel request);
	
	BQBankandCampaignAlignmentRetrieveOutputModel retrieveBankandcampaignalignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQContextCriteriaRetrieveOutputModel retrieveContextcriteria(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductEligibilityRetrieveOutputModel retrieveProducteligibility(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductTypeSelectionRetrieveOutputModel retrieveProducttypeselection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRProductCustomerCombinationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductMatchingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductCustomerCombinationAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentUpdateInputModel request);
	
	BQBankandCampaignAlignmentUpdateOutputModel updateBankandcampaignalignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankandCampaignAlignmentUpdateInputModel request);
	
	BQContextCriteriaUpdateOutputModel updateContextcriteria(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContextCriteriaUpdateInputModel request);
	
	BQProductEligibilityUpdateOutputModel updateProducteligibility(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductEligibilityUpdateInputModel request);
	
	BQProductTypeSelectionUpdateOutputModel updateProducttypeselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductTypeSelectionUpdateInputModel request);
	
}
