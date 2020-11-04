# Nov3-API-Building-Skills-using-Java-kelvin

## INSTRUCTIONS
Create a new github repo for each assignment received. Repo must live in yourorganization github account.
On the repository settings page, add group "review-team" to your repositoryaccess settings.
Focus on committing clean code.https://blog.gojekengineering.com/the-basics-of-writing-clean-code-39ed770b626d
Clarity of code and readability must be adhered to.- Name of repository must be Date - Name of Assignment 
Your First Name- For each assignment, you're required to submit unit tests for everyaction/method created wherever necessary.
WEDNESDAY 3RD NOVEMBER, 2020- API Building Skills using Java  The focus of this assignment is to test your API development skills.
You’re to buildthis using Java and Spring Boot. Use the organization’s pluralsight account if youneed to learn more about Spring Boot development.
Premise:As part of its enforcement efforts, OFAC publishes a list of individuals andcompanies owned or controlled by, or
acting for or on behalf of, targetedcountries. These lists of individuals are sanctioned individuals that our clients maynot want to do business with.https://www.treasury.gov/ofac/downloads/sdn.xmlThe XML list above provides an XML list of OFAC consolidated sanctionedindividuals.

## Instructions
Build an API with Spring Boot that fetches this XML list at 12AM daily-Save this list to a Postgres database table for each individual entry
Create an API endpoint to return a list of these individuals. This APIendpoint must be paginated i.e. 
should accept skip and limit parametersused to query the database for a particular page and size.
Notables:-Truncate postgres table whenever the list is updated daily. This is so that wecan always keep an updated version of the SDN list
