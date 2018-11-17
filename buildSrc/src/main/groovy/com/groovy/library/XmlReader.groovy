package com.groovy.library

class XmlReader {
    void ReadXml(def fileName){
        def file = new File("/home/hduser/AmolStudy/Groovy/GroovyTutorial/Student.xml")

        println(file.exists())

        def slurper = new XmlSlurper()

        def slurperDoc  = slurper.parse(file)

        println slurperDoc.Student.each {}
    }
}
