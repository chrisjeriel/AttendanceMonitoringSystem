
module.exports = {
  storeLoginData: function(){
    var loginData = {
      transDate: "10/7/2016",
      officeCode: "00-00-123",
      userId: "BP153452",
      password: "12341234",
      idExpired: true,
      newlyInstalled: true
    }
    store.set("loginData", loginData);
  },


  storeUtilityInquiry: function(){
    var utilityInquiry = [
      {
        "userid" : "BP890082",
        "username" : "BPI BRANCH, STAFF",
        "designation" : "BRANCH USER",
        "logstat" : "LOGGED"
      },
      {
        "userid" : "BP890082",
        "username" : "BPI BRANCH, STAFF",
        "designation" : "BRANCH USER",
        "logstat" : "LOGGED"
      },
      {
        "userid" : "BP890082",
        "username" : "BPI BRANCH, STAFF",
        "designation" : "BRANCH USER",
        "logstat" : "LOGGED"
      },
      {
        "userid" : "BP890082",
        "username" : "BPI BRANCH, STAFF",
        "designation" : "BRANCH USER",
        "logstat" : "LOGGED"
      },
      {
        "userid" : "BP890082",
        "username" : "BPI BRANCH, STAFF",
        "designation" : "BRANCH USER",
        "logstat" : "LOGGED"
      }]
    store.set("utilityInquiry", utilityInquiry);
  },


  storeInviCodes: function(){
    var inviCodes = [
      {
        "codes" : "120201000 - LAND-BASED COMPENSATION"
      },

      {
        "codes" : "120202000 - SEA-BASED COMPENSATION INCOME"
      }
      ,

      {
        "codes" : "190152100 - FX AQUISITION FROM BANKS FOREX"
      }
      ,

      {
        "codes" : "210301000 - PERSONAL TRAVEL"
      }
      ,

      {
        "codes" : "210901000 - ROYALTIES AND LICENSE  FEES"
      }

    ]
    store.set("inviCodes", inviCodes);
  },






  storeInquiryRate: function(){
    var inquiryRate = [
      {
        "buyingRate" : "55.9800",
        "sellingRate" : "56.2200"
      },
      {
        "buyingRate" : "55.0912",
        "sellingRate" : "57.1212"
      },
      {
        "buyingRate" : "55.0000",
        "sellingRate" : "57.1212"
      },
      {
        "buyingRate" : "55.0000",
        "sellingRate" : "57.1212"
      }]
    store.set("inquiryRate", inquiryRate);
  },

  storeDownloadRefFiles: function(){
    var dlRefFiles = [

      {
        "tag" : "",
        "status" : "Updated",
        "date" : "10/7/2016",
        "time" : "9:00am",
        "description": "Amount Settings per Currency"
      },
      {
        "tag" : "",
        "status" : "Updated",
        "date" : "10/7/2016",
        "time" : "9:00am",
        "description": "Amount Settings per Currency"
      },
      {
        "tag" : "",
        "status" : "Updated",
        "date" : "10/7/2016",
        "time" : "9:00am",
        "description": "Amount Settings per Currency"
      },
      {
        "tag" : "",
        "status" : "Updated",
        "date" : "10/7/2016",
        "time" : "9:00am",
        "description": "Amount Settings per Currency"
      },
      {
        "tag" : "",
        "status" : "Updated",
        "date" : "10/7/2016",
        "time" : "9:00am",
        "description": "Amount Settings per Currency"
      }

    ]

    store.set("dlRefFiles", dlRefFiles);
  },

storeBulletinBoard: function(){
    var bulBoard = [
      {
        "message" : "PLEASE CALL BPI FOREX FOR SPECIAL RATES"
      }
    ]
    store.set("bulBoard", bulBoard);
  },

storeInquiryIssuedTC: function(){
      var inIssuedtTC = [
        {
          "incodes" : "3P020000125",
          "numb" : "5467821",
          "amnt" : "11,689.00",
          "lname": "ABC CORP"
        },
        {
          "incodes" : "3P020000125",
          "numb" : "5467821",
          "amnt" : "11,689.00",
          "lname": "ABC CORP"
        }
        ,
        {
          "incodes" : "3P020000125",
          "numb" : "5467821",
          "amnt" : "11,689.00",
          "lname": "ABC CORP"
        },
        {
          "incodes" : "3P020000125",
          "numb" : "5467821",
          "amnt" : "11,689.00",
          "lname": "ABC CORP"
        }
        ,
        {
          "incodes" : "3P020000125",
          "numb" : "5467821",
          "amnt" : "11,689.00",
          "lname": "ABC CORP"
        }
        ,
        {
          "incodes" : "3P020000125",
          "numb" : "5467821",
          "amnt" : "11,689.00",
          "lname": "ABC CORP"
        }
      ]
      store.set("inIssuedtTC", inIssuedtTC);
    },




  storeInquiryAcceptedTC: function(){
      var inAcceptTC = [
        {
          "incode" : "2P020000071",
          "from" : "USD",
          "num" : "1234567890",
          "amround" : "610.00",
          "amnt" : "610"
        },
        {
          "incode" : "2P020000071",
          "from" : "USD",
          "num" : "1234567890",
          "amround" : "610.00",
          "amnt" : "610"
        },
        {
          "incode" : "2P020000071",
          "from" : "USD",
          "num" : "1234567890",
          "amround" : "610.00",
          "amnt" : "610"
        },
        {
          "incode" : "2P020000071",
          "from" : "USD",
          "num" : "1234567890",
          "amround" : "610.00",
          "amnt" : "610"
        },
        {
          "incode" : "2P020000071",
          "from" : "USD",
          "num" : "1234567890",
          "amround" : "610.00",
          "amnt" : "610"
        }
      ]
      store.set("inAcceptTC", inAcceptTC);
    },




  storeInquiryIncomeTable: function(){
    var inquiryIncome = [
      {
        "regAmt"  : "90.00",
        "fcdAmt"  : "56.01"
      },
      {
        "regAmt"  : "54.01",
        "fcdAmt"  : "89.02"
      },
      {
        "regAmt"  : "32.02",
        "fcdAmt"  : "32.42"
      },
      {
        "regAmt"  : "45.12",
        "fcdAmt"  : "54.32"
      }]
    store.set("inquiryIncome", inquiryIncome);
  }
};
