# javaee jax-rs REST API exmaple 

## Build and run
maven build with goal `clean package` -> generates jax_rs.war file in target folder

run on server -> tested on tomcat 8.0 

Open follwoing URL from browser or REST client -> `http://localhost:8080/jax_rs/rest/hello/`

## Host on IBM Bluemix 
`cf push api-jaxrs-sanket -p target/jax_rs.war -b java_buildpack`

## Output
API 01

	* Maps to REST API http://localhost:8080/jax_rs/rest/hello/world
	* @return Plan Text "Hello World from Javaee_JAX-RS"
	* @see http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
	* @see http://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson

API 02

	* Maps to REST API http://localhost:8080/jax_rs/rest/operate/add/51/67
	* @return JSON Object { "imeplementation": "Javaee_JAX-RS","result": "118" }
	* 

**APIs on bluemix**
- http://api-jaxrs-sanket.mybluemix.net/rest/hello/world
- http://api-jaxrs-sanket.mybluemix.net/rest/operate/add/34534/45
- http://api-jaxrs-sanket.mybluemix.net/rest/swagger.json

## Swagger
- run on server for swagger JSON: http://localhost:8080/jax_rs/rest/swagger.json
- yaml: http://localhost:8080/jax_rs/rest/swagger.yaml 

Point your swagger UI dist/index.html to this swagger.json to see the documentation

Referred from https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5

**How to integrate swagger with jax-rs:** http://stackoverflow.com/a/35905415/5076414

An alternate way: http://stackoverflow.com/a/35905560/5076414

## References anfd Tips

**How to extracot Application URL of the cloud foundry application from CF_APPLICATION:** https://github.com/IBMDecisionOptimization/DOcloud-GreenTruck-sample/blob/master/src/main/java/com/ibm/optim/oaas/sample/Environment.java

**Access Control Origin Error in Swagger UI:** Download "CORS Anyehere" add on in firefox. Customize your menu to show the button for CORS and turn it on (Green).


