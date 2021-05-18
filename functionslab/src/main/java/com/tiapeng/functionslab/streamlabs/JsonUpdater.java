package com.tiapeng.functionslab.streamlabs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Iterator;

public class JsonUpdater {

    public static void updateStateModified(String json, boolean isStateModified) {

        json.replaceAll("'isStateModified': true", "'isStateModified': false");
        System.out.println(json);

        //Gson gson = new GsonBuilder().create();
        //JsonObject entityBOJsonObj = gson.fromJson(json, JsonObject.class);

        //entityBOJsonObj.getAsJsonArray()
        //JsonObject jsonObject = entityBOJsonObj.getAsJsonObject("isStateModified");
        //jsonObject.remove("isStateModified");
        //jsonObject.addProperty("isStateModified", isStateModified);


        /*Iterator iterator = entityBOJsonObj.keySet().iterator();
        String key = null;
        while (iterator.hasNext()) {
            key=(String)iterator.next();
            if(key.equals("isStateModified")) {
                JsonObject jsonObject = entityBOJsonObj.getAsJsonObject("isStateModified");
                jsonObject.remove("isStateModified");
                jsonObject.addProperty("isStateModified", isStateModified);

            }
        }*/

        //System.out.println(entityBOJsonObj.toString());

    }

    public static void main(String... args) throws Exception {
        String entityBo = "{'accounts':[{'accountNumber':1852322776254829164,'type':'BUSINESS','status':'OPEN','legalCountry':'JP','legalEntity':'JAPAN','tags':[],'userProperties':[],'riskFactor':{'riskFactorMap':{}},'riskModelScores':[],'accountToAccountRelationships':[],'accessPoints':[],'timeCreated':'Jan 21, 2014 6:07:32 PM','complianceStatus':{'scoreDetails':[],'attributes':[],'criterias':[],'factors':[],'levels':[{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ACCOUNT','id':101,'name':'CIP','complianceRegion':'JP','version':2,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:06 PM','timeCreated':'Jan 21, 2014 6:09:08 PM','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':true,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:06 PM'}],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ACCOUNT','id':124,'name':'TIP','complianceRegion':'ALL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ACCOUNT','id':45,'name':'KYC','complianceRegion':'JP','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ACCOUNT','id':48,'name':'EDD','complianceRegion':'JP','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ACCOUNT','id':126,'name':'FATCA','complianceRegion':'NON_US','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_ACCOUNT','id':1913,'name':'IRS_1099_K','complianceRegion':'GLOBAL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_ACCOUNT','id':1915,'name':'IRS_1099_K','complianceRegion':'GLOBAL','version':2,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_ACCOUNT','id':4010,'name':'CIP','complianceRegion':'JP','version':2,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_ACCOUNT','id':1710,'name':'FATCAIR','complianceRegion':'NON_US','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_ACCOUNT','id':2513,'name':'MANAGED_PATH_1099_K','complianceRegion':'GLOBAL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]}],'properties':[],'verificationDetails':[]},'layers':[],'productConfigs':[],'isPayPalVerified':false,'hasDataChanged':false,'complianceRegions':[],'temporaryIdentifier':false,'policies':{},'whiteListedPolicies':[],'accountProductBoList':[],'modifiedDataElements':[],'documentDetails':[]}],'parties':[{'id':124679,'type':'BUSINESS','tags':[],'names':[],'addresses':[],'phones':[],'emails':[],'urls':[],'documentDetails':[],'verifications':[],'userProperties':[],'riskFactor':{'riskFactorMap':{}},'businessDetails':{'businessName':[],'businessType':{'type':'CORPORATION'},'keywords':[],'trustInfo':{'trusts':[],'trustProperties':[]},'businessStakeHolderDeclarations':[],'businessProperties':[]},'partyToAccountRelationships':[{'accountNumber':1852322776254829164,'isActive':true,'entityType':'PAYPAL_PTA_RELATIONSHIP','userProperties':[],'documentDetails':[],'hasDataChanged':false,'complianceRegions':[],'riskFactor':{'riskFactorMap':{}}}],'partyToPartyRelationships':[],'complianceStatus':{'scoreDetails':[],'attributes':[],'criterias':[{'id':208,'name':'THIRD_PARTY_VERIFICATION','complianceRegion':'JP','action':'PAPER_DOCUMENT','actor':'THIRD_PARTY','mode':'FACE_TO_FACE','approvalAuthority':'THIRD_PARTY','version':2,'state':'COMPLETED','overrideAuthority':'THIRD_PARTY','lastUpdated':'Jan 21, 2014 6:09:59 PM','timeCompleted':'Jan 21, 2014 6:09:59 PM','vendorInfo':{'VendorId':'SOFTBANK','vendorName':'SOFTBANK','vendorCountry':'JP','vendorDescription':'Identity Verifier for Japan'},'isStateModified':true,'previousInteractionModified':false,'verificationDetails':[{'id':847,'address':[],'criterion':{'id':208,'state':'COMPLETED','isStateModified':false,'previousInteractionModified':false,'verificationDetails':[],'criteriaHistoryId':0,'verificationLogIds':[],'linkedEntities':[],'configurations':{},'criteriaHistories':[],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'auditLogDataElements':[]},'documentDetails':[],'name':[],'phone':[],'autoVerificationDetails':{'vendorResponseInfo':[]},'autoVerificationHistory':[],'verificationPhoneDetailsBO':[],'verificationAddressDetailsBO':[],'verificationDocumentDetailsBO':[],'businessVerificationsBO':[],'timeCreated':'Jan 21, 2014 6:09:59 PM'}],'verificationLogIds':[],'timeCreated':'Jan 21, 2014 6:09:59 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'COMPLETED','timeCreated':'Jan 21, 2014 6:09:59 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'auditLogDataElements':[]},{'id':209,'name':'BENEFICIAL_OWNER_DECLARATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'AUTOMATED','approvalAuthority':'NONE','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:55 PM','timeCompleted':'Jan 21, 2014 6:19:55 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:55 PM','timeCreated':'Jan 21, 2014 6:09:08 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:55 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':103,'name':'PROOF_OF_BIZ_REGISTRATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'MANUAL','approvalAuthority':'ADMIN','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:52 PM','timeCompleted':'Jan 21, 2014 6:19:52 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:52 PM','timeCreated':'Jan 21, 2014 6:09:08 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:52 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':104,'name':'ADDRESS_VERIFICATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'PIN','approvalAuthority':'SYSTEM','version':1,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:52 PM','vendorInfo':{'VendorId':'TOPPAN','vendorName':'Toppan','vendorCountry':'JP','vendorDescription':'Address Verifier for Japan'},'isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'timeCreated':'Jan 21, 2014 6:09:08 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:52 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]}],'factors':[],'levels':[{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ENTITY','id':102,'name':'CIP','complianceRegion':'JP','version':2,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:52 PM','timeCreated':'Jan 21, 2014 6:09:08 PM','currentStateTransitions':[],'criteria':[{'id':209,'name':'BENEFICIAL_OWNER_DECLARATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'AUTOMATED','approvalAuthority':'NONE','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:55 PM','timeCompleted':'Jan 21, 2014 6:19:55 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:55 PM','timeCreated':'Jan 21, 2014 6:09:08 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:55 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':104,'name':'ADDRESS_VERIFICATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'PIN','approvalAuthority':'SYSTEM','version':1,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:52 PM','vendorInfo':{'VendorId':'TOPPAN','vendorName':'Toppan','vendorCountry':'JP','vendorDescription':'Address Verifier for Japan'},'isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'timeCreated':'Jan 21, 2014 6:09:08 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:52 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':103,'name':'PROOF_OF_BIZ_REGISTRATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'MANUAL','approvalAuthority':'ADMIN','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:52 PM','timeCompleted':'Jan 21, 2014 6:19:52 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:52 PM','timeCreated':'Jan 21, 2014 6:09:08 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:52 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]}],'levelActions':[],'isStateModified':true,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:52 PM'}],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ENTITY','id':125,'name':'TIP','complianceRegion':'ALL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ENTITY','id':46,'name':'KYC','complianceRegion':'JP','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ENTITY','id':49,'name':'EDD','complianceRegion':'JP','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_BUSINESS_ENTITY','id':127,'name':'FATCA','complianceRegion':'NON_US','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':124679,'entityType':'PAYPAL_PARTY_BUSINESS','id':1917,'name':'IRS_1099_K','complianceRegion':'GLOBAL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':124679,'entityType':'PAYPAL_PARTY_BUSINESS','id':1918,'name':'IRS_1099_K','complianceRegion':'GLOBAL','version':2,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':124679,'entityType':'PAYPAL_PARTY_BUSINESS','id':4012,'name':'CIP','complianceRegion':'JP','version':2,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':124679,'entityType':'PAYPAL_PARTY_BUSINESS','id':1712,'name':'FATCAIR','complianceRegion':'NON_US','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':124679,'entityType':'PAYPAL_PARTY_BUSINESS','id':2515,'name':'MANAGED_PATH_1099_K','complianceRegion':'GLOBAL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]}],'properties':[],'verificationDetails':[]},'hasDataChanged':false,'deleted':false,'complianceRegions':[],'accessPoints':[],'whiteListedPolicies':[],'watchListScanDecisions':[],'modifiedDataElements':[],'pins':[{'pinEncrypted':'AwQSsKBkooVCDRbCHiFQLXP2mQ+KIfNUB9OaiooWkbfGQHLvKjPLzBh2JyaSzHc\\u003d','pinHmac':'f+2tskZMNbRCOdqSLhuGbQ\\u003d\\u003d','status':'GENERATED','tryCount':0,'resetCount':0,'timeCreated':'Jan 21, 2014 6:19:52 PM','timeUpdated':'Jan 21, 2014 6:19:52 PM','vendorReference':{'id':51,'vendorB0':{'VendorId':'TOPPAN','vendorName':'Toppan','vendorCountry':'JP','vendorDescription':'Address Verifier for Japan'},'processType':'BUSINESS_ADDRESS_VERIFICATION','vendorStatus':'ACTIVE','vendorReferenceId':'50f9c0a8-ff61-46fd-83a0-a3007b3b7920','timeCreated':'Jan 21, 2014 6:19:52 PM','lastUpdated':'Jan 21, 2014 6:19:52 PM','requiredEVRGeneration':false},'mailTrackingDetails':{'status':'GENERATED','dispatchErrorCodes':[],'timeCreated':'Jan 21, 2014 6:19:52 PM','timeUpdated':'Jan 21, 2014 6:19:52 PM'},'isStateModified':false}],'offlineVerificationDetails':[],'additionalDetails':[],'verificationTokens':[],'copyParties':[]},{'id':1852322776254829164,'type':'PERSON','tags':[],'names':[],'addresses':[],'phones':[],'emails':[],'urls':[],'documentDetails':[],'verifications':[],'userProperties':[],'riskFactor':{'riskFactorMap':{}},'partyToAccountRelationships':[{'accountNumber':1852322776254829164,'isActive':true,'entityType':'PAYPAL_PTA_RELATIONSHIP','userProperties':[],'documentDetails':[],'hasDataChanged':false,'complianceRegions':[],'riskFactor':{'riskFactorMap':{}}}],'partyToPartyRelationships':[],'complianceStatus':{'scoreDetails':[],'attributes':[],'criterias':[{'id':104,'name':'ADDRESS_VERIFICATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'PIN','approvalAuthority':'SYSTEM','version':1,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:08 PM','vendorInfo':{'VendorId':'TOPPAN','vendorName':'Toppan','vendorCountry':'JP','vendorDescription':'Address Verifier for Japan'},'isStateModified':true,'previousInteractionModified':false,'verificationDetails':[{'id':848,'address':[],'criterion':{'id':104,'state':'IN_PROGRESS','isStateModified':false,'previousInteractionModified':false,'verificationDetails':[],'criteriaHistoryId':0,'verificationLogIds':[],'linkedEntities':[],'configurations':{},'criteriaHistories':[],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'auditLogDataElements':[]},'documentDetails':[],'name':[],'phone':[],'autoVerificationDetails':{'vendorResponseInfo':[]},'autoVerificationHistory':[],'verificationPhoneDetailsBO':[],'verificationAddressDetailsBO':[],'verificationDocumentDetailsBO':[],'businessVerificationsBO':[],'timeCreated':'Jan 21, 2014 6:21:08 PM'}],'verificationLogIds':[],'timeCreated':'Jan 21, 2014 6:07:41 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:08 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:07:41 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':101,'name':'POA','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'MANUAL','approvalAuthority':'ADMIN','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:06 PM','timeCompleted':'Jan 21, 2014 6:19:06 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:06 PM','timeCreated':'Jan 21, 2014 6:07:41 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:06 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:07:41 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':102,'name':'PROOF_OF_NAME_AND_DOB','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'MANUAL','approvalAuthority':'ADMIN','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:08 PM','timeCompleted':'Jan 21, 2014 6:19:08 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:08 PM','timeCreated':'Jan 21, 2014 6:07:41 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:08 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:07:41 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]}],'factors':[],'levels':[{'entityID':1852322776254829164,'entityType':'PAYPAL_INDIVIDUAL_ACCOUNT','id':41,'name':'CIP','complianceRegion':'JP','version':1,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:06 PM','timeCreated':'Jan 21, 2014 6:07:41 PM','currentStateTransitions':[],'criteria':[{'id':104,'name':'ADDRESS_VERIFICATION','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'PIN','approvalAuthority':'SYSTEM','version':1,'state':'IN_PROGRESS','lastUpdated':'Jan 21, 2014 6:19:08 PM','vendorInfo':{'VendorId':'TOPPAN','vendorName':'Toppan','vendorCountry':'JP','vendorDescription':'Address Verifier for Japan'},'isStateModified':true,'previousInteractionModified':false,'verificationDetails':[{'id':848,'address':[],'criterion':{'id':104,'state':'IN_PROGRESS','isStateModified':false,'previousInteractionModified':false,'verificationDetails':[],'criteriaHistoryId':0,'verificationLogIds':[],'linkedEntities':[],'configurations':{},'criteriaHistories':[],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'auditLogDataElements':[]},'documentDetails':[],'name':[],'phone':[],'autoVerificationDetails':{'vendorResponseInfo':[]},'autoVerificationHistory':[],'verificationPhoneDetailsBO':[],'verificationAddressDetailsBO':[],'verificationDocumentDetailsBO':[],'businessVerificationsBO':[],'timeCreated':'Jan 21, 2014 6:21:08 PM'}],'verificationLogIds':[],'timeCreated':'Jan 21, 2014 6:07:41 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:08 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:07:41 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':101,'name':'POA','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'MANUAL','approvalAuthority':'ADMIN','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:06 PM','timeCompleted':'Jan 21, 2014 6:19:06 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:06 PM','timeCreated':'Jan 21, 2014 6:07:41 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:06 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:07:41 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]},{'id':102,'name':'PROOF_OF_NAME_AND_DOB','complianceRegion':'JP','action':'WEBFORM','actor':'USER','mode':'MANUAL','approvalAuthority':'ADMIN','version':1,'state':'COMPLETED','overridden':'Y','overrideAuthority':'ADMIN','lastUpdated':'Jan 21, 2014 6:19:08 PM','timeCompleted':'Jan 21, 2014 6:19:08 PM','isStateModified':true,'previousInteractionModified':false,'verificationDetails':[],'verificationLogIds':[],'lastOverridden':'Jan 21, 2014 6:19:08 PM','timeCreated':'Jan 21, 2014 6:07:41 PM','linkedEntities':[],'configurations':{},'criteriaHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'COMPLETED','overridden':'Y','timeCreated':'Jan 21, 2014 6:19:08 PM'}],'isActivatedAsDependentCriteria':false,'criterionTags':[],'currentStateTransitions':[],'editableStates':{},'criteriaMetadata':{},'isVerificationDetailsReset':false,'isAsyncVerification':false,'timeCreatedLevelCriterion':'Jan 21, 2014 6:07:41 PM','timeUpdatedLevelCriterion':'Jan 21, 2014 6:09:08 PM','auditLogDataElements':[]}],'levelActions':[],'isStateModified':true,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:07:41 PM'},{'id':0,'state':'NOT_INITIATED','timeCreated':'Jan 21, 2014 6:09:08 PM'},{'id':0,'state':'IN_PROGRESS','timeCreated':'Jan 21, 2014 6:19:06 PM'}],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_INDIVIDUAL_ACCOUNT','id':123,'name':'TIP','complianceRegion':'ALL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_INDIVIDUAL_ACCOUNT','id':44,'name':'KYC','complianceRegion':'JP','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_INDIVIDUAL_ACCOUNT','id':47,'name':'EDD','complianceRegion':'JP','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_PARTY_INDIVIDUAL','id':1914,'name':'IRS_1099_K','complianceRegion':'GLOBAL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_PARTY_INDIVIDUAL','id':1916,'name':'IRS_1099_K','complianceRegion':'GLOBAL','version':2,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_PARTY_INDIVIDUAL','id':4011,'name':'CIP','complianceRegion':'JP','version':2,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_PARTY_INDIVIDUAL','id':1711,'name':'FATCAIR','complianceRegion':'NON_US','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]},{'entityID':1852322776254829164,'entityType':'PAYPAL_PARTY_INDIVIDUAL','id':2514,'name':'MANAGED_PATH_1099_K','complianceRegion':'GLOBAL','version':1,'state':'NOT_AVAILABLE','currentStateTransitions':[],'criteria':[],'levelActions':[],'isStateModified':false,'previousInteractionModified':false,'requireActions':false,'complianceLevelActions':[],'levelHistories':[],'auditLogDataElements':[],'complianceRelationships':[]}],'properties':[],'verificationDetails':[]},'hasDataChanged':false,'deleted':false,'complianceRegions':[],'accessPoints':[],'whiteListedPolicies':[],'watchListScanDecisions':[],'modifiedDataElements':[],'pins':[{'pinEncrypted':'AgYJBrEFbJ7bvJqIXfCs7IdJtjpngzMBf63GvHwdq1KZJBJjANkeQKHfSYxHR+Y\\u003d','pinHmac':'dMhV234iZTr/N2M8kgXmfg\\u003d\\u003d','status':'SENT','tryCount':0,'resetCount':0,'expiryDate':'Mar 7, 2014 6:21:10 PM','timeCreated':'Jan 21, 2014 6:19:07 PM','timeUpdated':'Jan 21, 2014 6:21:10 PM','vendorReference':{'id':50,'vendorB0':{'VendorId':'TOPPAN','vendorName':'Toppan','vendorCountry':'JP','vendorDescription':'Address Verifier for Japan'},'processType':'INDIVIDUAL_ADDRESS_VERIFICATION','vendorStatus':'ACTIVE','vendorReferenceId':'0f0b9d4b-c778-4f77-819f-ee6e3e52896d','timeCreated':'Jan 21, 2014 6:19:07 PM','lastUpdated':'Jan 21, 2014 6:19:07 PM','requiredEVRGeneration':false},'mailTrackingDetails':{'status':'GENERATED','dispatchErrorCodes':[],'timeCreated':'Jan 21, 2014 6:19:07 PM','timeUpdated':'Jan 21, 2014 6:19:07 PM'},'isStateModified':false}],'offlineVerificationDetails':[],'additionalDetails':[],'verificationTokens':[],'copyParties':[]}]}";
        updateStateModified(entityBo, false);
    }
}
