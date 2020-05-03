# init-microservice
Building a basic microservice with docker ,spring boot and mysql

Process to build this microservice 



Here the port of spring to be deployed has been changed in .properties file

Configure dockerfile

Package the project using 
<code>mvn package</code>

Build the Dockerfile using
    <code>docker build -f Dockerfile -t learningdocker</code>

This would create an image which can be seen by docker images

Now create a container of this image and link it to the mysql container by

    docker run -p 8085:8085 --name learningdocker --link mysql-standalone -d learningdocker
    
Now access the logs using <code>docker logs 'first 3 char of hash of container'</code>

Now access the application on port: <code>localhost:8085</code>
