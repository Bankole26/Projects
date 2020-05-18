## Rest-service
This project simply tests the endpoints of through the guise of a banking app that allow you to greet, create and delete Banking 
, while also allowing you too transfer and deposit money

### How to run from terminal:
Cd into project folder
type `./mvnw spring-boot:run`, this spins up the server that the
project is running on.
### How to test in Postman:
After the project is up and running Go to your post man app open a untitled request tab and choose which HTTP verb 
you would to try and paste the url of the server youre running / the endpoint youre testing?field your populating = value (note:The field 
youre populating has to be one of the arguments from youre original Java class methods)
```
GET  -   localhost:8080/allCustomers  - List<BankCustomers> (A list of Bank Customers)
POST  -   localhost:8080/bankCustomer - BankCustomer a = new BankCustomer(accNo, name, amount, accNo); (Creates a Bank Customer)
PUT  -   localhost:8080/depositAmount- Allows you to deposit money into an account
DELETE - localhost:8080/deleteBankCustomer - BankCustomer x = new BankCustomer(id, id, 0, id); (removes a bank customer from list)
```
