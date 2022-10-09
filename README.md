# notification

Request Example:
localhost:8080/v1/notification/template?module=sales

Response Example:
[
    {
        "id": 1,
        "templateName": "sales",
        "templateText": "get additional info by link $_link",
        "externalName": "sales_link_template"
    },
    {
        "id": 2,
        "templateName": "additional",
        "templateText": "your number is $_number",
        "externalName": "additional_template"
    }
]
