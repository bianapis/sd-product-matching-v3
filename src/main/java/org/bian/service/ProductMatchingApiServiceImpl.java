/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductMatchingApiServiceImpl implements ProductMatchingApiService {

	public SDProductMatchingActivateOutputModel activate(SDProductMatchingActivateInputModel request){
		return JsonReader.read("activate-SDProductMatchingActivateOutputModel.json",new TypeReference<SDProductMatchingActivateOutputModel>(){});
	}
	
	public SDProductMatchingConfigureOutputModel configure(String sdReferenceId, SDProductMatchingConfigureInputModel request){
		return JsonReader.read("configure-SDProductMatchingConfigureOutputModel.json",new TypeReference<SDProductMatchingConfigureOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRProductCustomerCombinationAssessmentExchangeOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentExchangeOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRProductCustomerCombinationAssessmentExecuteOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentExecuteOutputModel>(){});
	}
	
	public SDProductMatchingFeedbackOutputModel feedback(String sdReferenceId, SDProductMatchingFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductMatchingFeedbackOutputModel.json",new TypeReference<SDProductMatchingFeedbackOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRProductCustomerCombinationAssessmentGrantOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentGrantOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentInitiateOutputModel initiate(String sdReferenceId, CRProductCustomerCombinationAssessmentInitiateInputModel request){
		return JsonReader.read("initiate-CRProductCustomerCombinationAssessmentInitiateOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentInitiateOutputModel>(){});
	}
	
	public BQBankandCampaignAlignmentInitiateOutputModel initiateBankandcampaignalignment(String sdReferenceId, String crReferenceId, BQBankandCampaignAlignmentInitiateInputModel request){
		return JsonReader.read("initiate-BQBankandCampaignAlignmentInitiateOutputModel.json",new TypeReference<BQBankandCampaignAlignmentInitiateOutputModel>(){});
	}
	
	public BQContextCriteriaInitiateOutputModel initiateContextcriteria(String sdReferenceId, String crReferenceId, BQContextCriteriaInitiateInputModel request){
		return JsonReader.read("initiate-BQContextCriteriaInitiateOutputModel.json",new TypeReference<BQContextCriteriaInitiateOutputModel>(){});
	}
	
	public BQProductEligibilityInitiateOutputModel initiateProducteligibility(String sdReferenceId, String crReferenceId, BQProductEligibilityInitiateInputModel request){
		return JsonReader.read("initiate-BQProductEligibilityInitiateOutputModel.json",new TypeReference<BQProductEligibilityInitiateOutputModel>(){});
	}
	
	public BQProductTypeSelectionInitiateOutputModel initiateProducttypeselection(String sdReferenceId, String crReferenceId, BQProductTypeSelectionInitiateInputModel request){
		return JsonReader.read("initiate-BQProductTypeSelectionInitiateOutputModel.json",new TypeReference<BQProductTypeSelectionInitiateOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentRequestInputModel request){
		return JsonReader.read("request-CRProductCustomerCombinationAssessmentRequestOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentRequestOutputModel>(){});
	}
	
	public BQBankandCampaignAlignmentRetrieveOutputModel retrieveBankandcampaignalignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBankandCampaignAlignmentRetrieveOutputModel.json",new TypeReference<BQBankandCampaignAlignmentRetrieveOutputModel>(){});
	}
	
	public BQContextCriteriaRetrieveOutputModel retrieveContextcriteria(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQContextCriteriaRetrieveOutputModel.json",new TypeReference<BQContextCriteriaRetrieveOutputModel>(){});
	}
	
	public BQProductEligibilityRetrieveOutputModel retrieveProducteligibility(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductEligibilityRetrieveOutputModel.json",new TypeReference<BQProductEligibilityRetrieveOutputModel>(){});
	}
	
	public BQProductTypeSelectionRetrieveOutputModel retrieveProducttypeselection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductTypeSelectionRetrieveOutputModel.json",new TypeReference<BQProductTypeSelectionRetrieveOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductCustomerCombinationAssessmentRetrieveOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductMatchingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductMatchingRetrieveOutputModel.json",new TypeReference<SDProductMatchingRetrieveOutputModel>(){});
	}
	
	public CRProductCustomerCombinationAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductCustomerCombinationAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRProductCustomerCombinationAssessmentUpdateOutputModel.json",new TypeReference<CRProductCustomerCombinationAssessmentUpdateOutputModel>(){});
	}
	
	public BQBankandCampaignAlignmentUpdateOutputModel updateBankandcampaignalignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBankandCampaignAlignmentUpdateInputModel request){
		return JsonReader.read("update-BQBankandCampaignAlignmentUpdateOutputModel.json",new TypeReference<BQBankandCampaignAlignmentUpdateOutputModel>(){});
	}
	
	public BQContextCriteriaUpdateOutputModel updateContextcriteria(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContextCriteriaUpdateInputModel request){
		return JsonReader.read("update-BQContextCriteriaUpdateOutputModel.json",new TypeReference<BQContextCriteriaUpdateOutputModel>(){});
	}
	
	public BQProductEligibilityUpdateOutputModel updateProducteligibility(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductEligibilityUpdateInputModel request){
		return JsonReader.read("update-BQProductEligibilityUpdateOutputModel.json",new TypeReference<BQProductEligibilityUpdateOutputModel>(){});
	}
	
	public BQProductTypeSelectionUpdateOutputModel updateProducttypeselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductTypeSelectionUpdateInputModel request){
		return JsonReader.read("update-BQProductTypeSelectionUpdateOutputModel.json",new TypeReference<BQProductTypeSelectionUpdateOutputModel>(){});
	}
	
}
