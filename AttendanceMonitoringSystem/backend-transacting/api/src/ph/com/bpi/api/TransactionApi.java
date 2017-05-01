package ph.com.bpi.api;

import ph.com.bpi.model.*;
import ph.com.bpi.api.TransactionApiService;
import ph.com.bpi.api.factories.TransactionApiServiceFactory;

import io.swagger.annotations.ApiParam;

 

import ph.com.bpi.model.Failed;
import ph.com.bpi.model.Acceptedtclist;
import ph.com.bpi.model.Tclistprint;
import ph.com.bpi.model.Tclistprintinput;
import ph.com.bpi.model.BpiClient;
import ph.com.bpi.model.ErrorModel;
import ph.com.bpi.model.EquivalentAmtResult;
import ph.com.bpi.model.DataEntry;
import ph.com.bpi.model.ReferenceNumberSet;
import ph.com.bpi.model.TransactionCashAcceptanceSettlementDetails;
import ph.com.bpi.model.TransactionCashAcceptanceSettlementListItems;
import ph.com.bpi.model.InlineResponse2002;
import ph.com.bpi.model.CBGFXClientBody;
import ph.com.bpi.model.ObjectResponse;
import ph.com.bpi.model.CbgfxClientDetails;
import ph.com.bpi.model.CheckDepositAccountBody;
import ph.com.bpi.model.ComputedAmountsBody;
import ph.com.bpi.model.CurrencyCombination;
import ph.com.bpi.model.DailyDetailsBody;
import ph.com.bpi.model.DailyListBody;
import ph.com.bpi.model.Transactionlistsummary;
import ph.com.bpi.model.DataEntryBody;
import ph.com.bpi.model.DealRateBody;
import ph.com.bpi.model.DealRate;
import ph.com.bpi.model.InvisibleCode;
import ph.com.bpi.model.Issuedmclist;
import ph.com.bpi.model.TransactionSummary;
import ph.com.bpi.model.LocalOverrideBody;
import ph.com.bpi.model.MtsCode;
import ph.com.bpi.model.OverrideBody;
import ph.com.bpi.model.AcceptanceSettlementMode;
import ph.com.bpi.model.SpecialRequestDetailsBody;
import ph.com.bpi.model.SpecialRequestUpdateBody;

import java.util.List;
import ph.com.bpi.api.NotFoundException;

import java.io.InputStream;

 
 

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/transaction")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the transaction API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-08T10:25:28.975+08:00")
public class TransactionApi  {
   private final TransactionApiService delegate = TransactionApiServiceFactory.getTransactionApi();

