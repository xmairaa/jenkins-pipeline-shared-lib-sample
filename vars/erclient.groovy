#!/usr/bin/env groovy

def call(body) {
    echo "erclient.groovy ----------------"
    return return new Sample ().toErClient()
}
