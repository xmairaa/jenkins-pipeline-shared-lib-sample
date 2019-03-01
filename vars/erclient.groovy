#!/usr/bin/env groovy

def call(body) {
    echo "erclient.groovy ----------------"
    return new Sample (5,10).toErClient()
}
