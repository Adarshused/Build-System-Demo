# Setup of Basic Gradle using Cli:

*Build systems such as **Gradle** automate the process of managing dependencies, compiling source code, loading required libraries, and converting the code into executable bytecode. They streamline the build process, handle project configuration, and ensure that applications can be built and run consistently across different environments.
In this document, I will explain what Gradle does behind the scenes and explore the various tasks it performs under the hood during the build and execution process.*
````agsl
gradle init --use-defaults --type java-application
````
The above command setup basic gradle project

````agsl
./gradlew build (mac/linux) or ./gradle.bat build (windows)
````
To prepare a jar which is executable, you need to setup manifest property in `build.gradle`
This Points out the main file from where to start executing
````

jar {
    manifest {
        attributes (
                'Main-Class' : 'org.example.Main'
        )
    }
}
````

The above command can build your project

````agsl
./gradlew jar
````

The above command creates a new jar file in  `build/libs` folder 
let it name be filename.jar

````agsl
java -jar build/libs/filename.jar
````

The above command executes the compiled jar file of the project