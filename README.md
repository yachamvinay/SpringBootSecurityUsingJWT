# SpringBootSecurityUsingJWT

- This project is sample Contact Project using JWT Token based on Spring Boot Security.

    - In order to execute the project just import in STS or Eclipse.
    - And it will run in 8080 port number.
    - And then in order to test the Project you need to use Postman for evaluation purpose.
    - Open postman and then open a tab and mention the url as below
    
         **http://localhost:8080/authenticate**
    - Select raw and json as type and write body as below
    ```
    {
    "username":"techgeeknext",
    "password":"password"
    }
    ```
    - And after execute the above url in browser it will generate one Token and copy that token.
    - Open new tab in Postman and pass the param values as uname and password and give the url as below
    
        **http://localhost:8080/login**
    -If you gave the correcr credentials then it will give 200 OK as response.
    
    
