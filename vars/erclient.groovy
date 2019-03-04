#!/usr/bin/env groovy

def call(body) {
    echo "erclient.groovy ----------------"
    echo new Sample (5,10).toErClient()
    echo new Sample (5,10)
    return new Sample (5,10)
}
