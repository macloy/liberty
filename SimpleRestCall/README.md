
http://localhost:9080/
http://localhost:9080/index.html
http://localhost:9080/metrics/
http://localhost:9080/ibm/api/

We run the app in liberty dev mode and make some changes.
mvn liberty:dev

We add webapp/index.jsp and complete web.xml with the welcome-file.
 <welcome-file>index.jsp</welcome-file>   

The page call http://localhost:9080/index.jsp doesn't work.
OpenLiberty needs a new feature in server.xml
<feature>jsp-2.3</feature>

INFO: https://openliberty.io/docs/21.0.0.7/reference/feature/jsp-2.3.html
