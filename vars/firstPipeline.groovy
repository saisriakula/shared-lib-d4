// pipeline + groovy
// import the Calculator class from com.i27academy.com

import com.i27academy.builds.Calculator 

// creating object/instance of the class called calulator created
Calculator calculator = new Calculator(this)
pipeline {
    agent any
    stages {
        stage('AdditionStage') {
            steps {
                script { // any groovy code can be implemented using script in a pipeline
                    echo "Printing sum of 2 numbers"
                    pritnln calculator.add(3,4)
                }
            }
        }
    }
}

