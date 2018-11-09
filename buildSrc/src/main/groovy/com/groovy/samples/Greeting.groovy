package com.groovy.samples

/**
 * Created by amol on 09-Nov-18.
 */
class Greeting {
    String message
    String recipient

    void sayGreeting() {
        println "${message}, ${recipient}!"
    }
}