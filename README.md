# notification

Request Example:
localhost:8080/v1/notification/template?module=sales

Response Example:
[
    {
        "id": 1,
        "template_name": "sales",
        "template_text": "get additional info by link $_link",
        "module": "sales",
        "is_active": true,
        "external_name": "sales_link_template"
    },
    {
        "id": 2,
        "template_name": "additional",
        "template_text": "your number is $_number",
        "module": "sales",
        "is_active": true,
        "external_name": "additional_template"
    }
]
