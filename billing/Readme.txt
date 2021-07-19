This project takes input string as request parameter and returns the Biller details whose BlrName starts with the given input string.

Constraints - If input string has leading spaces, then it will consider leading spaces while filtering the dataset

RequestType -> POST
RequestParam - > billerName (String)

Example

SampleRequestUrl -> localhost:8097/billing/customer/details?billerName=BSE

SampleResponseBody -> {
    "data": [
        {
            "BlrName": "BSES Rajdhani Power Limited",
            "AdhocPayment": 0,
            "BillerDescription": "",
            "BlrId": "BSESRAJPLDEL01",
            "BillerValue": "BSESRAJPLDEL01|0|0",
            "SupportBillValidation": "NOT_SUPPORTED",
            "BlrCatName": "Electricity",
            "BlrCatId": 3,
            "BillAcceptanceType": 0,
            "PaymentAmtExactness": "Exact"
        },
        {
            "BlrName": "BSES Yamuna Power Limited",
            "AdhocPayment": 0,
            "BillerDescription": "",
            "BlrId": "BSESYAMPLDEL01",
            "BillerValue": "BSESYAMPLDEL01|0|0",
            "SupportBillValidation": "NOT_SUPPORTED",
            "BlrCatName": "Electricity",
            "BlrCatId": 3,
            "BillAcceptanceType": 0,
            "PaymentAmtExactness": "Exact"
        }
    ],
    "status": true
}


One sample request and response screenshot is attached -> java_case_study_screenshot.png
