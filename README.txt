#Project to create REST Apis using Spring Boot
## Steps to create rest api
1. Create project from Spring Initializer
2.Add artifacts ID , project name , description
3.Add dependency 'Spring-web' for creating rest apis
4. Add a model class in this case CloudUser
5.Add controller class for defining Rest api url mapping and add methods for request mapping
6. Add Get method request in ResApiService class then url will be used "http://localhost:8080/clouduser/I1" in browser to see
result is : {"userId":"I1","userName":"User one","userAddress":"Address one","userPhoneNumber":"xxxxxx"}
7. In the same way add method for post , put , delete request in api service class