    @GET
    @Path("/accepted-tc/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list of accepted TCs based on Trader", response = Acceptedtclist.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Acceptedtclist.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Acceptedtclist.class, responseContainer = "List") })

    public Response transactionAcceptedTcListGet(@ApiParam(value = "",required=true) @QueryParam("list_indc") String listIndc,@ApiParam(value = "",required=true) @QueryParam("trdr_fi") Integer trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_unit") String tranUnit,@ApiParam(value = "",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionAcceptedTcListGet(listIndc,trdrFi,tranUnit,refNmbr,proctag,securityContext);
    }
    @GET
    @Path("/accepted-tc/list/print")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list of invisible codes", response = Tclistprint.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Tclistprint.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Tclistprint.class, responseContainer = "List") })

    public Response transactionAcceptedTcListPrintGet(@ApiParam(value = "" ,required=true) Tclistprintinput tclistprintinput,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionAcceptedTcListPrintGet(tclistprintinput,securityContext);
    }
    @GET
    @Path("/bpiClient/{accountNumber}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns BPI Client short details. Account number as parameter.", response = BpiClient.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "BPI Client short details", response = BpiClient.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BpiClient.class) })

    public Response transactionBpiClientAccountNumberGet(@ApiParam(value = "",required=true) @PathParam("accountNumber") String accountNumber,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionBpiClientAccountNumberGet(accountNumber,securityContext);
    }
    @GET
    @Path("/btsu/getEquivalentAmt")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Calculates equivalent amount based on request rate", response = EquivalentAmtResult.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns gross equivalent amount, plus charges", response = EquivalentAmtResult.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = EquivalentAmtResult.class) })

    public Response transactionBtsuGetEquivalentAmtGet(@ApiParam(value = "Request Rate") @QueryParam("requestRate") Float requestRate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionBtsuGetEquivalentAmtGet(requestRate,securityContext);
    }
    @POST
    @Path("/btsu/purchase/dataEntry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Purchase Data Entry (Deal with BTSU). First Officer override facility should be entered first.", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Final Reference Number", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionBtsuPurchaseDataEntryPost(@ApiParam(value = "Data Entry Form" ,required=true) DataEntry dataEntry,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionBtsuPurchaseDataEntryPost(dataEntry,securityContext);
    }
    @POST
    @Path("/btsu/sale/dataEntry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Sale Data Entry (Deal with BTSU). First Officer override facility should be entered first.", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Temporary Reference Number", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionBtsuSaleDataEntryPost(@ApiParam(value = "Data Entry Form" ,required=true) DataEntry dataEntry,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionBtsuSaleDataEntryPost(dataEntry,securityContext);
    }
    @POST
    @Path("/btsu/sale/override")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "BTSU Sale Final Update on Override", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Final Reference Number", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionBtsuSaleOverridePost(@ApiParam(value = "Data Entry Form" ,required=true) DataEntry dataEntry,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionBtsuSaleOverridePost(dataEntry,securityContext);
    }
    @GET
    @Path("/cash-acceptance-or-settlement/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cash Acceptance/Settlement Transaction Details/Inquiry", response = TransactionCashAcceptanceSettlementDetails.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = TransactionCashAcceptanceSettlementDetails.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactionCashAcceptanceSettlementDetails.class, responseContainer = "List") })

    public Response transactionCashAcceptanceOrSettlementDetailsGet(@ApiParam(value = "",required=true, allowableValues="1, 2, 3") @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "Equivalent to office code",required=true) @QueryParam("brch_code") String brchCode,@ApiParam(value = "Currency code",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "",required=true, allowableValues="5") @QueryParam("inqy_type") String inqyType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCashAcceptanceOrSettlementDetailsGet(trdrFi,tranIndc,brchCode,currCode,refNmbr,inqyType,securityContext);
    }
    @GET
    @Path("/cash-acceptance-or-settlement/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cash Acceptance/Settlement Transaction Details/Inquiry", response = TransactionCashAcceptanceSettlementListItems.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = TransactionCashAcceptanceSettlementListItems.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactionCashAcceptanceSettlementListItems.class, responseContainer = "List") })

    public Response transactionCashAcceptanceOrSettlementListGet(@ApiParam(value = "Trading ___",required=true, allowableValues="1, 2, 3") @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "Equivalent to office code",required=true) @QueryParam("brch_code") String brchCode,@ApiParam(value = "Currency code",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "",required=true, allowableValues="3") @QueryParam("list_type") String listType,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCashAcceptanceOrSettlementListGet(trdrFi,tranIndc,brchCode,currCode,refNmbr,listType,proctag,securityContext);
    }
    @POST
    @Path("/cash-acceptance-or-settlement/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Final update on Cash Acceptance/Settlement", response = InlineResponse2002.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2002.class) })

    public Response transactionCashAcceptanceOrSettlementUpdatePost(@ApiParam(value = "Reference number",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "Acceptance teller Validation",required=true) @QueryParam("atel_vald") String atelVald,@ApiParam(value = "Settlement teller Validation",required=true) @QueryParam("stel_vald") String stelVald,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCashAcceptanceOrSettlementUpdatePost(refNmbr,atelVald,stelVald,securityContext);
    }
    @GET
    @Path("/cbgfx-client/search")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Account number is valid", notes = "Returns list of client with at least one processed transaction using the CBGFX system within 21 calendar days and uses the last name, first name, and middle name (though partial) as search queries", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionCbgfxClientSearchGet(@ApiParam(value = "The client to be searched" ,required=true) CBGFXClientBody cBGFXClientBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCbgfxClientSearchGet(cBGFXClientBody,securityContext);
    }
    @POST
    @Path("/cbgfxClient/search")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of CBG-FX clients. Client will be deleted on the list if there is no transaction made within 21 calendar days.\nPassing the client's surname (or a part of it) will narrow the search results.", response = CbgfxClientDetails.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of CBG-FX Clients", response = CbgfxClientDetails.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CbgfxClientDetails.class, responseContainer = "List") })

    public Response transactionCbgfxClientSearchPost(@ApiParam(value = "Client's surname") @QueryParam("surname") String surname,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCbgfxClientSearchPost(surname,securityContext);
    }
    @GET
    @Path("/check-deposit-account")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Check deposit account", notes = "Check deposit account", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionCheckDepositAccountGet(@ApiParam(value = "Check Deposit Account" ,required=true) CheckDepositAccountBody checkDepositAccount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCheckDepositAccountGet(checkDepositAccount,securityContext);
    }
    @GET
    @Path("/client-account-number/is-php")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Account number is PHP", notes = "Checks if client account number is PHP", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionClientAccountNumberIsPhpGet(@ApiParam(value = "Client account number",required=true) @QueryParam("clnt_acct") Integer clntAcct,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionClientAccountNumberIsPhpGet(clntAcct,securityContext);
    }
    @GET
    @Path("/client-account-number/validate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Account number is valid", notes = "Validates account number - Checks if account number is a BPI/BFB client and returns BPI client short details", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionClientAccountNumberValidateGet(@ApiParam(value = "Client account number",required=true) @QueryParam("clnt_acct") Integer clntAcct,@ApiParam(value = "Client amount currency",required=true) @QueryParam("curr_acct") Integer currAcct,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionClientAccountNumberValidateGet(clntAcct,currAcct,securityContext);
    }
    @GET
    @Path("/computed-amounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transaction Computed Amounts", notes = "Returns the computed amounts based on requested rate: equivalent amounts, docs stamps, commission and net amount", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionComputedAmountsGet(@ApiParam(value = "Computed Amounts" ,required=true) ComputedAmountsBody computedAmountsBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionComputedAmountsGet(computedAmountsBody,securityContext);
    }
    @GET
    @Path("/currency-combinations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Currency Combinations", notes = "Returns list of currency combination", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionCurrencyCombinationsGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCurrencyCombinationsGet(securityContext);
    }
    @GET
    @Path("/currencyCombinations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of currency combinations (ex, from USD to PHP, AUD to USD).", response = CurrencyCombination.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CurrencyCombination.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CurrencyCombination.class) })

    public Response transactionCurrencyCombinationsGet_1(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionCurrencyCombinationsGet_1(securityContext);
    }
    @POST
    @Path("/daily/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Daily transaction details", notes = "Returns details of a daily transaction", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error occured", response = ObjectResponse.class) })

    public Response transactionDailyDetailsPost(@ApiParam(value = "Daily details" ,required=true) DailyDetailsBody dailyDetailsBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionDailyDetailsPost(dailyDetailsBody,securityContext);
    }
    @GET
    @Path("/daily/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Daily transaction list", notes = "Returns list/summary of daily transactions", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionDailyListGet(@ApiParam(value = "Daily list" ,required=true) DailyListBody dailyListBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionDailyListGet(dailyListBody,securityContext);
    }
    @GET
    @Path("/daily/list-summary")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list summary of daily transactions based on trader, transaction indicator, and request type", response = Transactionlistsummary.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Transactionlistsummary.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Transactionlistsummary.class, responseContainer = "List") })

    public Response transactionDailyListSummaryGet(@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "",required=true) @QueryParam("trdr_fi") Integer trdrFi,@ApiParam(value = "",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "",required=true) @QueryParam("rqst_type") Integer rqstType,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionDailyListSummaryGet(tranIndc,trdrFi,refNmbr,rqstType,proctag,securityContext);
    }
    @POST
    @Path("/data_entry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transaction Data Entry", notes = "Data entry for all transaction indicators and trading modes combination", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionDataEntryPost(@ApiParam(value = "The transaction entry for a particular client" ,required=true) DataEntryBody dataEntryBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionDataEntryPost(dataEntryBody,securityContext);
    }
    @GET
    @Path("/deal-rate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transaction Deal Rate", notes = "Returns deal rate", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionDealRateGet(@ApiParam(value = "Deal rate" ,required=true) DealRateBody dealRateBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionDealRateGet(dealRateBody,securityContext);
    }
    @GET
    @Path("/dealRate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Requests for the Deal Rate. Requires source and destination currency.", response = DealRate.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Deal Rate", response = DealRate.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = DealRate.class) })

    public Response transactionDealRateGet_2(@ApiParam(value = "Source currency abbreviation (ex: PHP, USD)",required=true) @QueryParam("fromCurrency") String fromCurrency,@ApiParam(value = "Destination currency abbreviation (ex: PHP, USD)",required=true) @QueryParam("toCurrency") String toCurrency,@ApiParam(value = "Transaction Mode (FOREX,BTSU, TMU)", allowableValues="FOREX, BTSU, TMU") @QueryParam("mode") String mode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionDealRateGet_2(fromCurrency,toCurrency,mode,securityContext);
    }
    @POST
    @Path("/forex/purchase/dataEntry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Saves new Purchase Data Entry\nDeal Rate and Request Rate is the same, and will also be re-calculated in the backend for verification.", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Data entry form save success", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionForexPurchaseDataEntryPost(@ApiParam(value = "Data entry form" ,required=true) DataEntry dataEntryForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionForexPurchaseDataEntryPost(dataEntryForm,securityContext);
    }
    @POST
    @Path("/forex/purchase/finalUpdate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Final Update for Forex", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Data entry form save success", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionForexPurchaseFinalUpdatePost(@ApiParam(value = "Data entry form" ,required=true) DataEntry dataEntryForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionForexPurchaseFinalUpdatePost(dataEntryForm,securityContext);
    }
    @POST
    @Path("/forex/sale/cashAcceptance")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Forex Sale Final Update on Cash Acceptance/Settlement.\nRequires Teller Validation and Officer Overrides", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Data entry form save success", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionForexSaleCashAcceptancePost(@ApiParam(value = "Data entry form" ,required=true) DataEntry dataEntryForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionForexSaleCashAcceptancePost(dataEntryForm,securityContext);
    }
    @POST
    @Path("/forex/sale/dataEntry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Saves new Sale Data Entry\nDeal Rate and Request Rate is the same, and will also be re-calculated in the backend for verification.", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Data entry form save success", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionForexSaleDataEntryPost(@ApiParam(value = "Data entry form" ,required=true) DataEntry dataEntryForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionForexSaleDataEntryPost(dataEntryForm,securityContext);
    }
    @POST
    @Path("/forex/sale/override")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Forex Sale Final Update on Override.", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Data entry form save success", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionForexSaleOverridePost(@ApiParam(value = "Data entry form" ,required=true) DataEntry dataEntryForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionForexSaleOverridePost(dataEntryForm,securityContext);
    }
    @GET
    @Path("/invisibleCodes/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of invisible codes, specified by transaction type (FOREX, BTSU, MTU). If no transaction type specified, all invisible codes will be returned.", response = InvisibleCode.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of Invisible codes", response = InvisibleCode.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = InvisibleCode.class, responseContainer = "List") })

    public Response transactionInvisibleCodesListGet(@ApiParam(value = "", allowableValues="forex, btsu, mtu") @QueryParam("transactionType") String transactionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionInvisibleCodesListGet(transactionType,securityContext);
    }
    @GET
    @Path("/issued-mc/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns list of Issued MCs based on Trader", response = Issuedmclist.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Issuedmclist.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "error", response = Issuedmclist.class, responseContainer = "List") })

    public Response transactionIssuedMcListGet(@ApiParam(value = "",required=true) @QueryParam("trdr_fi") Integer trdrFi,@ApiParam(value = "",required=true) @QueryParam("tran_unit") String tranUnit,@ApiParam(value = "",required=true) @QueryParam("mc_serno") String mcSerno,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionIssuedMcListGet(trdrFi,tranUnit,mcSerno,proctag,securityContext);
    }
    @GET
    @Path("/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of transactions by reference number (temporary or final, for verification), specified by transaction type.\nReturns all transactions if referenceNo is empty.\nIf isCorrected is specified, list will be filtered according to value", response = TransactionSummary.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of transactions.", response = TransactionSummary.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactionSummary.class, responseContainer = "List") })

    public Response transactionListGet(@ApiParam(value = "",required=true, allowableValues="forex_purchase, forex_sale, btsu_purchase, btsu_sale, tmu_purchase, tmu_sale") @QueryParam("transactionType") String transactionType,@ApiParam(value = "") @QueryParam("referenceNo") String referenceNo,@ApiParam(value = "Checks if the transaction details are corrected/changed") @QueryParam("isCorrected") Boolean isCorrected,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionListGet(transactionType,referenceNo,isCorrected,securityContext);
    }
    @POST
    @Path("/local-override")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Trasaction local override", notes = "Performs transacting local override", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionLocalOverridePost(@ApiParam(value = "Local Override" ,required=true) LocalOverrideBody localOverride,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionLocalOverridePost(localOverride,securityContext);
    }
    @GET
    @Path("/mc-settlement/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "MC Settlment Transaction Details/Inquiry", response = TransactionCashAcceptanceSettlementDetails.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = TransactionCashAcceptanceSettlementDetails.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactionCashAcceptanceSettlementDetails.class, responseContainer = "List") })

    public Response transactionMcSettlementDetailsGet(@ApiParam(value = "",required=true, allowableValues="1, 2, 3") @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "Equivalent to office code",required=true) @QueryParam("brch_code") String brchCode,@ApiParam(value = "Currency code",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "",required=true, allowableValues="6") @QueryParam("inqy_type") String inqyType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionMcSettlementDetailsGet(trdrFi,tranIndc,brchCode,currCode,refNmbr,inqyType,securityContext);
    }
    @GET
    @Path("/mc-settlement/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "MC Settlement Transaction List", response = TransactionCashAcceptanceSettlementListItems.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = TransactionCashAcceptanceSettlementListItems.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = TransactionCashAcceptanceSettlementListItems.class, responseContainer = "List") })

    public Response transactionMcSettlementListGet(@ApiParam(value = "Trading ___",required=true, allowableValues="1, 2, 3") @QueryParam("trdr_fi") String trdrFi,@ApiParam(value = "",required=true, allowableValues="P, S") @QueryParam("tran_indc") String tranIndc,@ApiParam(value = "Equivalent to office code",required=true) @QueryParam("brch_code") String brchCode,@ApiParam(value = "Currency code",required=true) @QueryParam("curr_code") String currCode,@ApiParam(value = "",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "",required=true, allowableValues="4") @QueryParam("list_type") String listType,@ApiParam(value = "",required=true) @QueryParam("proctag") String proctag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionMcSettlementListGet(trdrFi,tranIndc,brchCode,currCode,refNmbr,listType,proctag,securityContext);
    }
    @POST
    @Path("/mc-settlement/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Final update on MC Settlement", response = InlineResponse2002.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print operation result", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = InlineResponse2002.class) })

    public Response transactionMcSettlementUpdatePost(@ApiParam(value = "Reference number",required=true) @QueryParam("ref_nmbr") String refNmbr,@ApiParam(value = "MC settlement number",required=true) @QueryParam("mc_nmbr") String mcNmbr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionMcSettlementUpdatePost(refNmbr,mcNmbr,securityContext);
    }
    @POST
    @Path("/mcSettlement")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "MC Settlement for TMU Purchase transactions", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "MC Settlement Result", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionMcSettlementPost(@ApiParam(value = "",required=true) @QueryParam("referenceNo") String referenceNo,@ApiParam(value = "",required=true) @QueryParam("mcNumber") String mcNumber,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionMcSettlementPost(referenceNo,mcNumber,securityContext);
    }
    @GET
    @Path("/mtsCodes/{mtsType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of MTS/Reference codes.", response = MtsCode.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of MTS/Reference Codes", response = MtsCode.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = MtsCode.class) })

    public Response transactionMtsCodesMtsTypeGet(@ApiParam(value = "",required=true, allowableValues="acceptance, settlement") @PathParam("mtsType") String mtsType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionMtsCodesMtsTypeGet(mtsType,securityContext);
    }
    @GET
    @Path("/or/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transaction OR details", notes = "Get OR/Transaction Advice details", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionOrDetailsGet(@ApiParam(value = "Reference Number",required=true) @QueryParam("ref_nmbr") String refNmbr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionOrDetailsGet(refNmbr,securityContext);
    }
    @GET
    @Path("/override/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Override details", notes = "Override Transaction Details/Inquiry", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionOverrideDetailsGet(@ApiParam(value = "Override details" ) OverrideBody overrideBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionOverrideDetailsGet(overrideBody,securityContext);
    }
    @GET
    @Path("/override/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Override list", notes = "Override Transaction List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionOverrideListGet(@ApiParam(value = "Override details" ) OverrideBody overrideBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionOverrideListGet(overrideBody,securityContext);
    }
    @POST
    @Path("/override/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Override update", notes = "Final update on Override", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionOverrideUpdatePost(@ApiParam(value = "Reference number") @QueryParam("ref_nmbr") String refNmbr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionOverrideUpdatePost(refNmbr,securityContext);
    }
    @POST
    @Path("/printAdvice/{referenceNo}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Prints transaction advice specified by reference number", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Print transaction advice result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response transactionPrintAdviceReferenceNoPost(@ApiParam(value = "Transaction reference number. (Temporary and Final)",required=true) @PathParam("referenceNo") String referenceNo,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionPrintAdviceReferenceNoPost(referenceNo,securityContext);
    }
    @GET
    @Path("/settlementCodes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a list of Acceptance-Settlement Mode pairs.", response = AcceptanceSettlementMode.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AcceptanceSettlementMode.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AcceptanceSettlementMode.class) })

    public Response transactionSettlementCodesGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionSettlementCodesGet(securityContext);
    }
    @GET
    @Path("/special-request/details")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transaction Special Request details", notes = "Special Request Transaction Details/Inquiry", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionSpecialRequestDetailsGet(@ApiParam(value = "Special Request Details" ) SpecialRequestDetailsBody specialRequestDetailsBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionSpecialRequestDetailsGet(specialRequestDetailsBody,securityContext);
    }
    @GET
    @Path("/special-request/list")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transaction Special Request list", notes = "Special Request Transaction List", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionSpecialRequestListGet(@ApiParam(value = "Special Request" ) SpecialRequestDetailsBody specialRequestDetailsBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionSpecialRequestListGet(specialRequestDetailsBody,securityContext);
    }
    @POST
    @Path("/special-request/update")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Special request update", notes = "Final update on Special request", response = ObjectResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The response", response = ObjectResponse.class) })

    public Response transactionSpecialRequestUpdatePost(@ApiParam(value = "Special Request update" ) SpecialRequestUpdateBody specialRequestUpdateBody,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionSpecialRequestUpdatePost(specialRequestUpdateBody,securityContext);
    }
    @POST
    @Path("/tellerValidation/{referenceNo}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Submits teller's acceptance and settlement validation codes. First officer override should be called first", response = ErrorModel.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Teller validation result", response = ErrorModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ErrorModel.class) })

    public Response transactionTellerValidationReferenceNoPost(@ApiParam(value = "",required=true) @PathParam("referenceNo") String referenceNo,@ApiParam(value = "Teller's acceptance validation code. Should be Teller ID + Session #",required=true) @QueryParam("acceptanceValidationCode") String acceptanceValidationCode,@ApiParam(value = "Teller's settlement validation code. Should be Teller ID + Session #",required=true) @QueryParam("settlementValidationCode") String settlementValidationCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionTellerValidationReferenceNoPost(referenceNo,acceptanceValidationCode,settlementValidationCode,securityContext);
    }
    @POST
    @Path("/tmu/purchase/dataEntry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Purchase Data Entry (Deal with TMU)", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Temporary Reference Number", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionTmuPurchaseDataEntryPost(@ApiParam(value = "Data Entry Form" ,required=true) DataEntry tmuForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionTmuPurchaseDataEntryPost(tmuForm,securityContext);
    }
    @POST
    @Path("/tmu/sale/dataEntry")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Sale Data Entry (Deal with TMU). First Office Override is required", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Temporary Reference Number", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionTmuSaleDataEntryPost(@ApiParam(value = "Data Entry Form" ,required=true) DataEntry tmuForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionTmuSaleDataEntryPost(tmuForm,securityContext);
    }
    @POST
    @Path("/tmu/sale/specialRequest")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Sale Data Entry (Deal with TMU). First Office Override is required", response = ReferenceNumberSet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Final Reference Number", response = ReferenceNumberSet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = ReferenceNumberSet.class) })

    public Response transactionTmuSaleSpecialRequestPost(@ApiParam(value = "Data Entry Form" ,required=true) DataEntry tmuForm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionTmuSaleSpecialRequestPost(tmuForm,securityContext);
    }
    @GET
    @Path("/{referenceNo}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns complete transaction details specified by reference number", response = DataEntry.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Transaction details", response = DataEntry.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = DataEntry.class) })

    public Response transactionReferenceNoGet(@ApiParam(value = "",required=true) @PathParam("referenceNo") String referenceNo,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transactionReferenceNoGet(referenceNo,securityContext);
    }
}
