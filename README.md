# Mastering the Jenkins Script Console

This repository contains demo files of my presentation at Jenkins World 2017:
[Mastering the Jenkins Script Console][sched].

# Presentation Abstract

This interactive talk allows new users and seasoned experts alike to hone their
skills in mastering the Jenkins Script Console. It is the most powerful
interface Jenkins offers.

I will discuss steps users and admins can take in order to go about
understanding how to interact with the Jenkins Script Console. The talk will
involve:

- The role the Script Console plays with the Jenkins configuration.
- Recommendations on operationalizing a Jenkins installation for production use.
- How the Script Console can be used to configure Jenkins settings live, on an
  instance.
- Solid steps to take in order to get better at using the Script Console.
- Share additional resources which allow one to grow at using the Script Console
  further.

[sched]: http://sched.co/ALN9

# Requirements

- Mac OS X or Linux.
- More than two CPU cores recommended.
- More than 6GB of RAM recommended if running Jenkins.

# Getting Started

1. Bootstrap the demo.

   ```
   ./jenkins_bootstrap.sh
   ```

2. Visit `http://localhost:8080/` and follow along.

# Common gradle tasks

The following tasks would be executed with `./gradlew TASK`.  List of common
TASKs include:

- `clean` - cleans the build directory and all bootstrap related files.
- `buildRpm` - builds an RPM package for RHEL based Linux distros.
- `buildDeb` - builds a DEB package for Debian based Linux distros.
- `packages` - executes both `buildRpm` and `buildDeb` tasks.
- `getjenkins` - Downloads `jenkins.war` to the current directory.
- `getplugins` - Downloads Jenkins plugin HPI files to `./plugins`.

# Upgrade Jenkins and plugins

To upgrade Jenkins master and plugin versions do the following:

    ./jenkins_bootstrap.sh
    ./jenkins-bootstrap-shared/scripts/upgrade/upgrade_build_gradle.sh
    git add -A && git commit -m 'jenkins upgraded'

# Instructions

### Provision Jenkins

This repository uses [Vagrant][vagrant].  To bootstrap Jenkins simply run the
following to start Jenkins.

    vagrant up

Visit `http://localhost:8080/` to see Jenkins running.

### Build an RPM package

    ./gradlew clean buildRpm


# License

* [ASL 2](LICENSE)
* [3rd party licenses](3rd_party)

[vagrant]: https://www.vagrantup.com/
