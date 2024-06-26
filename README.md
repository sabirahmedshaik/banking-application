<h2>REST APIs Banking Application using Spring Boot</h2>

Rest Client should be able to:
<ol>
  <li>Create a new bank account</li>
  <li>Fetch the account details</li>
  <li>Make a deposit</li>
  <li>Make a withdrawal</li>
</ol>

REST APIs for Account Resource:

|  HTTP Method  |           URL Path         |  Status Code  |           Description            |
| :-------------|:---------------------------| :-------------| :--------------------------------|
| Get           | /api/accounts/{id}         |  200 (OK)     | Get the account details by id    |
| Post          | /api/accounts              |  201 (Created)| Create a new bank account        |
| Post          | /api/accounts/{id}/deposit |  200 (OK)     | Make a deposit                   |
| Post          | /api/accounts/{id}/withdraw|  200 (OK)     | Make a withdraw                  |
