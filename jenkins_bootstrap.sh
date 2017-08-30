#!/bin/bash
source jenkins-bootstrap-shared/jenkins_bootstrap.sh

#configure example credentials
jenkins_console --script "./scripts/credentials-example.groovy"
create_job --job-name "Jervis" --xml-data "./configs/job_jervis_config.xml"
jenkins_console -s ./scripts/disable-csrf-protection.groovy
jenkins_console -s ./scripts/make-jenkins-unsecure.groovy
